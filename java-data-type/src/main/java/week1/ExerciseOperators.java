package week1;

public class ExerciseOperators {
    public static void main(String[] args) {
        // 1. Create 3 variables: and int, a double, and a char. Print them.
        int age = 19;
        double milkPrice = 14.99;
        char symbol = '$';
        System.out.println(age);
        System.out.println(milkPrice);
        System.out.println(symbol);

        // 2. Add two int variables and print the result
        int nm1 = 25;
        int nm2 = 19;
        int totalSum = nm1 + nm2;
        System.out.println(nm1 + nm2);

        // 3. Divide an int by another int and print the result
        int nm3 = 24;
        int nm4 = 6;
        int totalDivision = nm3 / nm4;
        System.out.println(nm3 / nm4 );

        // 4. Divide an int by a double and print the result. What data type is the result
        int nm5 = 120;
        double potOfGold = 6.2;
        System.out.println(nm5 / potOfGold);

        // 5. Store your age in an int. Calculate and print: "In 10 years I will be..."
        int age1 = 19;
        System.out.println("In 10 years I will be: " +  ( age1 + 10) );

        // 6. Create a byte with value 100. Add 28 to it and store it in an int. Print it
        byte nm6 = 100;
        int funky = (byte) (nm6 + 28);

        //7. Create a double with value 5.7. Cast it to int and print both
        double hairLength = 5.7;
        int cast = (int)hairLength;
        System.out.println("Double Nm " + hairLength);
        System.out.println("Cast Nm " + cast);

        // 8. Multiply a float and an int. Store the result in a double. Print it
        float f = 3.2f;
        int something = 6;
        double result = f * something;


        // 9. Store a char 'A' in a variable. Add 1 to it and print the result. (What happens?)
        char character = 'A';
        System.out.println(character + 1);

        // 10. Create two variables
        int a = 9;
        int b = 2;

        // 11. store your weight in a double. Store your height in a double. Calculate and print BMI
        double weight = 105;
        double height = 162;
        double BMI = weight / (height + weight);
        System.out.println(BMI);
        //  Calculate the average of 3 double numbers. print the result

        //  Create a short with value 30000. Multiply it by 2. what happens? fix it using casting

        // Create a variable double price = 10.99. Create int quantity = 5 Calculate total cost
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int) (price * quantity);
        // create an int with value 130. Cast it to byte. Print and explain weirdness
        int weird = 130;
        byte weird2 = (byte)weird;
        System.out.println(weird2);

        // Create a variable char letter = 'z'. Subtract 2 from it and print
        char letter = 'z';
        char newLetter = (char) (letter -2 );
        System.out.println(newLetter);

        // Store a long value of 2 billion. Add 1 billion to it. Print results
        long value = 2000000000L;
        long newvalue = value + 1000000000L;
        System.out.println(newvalue);

        // Calculate the area of a circle:
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println(area);

    }
}
