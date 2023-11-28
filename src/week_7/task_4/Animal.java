package week_7.task_4;

public abstract class Animal {
    private final int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        if (legs > 0) {
            System.out.printf("I am walking by moving my %d legs.%n", legs);
        } else {
            System.out.println("I can't walk as I do not have any legs.");
        }
    }
}
