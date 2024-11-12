package Lab2;

import java.util.Scanner;

public class Exercise_11_Investment_Value_Calculation {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        
        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate / 100), years);
        System.out.println("Future investment value: " + futureInvestmentValue);
    }
}
