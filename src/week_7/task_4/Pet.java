package week_7.task_4;

public interface Pet {
    String getName();
    void setName(String name);
    default void play() {
        System.out.println("I am playing on my own.");
    }
}
