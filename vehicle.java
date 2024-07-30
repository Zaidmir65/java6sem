// Vehicle.java
public class Vehicle {
    public void startO() {
        System.out.println("Vehicle started");
    }
}


public class Car extends Vehicle {
    @Override
    public void startO() {
        System.out.println("Car started");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        vehicle.startO(); 

       
        Car car = new Car();
        car.startO(); }