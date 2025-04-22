package week2.oop1;

public class App {
    public static void main(String[] args) {
        System.out.println(cat.latinName);
        System.out.println(dog.latinName);

        cat kendall = new cat();
        kendall.name = "Kendall";
        kendall.color = "brown";
        kendall.age = 8;
        kendall.isFluffy = true;

        dog coco = new dog();
        coco.name = "Coco";
        coco.breed = "Mutt";
        coco.age = 10;
        coco.isGoodGirl = true;

        kendall.meow();
        coco.bark();
    }

}
