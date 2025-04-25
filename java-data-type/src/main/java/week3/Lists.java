package week3;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // create the list and add 3 animals
        List<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Dogs");
        animals.add("Cats");
        // print in a loop
        System.out.println("Animal's List: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        // remove your least fav
        animals.remove("Cows");

        // add a new animal
        animals.add("Labubu");

        // print the new list
        System.out.println("Updated List: ");
        for (int i = 0; i < animals.size(); i++);
        System.out.println();
    }
}
