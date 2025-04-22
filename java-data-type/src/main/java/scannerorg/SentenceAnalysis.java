package scannerorg;

import java.util.Scanner;

public class SentenceAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int length = sentence.length();
        System.out.println("The senetence has " + length + " characters.");

        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("The sentence has " + wordCount + " words.");

        if (sentence.length() > 0) {
            System.out.println("First character: "+ sentence.charAt(0));
        }

    }
}
