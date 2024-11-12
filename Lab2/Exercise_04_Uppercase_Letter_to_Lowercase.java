package Lab2;

import java.util.Scanner;

public class Exercise_04_Uppercase_Letter_to_Lowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char upper = input.next().charAt(0);
        char lower = Character.toLowerCase(upper);
        System.out.println("Lowercase letter: " + lower);
    }
}