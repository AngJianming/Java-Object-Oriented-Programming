package Lab2;

import java.util.Scanner;

public class Exercise_2_CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        
        double area = radius * radius * (22.0 / 7);
        double volume = area * length;
        
        System.out.println("Volume of the cylinder: " + volume);
    }
}
