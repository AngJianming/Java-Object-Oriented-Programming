package Lab2;

import java.util.Scanner;

public class Exercise_07_Grade_Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your assignment marks: ");
        int marks = input.nextInt();
        String grade;
        
        if (marks >= 0 && marks <= 40) grade = "F (Fail)";
        else if (marks <= 49) grade = "F+ (Marginal Fail)";
        else if (marks <= 54) grade = "D (Pass)";
        else if (marks <= 64) grade = "C";
        else if (marks <= 69) grade = "B (Credit)";
        else if (marks <= 74) grade = "B+";
        else if (marks <= 79) grade = "A (Distinction)";
        else grade = "A+";
        
        System.out.println("Grade: " + grade);
    }
}
