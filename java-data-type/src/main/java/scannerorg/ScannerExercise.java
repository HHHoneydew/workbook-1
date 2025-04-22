package scannerorg;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ask player name
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Hello," + name + "Welcome to the game.");

        // 2.age in dog years
        System.out.println("Please enter age");
        int age = scanner.nextInt();
        System.out.println("Your age in dog years is: " + (age * 7));

        // 3. dice roll

        // 4. hero stats
        System.out.println("Enter your hero's name >>");
        String heroName = scanner.nextLine();
        System.out.println("Enter your strength >>");
        int strength = scanner.nextInt();
        System.out.println("Enter your agility >>");
        int agility = scanner.nextInt();
        System.out.println("Hero: " + heroName + "| Strength: " + strength + " | Agility: " + agility);

        // 5. Level up
        System.out.println("Enter your current level >>");
        int level = scanner.nextInt();
        System.out.println("You leveled up! You are now level" + (level + 1));

        // 6. Coin calculator
        System.out.print("How many gold coins? >> ");
        int gold = scanner.nextInt();
        System.out.print("How many silver coins? >> ");
        int silver = scanner.nextInt();
        int totalScore = gold * 10 + silver;
        System.out.println("Total score: " + totalScore);

        // 7. Odd or Even dice
        int oddEven = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a " + oddEven + ", which is " + (oddEven % 2 == 0 ? "even" : "odd"));

        // 8. Critical hit chance
        System.out.print("Enter your luck stat (0-100) >> ");
        int luck = scanner.nextInt();
        System.out.println(luck > 50 ? "Critical Hit!" : "Normal Hit");

        // 9. Character class check
        System.out.print("Choose your class (warrior/mage) >> ");
        String charClass = scanner.nextLine().toLowerCase();
        if (charClass.equals("warrior")) {
            System.out.println("Starting weapon: Sword");
        } else if (charClass.equals("mage")) {
            System.out.println("Starting weapon: Staff");
        } else {
            System.out.println("Unknown class");
        }
        // 10. Magic Number Guess
        int secret = 7;
        System.out.println("Guess the magic number (1-10)");
        int guess = scanner.nextInt();
        System.out.println(guess == secret ? "Correct" : "Wrong guess!");

        // 11Speed trap
        System.out.println("Enter your speed");
        int speed = scanner.nextInt();
        System.out.println(speed > 100 ? "Too fast! Slow down." : "Safe speed.");

        // 12. Rock Paper Scissors


        // 13. Potion Shop
        System.out.print("How much gold do you have? >> ");
        int goldAmt = scanner.nextInt();
        System.out.print("How many potions (15 gold each)? >> ");
        int potions = scanner.nextInt();
        int cost = potions * 15;
        if (goldAmt >= cost) {
            System.out.println("You bought " + potions + " potions. Change: " + (goldAmt - cost));
        } else {
            System.out.println("Not enough gold.");
        }

        // 14. Damage Calculator
        System.out.print("Enter your attack power >> ");
        int attack = scanner.nextInt();
        System.out.print("Enter enemy defense >> ");
        int defense = scanner.nextInt();
        int damage = attack - defense;
        if (damage < 0) damage = 0;
        System.out.println("You dealt " + damage + " damage.");

        // 15. XP to next level
        System.out.print("Current XP >> ");
        int currentXP = scanner.nextInt();
        System.out.print("XP needed to level up >> ");
        int neededXP = scanner.nextInt();
        System.out.println("XP still needed: " + (neededXP - currentXP));

        // 16. Dungeon Door Code

        // 17. Monster Battle
        System.out.print("Your HP >> ");
        int myHP = scanner.nextInt();
        System.out.print("Monster HP >> ");
        int monsterHP = scanner.nextInt();
        System.out.print("Your attack power >> ");
        int myAttack = scanner.nextInt();
        monsterHP -= myAttack;
        if (monsterHP < 0) monsterHP = 0;
        System.out.println("You: " + myHP + " HP | Monster: " + monsterHP + " HP");

        // 18.  Treasure Chest Trap

        // 19. High Score Check
        System.out.print("Your score >> ");
        int score = scanner.nextInt();
        System.out.print("High score to beat >> ");
        int highScore = scanner.nextInt();
        System.out.println(score > highScore ? "New Record!" : "Try again.");

        scanner.close();

    }
}
