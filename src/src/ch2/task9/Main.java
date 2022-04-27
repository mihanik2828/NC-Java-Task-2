package src.ch2.task9;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(10, 10);

        System.out.println(car.toString());

        car.driveDistance(50);
        System.out.println(car.toString());

        car.driveDistance(100);
        System.out.println(car.toString());

        car.addFuel(15);
        System.out.println(car.toString());
    }
}
