public class H_01_OOPS_Class {
    // What is Class & Why we use class?
    // data, method - object

    // 1000 students data - 6 marks
    // 6000

/*
In Java, a class is like a blueprint or a template that defines the structure and behavior (data and methods) of objects. It serves as a fundamental building block in object-oriented programming (OOP).

What is a Class?
- A class defines attributes (often called fields or properties) and behaviors (methods or functions) that its objects (instances) will have.
- It does not represent an actual object by itself, but rather describes what an object created from the class will contain and how it will behave.
 */


    // Attributes (fields) of the class
    String name;
    int age;

    // Behavior (method) of the class
    void bark() {
        System.out.println(name + " says: Woof!");
    }

}
