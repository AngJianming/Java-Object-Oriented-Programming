public class H_02_Create_Class {
    // for short cut type: psvm
    public static void main(String[] args) {
        // this is how we can access the class Hello{}, by using the hello object as shown below we can access the data members and member function of the class Hello{}.
        Hello hello = new Hello(); // Access new Hello class, latest version.
        hello.printMsg();

        System.out.println(hello.a); // the '.' is used to access the methods or class or joined
        System.out.println(hello.b);

        Hello hello2 = new Hello(); // doesn't matter how many object you can make
        hello2.printMsg();


    }
}

    // Create Your first class
class Hello {
    // data members(variable), methods(function)
    int a = 10;
    int b = 20;

    void printMsg() {
        System.out.println("My name is Hello Class.");
    }
}
