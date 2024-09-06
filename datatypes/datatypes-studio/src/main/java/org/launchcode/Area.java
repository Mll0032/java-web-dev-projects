package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double radius;
        while (true) {
            System.out.print("Enter Radius: ");
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius >= 0) {
                    break;
                } else {
                    System.out.println("Error: Radius cannot be negative");
                }
            } else {
                System.out.println("Error: Please enter a valid number");
                input.next();
            }
        }

        // Calculate the area and print the result
        double area;
        area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}
