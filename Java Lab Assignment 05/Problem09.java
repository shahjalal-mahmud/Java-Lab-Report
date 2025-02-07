final class Animal {
    public void makeSound() {
        System.out.println("Animals make sounds...");
    }
}

class Vehicle {
    final void startEngine() { // Final method (Cannot be overridden)
        System.out.println("Engine started...");
    }
}

class Car extends Vehicle {
    // Attempting to override final method will cause a compilation error
    // void startEngine() { System.out.println("Car engine started..."); } // ERROR
}

public class Problem09 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Car car = new Car();
        car.startEngine(); // Calls inherited method from Vehicle (cannot override)
    }
}
