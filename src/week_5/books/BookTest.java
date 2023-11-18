package week_5.books;

public class BookTest {
    public static void main(String[] args) {
        Book_1 book = new Book_1();
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice());

        System.out.println("\nSet values: \n");
        book.setTitle("The Count of Monte Christo");
        book.setAuthor("Alexandr Dumas");
        book.setIsbn(123456789);
        book.setPages(1258);
        book.setPublisher("SunDay");
        book.setPrice(50.55);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice());
    }
}
