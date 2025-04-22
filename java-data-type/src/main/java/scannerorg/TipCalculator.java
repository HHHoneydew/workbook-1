package scannerorg;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        double bill = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the tip percentage: ");
        double tipPercentage = Double.parseDouble(scanner.nextLine());

        double tipAmt = bill * (tipPercentage / 100);
        double totalAmt = bill + tipAmt;

        double roundedUpTotal = Math.ceil(totalAmt);
        double roundedDownTotal = Math.floor(totalAmt);

        System.out.println("Tip amount: $" + tipAmt);
        System.out.println("Total amount: $" + totalAmt);
        System.out.println("Rounded up: $" + roundedUpTotal);
        System.out.println("Rounded down: $" + roundedDownTotal);


    }
}
