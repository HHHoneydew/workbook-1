package scannerorg;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Choose one (+, -, *, /): ");
        String operator = scanner.nextLine();
        double result;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("I don't know this one! Try Again!");
            return;
        }
        System.out.println("Result: " + result);
    }
}
