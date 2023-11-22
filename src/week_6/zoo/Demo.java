package week_6.zoo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PetShop shop = new PetShop();
        System.out.println("Choose an animal:");
        shop.printCatalogue();
        int choice = scan.nextInt();

        AnimalType type;
        if (choice == 1) {
            type = AnimalType.BIRD;
        } else {
            type = AnimalType.MAMMAL;
        }

        shop.printCatalogue(type);
        choice = scan.nextInt();
        Animal animal;

        if (type == AnimalType.BIRD) {
            switch (choice) {
                case 1 :
                    animal = new Pigeon();
                    ((Pigeon) animal).sing();
                    break;
                case 2 :
                    animal = new Parrot();
                    ((Parrot) animal).sing();
                    break;
                case 3 :
                    animal = new Seagull();
                    ((Seagull) animal).sing();
                    break;
                default:
                    System.out.println("No such bird");
                    return;
            }
        } else {
            switch (choice) {
                case 1 :
                    animal = new Dog();
                    ((Dog) animal).bark();
                    break;
                case 2 :
                    animal = new Cat();
                    ((Cat) animal).meow();
                    break;
                default:
                    System.out.println("No such animal");
                    return;
            }
        }

    scan.close();
    }
}
