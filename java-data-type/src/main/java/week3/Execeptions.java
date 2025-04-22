package week3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Execeptions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        addThreeNumbers();
    }


    // 1
    public static void DivideNumbers() {
        System.out.println("Please Enter Number 1: ");
        int nm1 = scanner.nextInt();
        System.out.println("Please Enter Number 2: ");
        int nm2 = scanner.nextInt();
        try {
            int result = nm1 / nm2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: who divides by zero??");
        } catch (Exception e) {
            System.out.println("This is also an error");
        }
    }

    // 2
    public static void StringToInt() {
        System.out.println("Please Enter in a Number: ");
        String num = scanner.nextLine();
        try {
            int number = Integer.parseInt(num);
            System.out.println("You put in: " + number);
        } catch (NumberFormatException e) {
            System.out.println("That isn't a number silly. ");
        }
    }


    // 4
    public static void GuessTheNumber() {
        int secretNum = 1738;
        System.out.println("Guess the number: ");
        try {
            int guess = Integer.parseInt(scanner.nextLine());
            if (guess == secretNum) {
                System.out.println("You guessed the number! Good Job!");
            } else {
                System.out.println("You got it wrong. Try Again!");
            }
        } catch (NumberFormatException e) {
            System.out.println("That isn't a number!");
        }
    }


    // 8
    public static void addThreeNumbers() {
        int count = 0;
        int total = 0;
        while (count < 3) {
            System.out.println("Please enter number " + (count + 1));
            try {
                int nr = scanner.nextInt();
                total += nr;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("That is not a number, please try again.");
            }
        }
    }
}

