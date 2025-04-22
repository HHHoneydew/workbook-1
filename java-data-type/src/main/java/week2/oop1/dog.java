package week2.oop1;

public class dog {
    static String latinName = "Canis lupus familiaris";
    String name;
    String breed;
    int age;
    boolean isGoodGirl;

    public void bark() {
        System.out.println(name + " says: Woof! (Breed: " + breed + ")");
    }
}
