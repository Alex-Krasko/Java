public class Lesson12 {
    public static void main(String[] args){
        try {
            int d = 0;
            int[] intArray = {1,2,3,4,5,6,7,8,9,0}; //Added new array with name intArray
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
    }
}