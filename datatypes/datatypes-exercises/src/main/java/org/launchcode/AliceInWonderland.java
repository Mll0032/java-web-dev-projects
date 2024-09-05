package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once" +
                " or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println("Enter Search term: ");
        String userTerm = input.nextLine();

        String correctCaseSentence = sentence.toLowerCase();
        String correctUserTerm = userTerm.toLowerCase();

        boolean included = correctCaseSentence.contains(correctUserTerm);

        if (included) {
            System.out.println("The search term " + userTerm + " was found in the sentence");
        } else {
            System.out.println("The search term " + userTerm + " was NOT found in the sentence");
        }
    }
}
