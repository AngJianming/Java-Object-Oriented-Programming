// H_06_Hierarchical_Inheritance.java

// Superclass: Vehicle
class Vehicle {
    // Common attributes for all vehicles
    String brand;
    String model;
    int year;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Common method for all vehicles
    public void startEngine() {
        System.out.println("The engine of " + brand + " " + model + " is starting.");
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Additional attribute specific to Car
    int numberOfDoors;

    // Constructor for Car
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year); // Call the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // Method specific to Car
    public void openTrunk() {
        System.out.println(brand + " " + model + ": Trunk is now open.");
    }

    // Overriding displayInfo to include number of doors
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Vehicle's displayInfo
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    // Additional attribute specific to Bike
    boolean hasCarrier;

    // Constructor for Bike
    public Bike(String brand, String model, int year, boolean hasCarrier) {
        super(brand, model, year); // Call the constructor of Vehicle
        this.hasCarrier = hasCarrier;
    }

    // Method specific to Bike
    public void ringBell() {
        System.out.println(brand + " " + model + ": Ding! Ding!");
    }

    // Overriding displayInfo to include carrier information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Vehicle's displayInfo
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main Class to Test Hierarchical Inheritance
public class H_06_Hierarchical_Inheritance {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car("Toyota", "Camry", 2020, 4);
        myCar.startEngine();      // Inherited method from Vehicle
        myCar.openTrunk();        // Car-specific method
        myCar.displayInfo();      // Overridden method

        System.out.println(); // For better readability

        // Creating an object of Bike
        Bike myBike = new Bike("Yamaha", "YZF-R3", 2021, true);
        myBike.startEngine();     // Inherited method from Vehicle
        myBike.ringBell();        // Bike-specific method
        myBike.displayInfo();     // Overridden method
    }
}
