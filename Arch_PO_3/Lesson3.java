package Arch_PO_3;

import javax.swing.plaf.synth.ColorType;

public class  Lesson3 {
    public static void main(String[] args){
        
    }
}

enum TypeCar {
    SEDAN,
    PICKUP,
    WAGON,
    HATCHBACK,
    VAN
}

enum TypeFuel {
    GASOLINE,
    DIESEL
}

enum TypeTransaxle{
    MT,
    AT
}

abstract class Car {
    private String brand;
    private String model;
    private ColorType color;
    private String body;
    private int wheels;
    private String fuelType;
    private String transaxle;
    private double volMotor;

    public void movement(){}
    public void maintenance(){}
    public boolean gearShifting(){ return true; }
    public boolean switchHeadLights(){ return true; }
    public boolean switchWipers(){ return true; }

    public void setBrand(String brd){ this.brand = brd; }
    public String getBrand(){ return brand; }

    public void setModel(String mdl){ this.model = mdl; }
    public String getModel(){ return model; }

    public void setColor(ColorType clr){ this.color = clr; }
    public ColorType getColor(){ return color; }

    public void setBody(String bd){ this.body = bd; }
    public String getBody(){ return body; }

    public void setWheels(int whl){ this.wheels = whl; }
    public int getWheels(){ return wheels; }

    public void setFuelType(String fuel){ this.fuelType = fuel; }
    public String getFuelType(){ return fuelType; }

    public void setTransaxle(String box){ this.transaxle = box; }
    public String getTransaxle(){ return transaxle; }

    public void setVolMotor(double vol){ this.volMotor = vol; }
    public Double getVolMotor(){ return volMotor; }

}

class PickUp extends Car implements Refuelling, Wipping {
    private int loadCapacity;

    public int getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(int loadCapacity) { this.loadCapacity = loadCapacity; }

    @Override
    public void fuel(){}
    @Override
    public void wipWindshield(){}
    @Override
    public void wipHeadLights(){}
    @Override
    public void wipMirrors(){}
}

class FutureCar extends Car {

    FutureCar()
    {
        this.setWheels(3);
    }

    @Override
    public void movement() {
        fly();
    }

    private void fly(){}

}

interface Refuelling 
{
    void fuel();

}

interface Wipping
{
    void wipWindshield();
    void wipHeadLights();
    void wipMirrors();
}