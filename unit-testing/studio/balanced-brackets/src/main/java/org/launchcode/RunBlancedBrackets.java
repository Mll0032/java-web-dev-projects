package org.launchcode;

public class RunBlancedBrackets {
    public static void main(String[] args) {
        System.out.println("Balanced: " + BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        System.out.println("Unbalanced: " + BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
}
