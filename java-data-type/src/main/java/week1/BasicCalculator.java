package week1;

import java.util.Scanner;

public class BasicCalculator {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println(" Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println( "Please select an option: ");
        char option = scanner.next().toUpperCase().charAt(0);

        float result = firstNumber * num2;
        System.out.println(firstNumber + " * " + num2 + " = " + result);

        scanner.close();
    }


}
