package org.launchcode;
import java.util.Scanner;

public class MpgCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles Driven? ");
        double miles = input.nextDouble();

        System.out.println("Gallons Consumed? ");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;

        System.out.println("Miles Per Gallon: " + mpg);
    }
}
