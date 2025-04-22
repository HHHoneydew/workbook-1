package week3;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises {
    static private final String FILE_NAME = "output.txt";

    public Exercises(String file) {
    }

    public static void main(String[] args) throws IOException {
        writeSingleLine();
        secondExercise();
        writeArrayLines();
        readPoemLineByLine();
        exercise5();
        readLinesToUpperCase();
        countAmtOfWords();

    }

    // 1 write a single line to a file
    public static void writeSingleLine() {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Hello Everyone!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2. Read that line back
    public static void secondExercise() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("poem.txt"));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }


    // 3 write multiple lines from an array
    public static void writeArrayLines() {
        String[] lines = {"Roses are red", "Violets are blue", "Java is sweet", "And so are you"};
        try {
            FileWriter writer = new FileWriter("poem.txt");
            for (int i = 0; i < lines.length; i++) {
                writer.write(lines[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4 read file line by line and print
    public static void readPoemLineByLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5 Ask the user for lines and save to a file
    public static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("user_input.txt");
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter line " + (i + 1) + ": ");
                String input = scanner.nextLine();
                writer.write(input + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6 Read lines into an array
    public static void readLinesToUpperCase() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i).toUpperCase());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 7 Count how many words appear
    public static void countAmtOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in a word: ");
        String search = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(search)) {
                    count++;
                }
            }
            reader.close();
            System.out.println("This word ' " + search + " ' appeared in " + count + " line(s). ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 8
}


