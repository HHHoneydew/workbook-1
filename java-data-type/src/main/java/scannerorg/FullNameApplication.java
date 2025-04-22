package scannerorg;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your name");
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();
        String fName = firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + " " + suffix.trim();
        System.out.println("Full Name: " + fName);
        scanner.close();

    }
}
