package scannerorg;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type C to convert from Celcius to Fahrenheit, or F to convert from Fahrenheit to Celcius: ");
        String choice = scanner.nextLine().toUpperCase();

        System.out.println("Enter the temperature: ");
        double inputTemp = Double.parseDouble(scanner.nextLine());

        double converted = 0;

        if (choice.equals("C")) {
            // Celsius to Fahrenheit
            converted = (inputTemp * 9 / 5) + 32;
            System.out.println(inputTemp + "°C is " + converted + "°F");
        } else if (choice.equals("F")) {
            // Fahrenheit to Celsius
            converted = (inputTemp - 32) * 5 / 9;
            System.out.println(inputTemp + "°F is " + converted + "°C");
        } else {
            System.out.println("Invalid choice.");
        }

        int rounded = (int) converted;
        System.out.println("Rounded: " + rounded + "°");


    }
}
