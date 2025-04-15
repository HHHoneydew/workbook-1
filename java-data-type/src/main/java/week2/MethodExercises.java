package week2;

public class MethodExercises {
    public static void main(String[] args) {
    printWelcome();

    String playerName = "samantha";
    displayPlayerName(playerName);

    int level = 126;
    showLevel(level);

    String attacker = "Player";
    String target1 = "Witch";
    String target2 = "Labubu";
    attack(attacker, target2 );
    attack (attacker, target1);

    String player = "Sam";
    String item1 = "Sword";
    String item2 = "Shield";
    String item3 = "Pizza";
    foundItem(player, item1);
    foundItem( player, item2);
    foundItem( player, item3);

    String spellName1 = "fireball";
    String spellName2 = "healing";
    int spell1 = 56;
    int spell2 = 82;
    String wizard = "Dumbledore";
    castSpell( wizard, spellName1,spell1);
    castSpell ( wizard, spellName2, spell2);

    String player1 = "Smiski";
    gameOver(player1);

    String player2 = "Coco";
    int itemAmt = 1738;
    displayInventory(player2, itemAmt);

    String player3 = "Hello Kitty";
    victoryDance(player3);




    }


    public static void printWelcome () {
        System.out.println(" Welcome to Code Quest! ");
    }

    public static void displayPlayerName (String playerName){
        System.out.println("Player joined: " + playerName);


    }

    public static void showLevel (int Level) {
        System.out.println("Level: " + Level);

    }

    public static void attack (String attacker, String target) {
        System.out.println(attacker + " attacks " + target);

    }

    public static void foundItem (String player, String item) {
        System.out.println(player + " found a " + item);

    }

    public static void castSpell (String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + " mana!");

    }

    public static void gameOver (String player) {
        System.out.println( "GAME OVER for " + player + "!");

    }
     public static void displayInventory (String player, int itemCount) {
         System.out.println(player + " has " + itemCount + " items in inventory. ");

     }

     public static void enterDungeon (String player, String dungeonName) {
         System.out.println(player + "bravely enters the " + dungeonName);

     }

     public static void victoryDance (String player) {
         System.out.println(player + " does a little victory dance! ");

     }

}
