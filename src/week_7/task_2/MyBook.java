package week_7.task_2;

public class MyBook extends Book {
    private String title;
    private String author;
    private double price;

    public MyBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public void display() {
        System.out.printf("Title: %s, Author: %s, Price: %s", title, author, price);
    }
}
