class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

public class Problem03 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.move(); 
        Car myCar = new Car();
        myCar.move(); 
        Vehicle myNewCar = new Car();
        myNewCar.move();
    }
}
