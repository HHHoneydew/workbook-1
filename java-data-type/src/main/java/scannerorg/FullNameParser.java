package scannerorg;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter full name: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 0) {
            scanner.close();
            return;

        }
        String firstName = nameParts[0];
        String middleName = null;
        String lastName = null;

        if (nameParts.length == 2) {
            middleName = "(None)";
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        scanner.close();
    }
}
