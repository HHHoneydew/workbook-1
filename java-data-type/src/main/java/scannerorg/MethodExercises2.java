package scannerorg;

import java.util.Scanner;

public class MethodExercises2 {
    public static void main(String[] args) {
    int value = 50;
    System.out.println( "Original: " + value);
    int newValue = doubleXP(value);
        System.out.println("Double: "+ newValue);



    }


    public static String welcomeLord (String lady) {
       return "Queen " + lady;
    }

    public static int doubleXP(int xp) {
        return xp * 2;
    }

    public static Boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        if (hasKey || lockIsBroken) {
            return true;
        }
        return false;
    }

    public static int addGold (int currentGold){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much gold did you find? ");
        double goldFound = scanner.nextDouble();

        if(goldFound > 100) {
            goldFound -= 0.1 * goldFound;
        }
    return 0;
    }



}
