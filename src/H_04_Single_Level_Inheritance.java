// Single Level Inheritance
public class H_04_Single_Level_Inheritance {
    public static void main(String[] args) {
        // Creating an object of the subclass Dog
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Accessing methods inherited from the superclass
        myDog.eat(); // Output: Buddy is eating.

        // Accessing method specific to the subclass
        myDog.bark(); // Output: Buddy says: Woof! Woof!

        // Displaying all information using the overridden method
        myDog.displayInfo();
        // Output:
        // Name: Buddy, Age: 3
        // Breed: Golden Retriever
    }
}

// Superclass: Animal
class Animal {
    // Attributes (fields) of the superclass
    String name;
    int age;

    // Constructor of the superclass
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method of the superclass
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to display animal details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Dog
class Dog extends Animal {
    // Additional attribute specific to Dog
    String breed;

    // Constructor of the subclass
    public Dog(String name, int age, String breed) {
        // Call the constructor of the superclass (Animal)
        super(name, age);
        this.breed = breed;
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // displayInfo method to include breed
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }
}
