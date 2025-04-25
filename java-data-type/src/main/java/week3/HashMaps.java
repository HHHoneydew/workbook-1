package week3;
import java.util.HashMap;
import java.util.Objects;

public class HashMaps {
    public static void main(String[] args) {
        // create the HashMap
        HashMap<String, String> wordsAndMeanings = new HashMap<String, String>();
        wordsAndMeanings.put("Pebble", "A small, smooth stone, usually found on beaches or riverbeds");
        wordsAndMeanings.put("Book", "A set of written or printed pages bound together");
        wordsAndMeanings.put("Drift", "To be carried slowly by a current of air or water");

        System.out.println("This is the meaning of 'Book': "+ wordsAndMeanings.get("Book"));

        String doubleCheck = "Pebble";
        if (wordsAndMeanings.containsKey(doubleCheck)) {
            System.out.println("'" + doubleCheck + "' exists in the map.");
        } else {
            System.out.println("'" + doubleCheck + "' does not exist in the map");
        }

        System.out.println("\nWords in the map: ");
        for (String word : wordsAndMeanings.keySet()) {
            System.out.println(word + ": " + wordsAndMeanings.get(word));
        }

        HashMap<String, Integer> namesAndAge = new HashMap<String, Integer>();
        namesAndAge.put("Sam", 19);
        namesAndAge.put("Aj", 29);
        namesAndAge.put("Coco", 10);
        namesAndAge.put("Chanel", 10);

        System.out.println(namesAndAge.get("Sam"));

        namesAndAge.put("Aj", namesAndAge.get("Aj") + 1);
        System.out.println("\nAj's new age is: " + namesAndAge.get("Aj"));

        namesAndAge.remove("Chanel");

        System.out.println("\nUpdated List of people and ages: ");
        for (String names : namesAndAge.keySet()) {
            System.out.println("Name: " + names + ", Age: " + namesAndAge.get(names));
        }

        // create new HashMap
        HashMap<String, Object> ownersAndPets = new HashMap<String, Object>();



    }
}

