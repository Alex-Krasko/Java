import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        // undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        // undergroundSystem.checkOut(32, "Cambridge", 22);
        // undergroundSystem.getAverageTime("Paradise", "Cambridge");
        // undergroundSystem.getAverageTime("Leyton", "Waterloo");
        undergroundSystem.checkIn(10, "Leyton", 24);
        // undergroundSystem.getAverageTime("Leyton", "Waterloo");
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        // System.out.println(undergroundSystem.getAverageTime("Paradise",
        // "Cambridge"));
    }

    Map<Integer, String> Stations;
    Map<Integer, Integer> Times;
    Map<String, int[]> avrTimes;

    public UndergroundSystem() {
        this.Stations = new HashMap<>();
        this.Times = new HashMap<>();
        this.avrTimes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Stations.put(id, stationName);
        Times.put(id, t);

    }

    public void checkOut(int id, String stationName, int t) {
        String station = Stations.get(id) + "," + stationName;
        int time = t - Times.get(id);

        int[] p = avrTimes.getOrDefault(station, new int[2]);
        p[0] = p[0] + 1;
        p[1] = p[1] + time;
        avrTimes.put(station, p);

    }

    public double getAverageTime(String startStation, String endStation) {
        String stations = startStation + "," + endStation;
        if (avrTimes.containsKey(stations)){
            int[] p = avrTimes.get(stations);
            double ans = (double)p[1]/p[0];
            return ans;
        }
        else
            return -1;
    }

}