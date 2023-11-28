package week_7.task_4;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        this("");
    }

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("I like playing in the water.");
    }

    @Override
    public void eat() {
        System.out.println("I eat worms and small fish");
    }
}
