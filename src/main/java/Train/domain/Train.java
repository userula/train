package Train.domain;

import java.util.ArrayList;

public class Train implements Car, Locomotive {
    private String name;
    private String type;
    private int carNumb;
    private int passangers;
    private static final double capacity = 1.5; //capacity of 1 car (ton)
    private static final int maxPassangers = 20; //in 1 car

    public Train(String name, String locomotiveType, int carNumb, int passangers)
    {
        setName(name);
        setLocomotiveType(locomotiveType);
        setCarNumb(carNumb);
        setPassangers(passangers);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLocomotiveType(String type) {
        this.type = type;
    }

    @Override
    public String getLocType() {
        return type;
    }

    @Override
    public void setCarNumb(int n) {
        this.carNumb = n;
    }

    @Override
    public double getCapacity() {
        return carNumb * 1000; //kg
    }

    @Override
    public void setPassangers(int n) {
        if(maxPassangers * carNumb >= n)
        {
            this.passangers = n;
        }
        else
        {
            System.out.println("Too many passangres in train!!!");
        }
    }

    @Override
    public int getPassangers() {
        return passangers;
    }

    @Override
    public String toString()
    {
        return name + "\n" + "Locomotive type: " + getLocType() + "\nCar number: " + carNumb + "\nPassanger number: " + getPassangers() + "\n \n";
    }
}
