package Lab2;

import java.util.Scanner;

public class Exercise_10_Program_execution {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        
        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue (Yes/No)? ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Yes"));
        
        System.out.println("Program terminated.");
    }
}