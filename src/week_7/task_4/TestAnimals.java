package week_7.task_4;

public class TestAnimals {
    public static void main(String[] args) {
        Fish fishFish = new Fish("Nemo");
        Cat catCat = new Cat("Fluffy");

        Animal animalFish = new Fish("Marvin");
        Animal animalSpider = new Spider();
        Pet petCat = new Cat("Snowball");

//        Animal animalFish = null;
//        if (animalFish instanceof  Fish) {
//            animalFish = new Fish("Marvin");
//        }
//        Animal animalSpider = null;
//        if (animalSpider instanceof Spider) {
//            animalSpider = new Spider();
//        }
//        Pet petCat = null;
//        if (petCat instanceof Cat) {
//            petCat = new Cat("Snowball");
//        }

        System.out.printf("Fish with name: %s%n", fishFish.getName());
        fishFish.walk();
        fishFish.eat();
        fishFish.play();
        System.out.println();

        System.out.printf("Cat with name: %s%n", catCat.getName());
        catCat.walk();
        catCat.eat();
        catCat.play();
        System.out.println();

        System.out.printf("Animal is <concrete implementation of %s> and its name is %s%n", animalFish.getClass(), ((Fish)animalFish).getName());
        animalFish.walk();
        animalFish.eat();
        System.out.println();

        System.out.printf("Animal is <concrete implementation of %s>%n", animalSpider.getClass());
        animalSpider.walk();
        animalSpider.eat();
        System.out.println();

        System.out.printf("Pet is <concrete implementation of %s> and its name is: %s%n", petCat.getClass(), petCat.getName());
        ((Cat)petCat).walk();
        ((Cat) petCat).eat();
        petCat.play();
    }
}
