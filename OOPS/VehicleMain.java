package OOPS;

class Vehicle {
    String brand = "Kia";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String model = "Sonet";

    void displayCar() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

class Engine extends Car {
    String engineType = "Petrol";

    void displayEngine() {
        System.out.println("Engine Type : " + engineType);
    }
}

public class VehicleMain {
    public static void main(String[] args) {

        Engine e = new Engine();

        e.start();
        e.displayCar();
        e.displayEngine();
    }
}