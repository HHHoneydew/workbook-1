package week2.oop2;

public class App2 {
    public static void main(String[] args) {
        System.out.println(House.latinName);
        System.out.println(Car.latinName);

        House myHouse = new House();
        myHouse.color = "blue";
        myHouse.numberOfRooms = 5;
        myHouse.hasGarden = true;
        myHouse.sizeInSquareMeters = 120.5;

        House hauntedHouse = new House();
        hauntedHouse.color = "dark purple";
        hauntedHouse.numberOfRooms = 13;
        hauntedHouse.hasGarden = false;
        hauntedHouse.sizeInSquareMeters = 666.6;

        Car tesla = new Car();
        tesla.brand = "Tesla";
        tesla.color = "white";
        tesla.year = 2021;
        tesla.isElectric = true;

        Car oldBeetle = new Car();
        oldBeetle.brand = "Volkswagen Beetle";
        oldBeetle.color = "red";
        oldBeetle.year = 1969;
        oldBeetle.isElectric = false;

        myHouse.openDoor();
        hauntedHouse.openDoor();
        tesla.startEngine();
        oldBeetle.startEngine();
    }
}


