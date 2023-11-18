package week_5.books;

public class Book_2 {
    private String title;
    private String author;
    private int isbn;
    private int pages;
    private String publisher;
    private double price;

    public static final int COUNT = 0;

    public String getTitle() {
        return title;
    }

    public Book_2() {
        this.title = "";
        this.author = "";
        this.isbn = 0;
        this.pages = 0;
        this.publisher = "";
        this.price = 0.0;
    }

    public Book_2(String title, String author, int isbn, int pages, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        StringBuilder book = new StringBuilder();
        book.append("Title: ").append(title).append(" | ")
             .append("Author: ").append(author).append(" | ")
             .append("ISBN: ").append(isbn).append(" | ")
              .append("Pages: ").append(pages).append(" | ")
              .append("Publisher: ").append(publisher).append(" | ")
              .append("Price: ").append(price);
        return book.toString();
    }
}
