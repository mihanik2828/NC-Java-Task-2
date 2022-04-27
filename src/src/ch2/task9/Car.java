package src.ch2.task9;

public class Car {
    private double fuel=0;
    double distancePerLitr=0.1;
    double distance=0;

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", distancePerLitr=" + distancePerLitr +
                ", distance=" + distance +
                '}';
    }

    public Car(double fuelInLitres, double litresForMiles, double distance) {
        this.fuel = fuelInLitres;
        distancePerLitr = litresForMiles;
        this.distance = distance;
    }

    public Car(double fuelInLitres, double litresForMiles) {
        this.fuel = fuelInLitres;
       distancePerLitr = litresForMiles;
    }

    public void addFuel(double f)
    {
        System.out.println("thank u for car food");
        fuel+=f;
    }

    public double getFuelInLitres()
    {
        return  fuel;
    }

    public double maxDistance()
    {
        return fuel*distancePerLitr;
    }

    public void driveDistance(double distance)
    {
        if(this.maxDistance()<distance)
        {
            this.distance+=maxDistance();
            fuel=0;
            System.out.println("I`m starting drive...you don`t have so much fuel , i`ll use all fuel. we now in Distance- " + distance);
        }
        else
        {
            this.distance+=distance;
            fuel-=distance/distancePerLitr;
            System.out.println("I`m starting drive... we now in Distance- "+ distance);
        }
    }
}
