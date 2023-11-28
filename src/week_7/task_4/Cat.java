package week_7.task_4;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I eat mice.");
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
        System.out.println("I like playing with woolen balls.");
    }
}
