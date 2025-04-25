package week3;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RecapPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nHello! Pick One: ");
            System.out.println("[1] Input today's mood");
            System.out.println("[2] Past Moods");
            System.out.println("[3] Exit");
            System.out.println("You selected: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                moodLog(scanner);
                break;
                case "2":
                pastMoods();
                break;
                case "3":
                isRunning = false;
                break;
                default:
                    System.out.println("That wasn't a selection, Try Again!");
        }
    }

}
private static void moodLog(Scanner scanner) {
    System.out.println("How did you feel today? ");
    String currentMood = scanner.nextLine();
    String entry = LocalDate.now() + ": " + currentMood;
    try (FileWriter writer = new FileWriter("moodtracker.txt", true)) {
        writer.write(entry + "\n");
        System.out.println("Your feelings have been logged");
    } catch (IOException e) {
        System.out.println("There was something that went wrong");
    }
}
private static void pastMoods() {
    try (BufferedReader reader = new BufferedReader(new FileReader("moodtracker.txt"))) {
        String line;
        System.out.println(" Past Moods ");
        while ((line = reader.readLine()) !=null) {
            System.out.println((line));
        }
    } catch (IOException e) {
        System.out.println("There was something that went wrong");
    }
}
}