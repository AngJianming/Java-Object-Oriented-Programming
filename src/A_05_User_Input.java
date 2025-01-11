/*
* Author AngJianming
*
*/

// it is a must to import java.util.Scanner; to access some external files which has the functionality to read input from the console. In Java this is the way to get certain functionalities which is not build in therefore, needing to import them.

import java.util.Scanner;

public class A_05_User_Input {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = user_input.nextLine();
        System.out.println("My name is " + name);


        // Example Calculator
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first integer: ");
        int x = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second integer: ");
        int y = scanner.nextInt();

        // Perform arithmetic operations
        int sum = x + y;           // Addition
        int difference = x - y;    // Subtraction
        int product = x * y;       // Multiplication

        // To handle division by zero, you can check if b == 0
        // but for simplicity, we assume b != 0 in this example
        double quotient = (double) x / y;      // Division
        int modulus = x % y;       // Modulus (remainder)

        // Print the results
        System.out.println("\n--- Results ---");
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + difference);
        System.out.println(x + " × " + y + " = " + product);
        System.out.println(x + " ÷ " + y + " = " + quotient);
        System.out.println(x + " % " + y + " = " +"R"+ modulus);

        // Close the scanner
        scanner.close();
    }
}
