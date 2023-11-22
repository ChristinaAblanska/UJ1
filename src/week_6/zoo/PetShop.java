package week_6.zoo;

import java.sql.SQLOutput;

public class PetShop {
public void printCatalogue() {
    System.out.println("1. Bird");
    System.out.println("2. Mammal");

}

public void printCatalogue(AnimalType type) {
    if (type == AnimalType.BIRD) {
        System.out.println("1. Pigeon");
        System.out.println("2. Parrot");
        System.out.println("3. Seagull");
    } else {
        System.out.println("1. Dog");
        System.out.println("2. Cat");
    }
}
}
