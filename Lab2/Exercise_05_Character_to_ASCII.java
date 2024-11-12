package Lab2;

import java.util.Scanner;

public class Exercise_05_Character_to_ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code (0 to 128): ");
        int ascii = input.nextInt();
        char character = (char) ascii;
        System.out.println("Character: " + character);
    }
}
