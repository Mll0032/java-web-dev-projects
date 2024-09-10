package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        // Initialize the string (prompt the user)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = input.nextLine();

        // Convert the string to lowercase and then to a char array
        char[] charactersInString = inputString.toLowerCase().toCharArray();

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Loop through the character array and count occurrences of letters only
        for (char character : charactersInString) {
            if (Character.isLetter(character)) {
                // Check if the character is already in the map
                if (charCounts.containsKey(character)) {
                    // If it is, increment the count
                    charCounts.put(character, charCounts.get(character) + 1);
                } else {
                    // If not, add it with a count of 1
                    charCounts.put(character, 1);
                }
            }
        }

        // Loop through the map and print the character counts
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}