package week2.oop1;

public class cat {
    static String latinName = "Felis catus";
    String name;
    String color;
    int age;
    boolean isFluffy;

    public void meow(){
        System.out.println(name + "says: Meow! (in a " + color + "coat)");
    }
}
