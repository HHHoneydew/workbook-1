package scannerorg;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Select sandwich size (1 = Regular, 2 = Large): ");
        int size = scanner.nextInt();

        double basePrice = 0.0;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        // Prompt for age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% for students
        } else if (age >= 65) {
            discount = 0.20; // 20% for seniors
        }

        // Calculate final price
        double finalPrice = basePrice - (basePrice * discount);

        // Display final price
        System.out.printf("Your sandwich total is: $%.2f%n", finalPrice);
    }
}
