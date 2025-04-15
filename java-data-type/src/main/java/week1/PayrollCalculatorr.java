package week1;

import java.util.Scanner;

public class PayrollCalculatorr {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Hello, what is your name? ");
        String name = scanner.next();

        System.out.println(" Enter in number of hours worked: ");
        double hour = scanner.nextDouble();
        System.out.println(" Enter in your pay rate");
        double pay = scanner.nextDouble();

        double result = hour  * pay;
        System.out.println(name + " + " +  result);

        scanner.close();
}
}
