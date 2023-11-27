package week_5.books;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest_1 {
    public static void main(String[] args) {
        ArrayList<Book_2> books = new ArrayList<>();
        int choice;
        Scanner scan = new Scanner(System.in);
        int maxCount = 10;
        int countBooks = 0;

        for (int i = 0; i < maxCount; i++) {
            System.out.println("Choose action: \n1. New Book entry\n2. Exit");
            choice = Integer.parseInt(scan.nextLine());
            if (choice == 1) {
                Book_2 testBook = new Book_2();
                readBook(scan, testBook);
                books.add(testBook);
                countBooks++;
            } else {
                System.out.println("Number of books - " + i);
                for (int j = 0; j < i; j++) {
                    System.out.println(books.get(j).toString());
                }
                break;
            }
        }
        scan.close();
    }

    public static void readBook(Scanner scan, Book_2 book) {
        String title;
        String author;
        String isbn;
        int pages;
        String publisher;
        double price;

        System.out.println("Title: ");
        title = scan.nextLine();
        book.setTitle(title);

        System.out.println("Author: ");
        author = scan.nextLine();
        book.setAuthor(author);

        System.out.println("ISBN: ");
        isbn = scan.nextLine();
        book.setIsbn(isbn);

        System.out.println("Pages: ");
        pages = Integer.parseInt(scan.nextLine());
        book.setPages(pages);

        System.out.println("Publisher: ");
        publisher = scan.nextLine();
        book.setPublisher(publisher);
        //scan.nextLine();

        System.out.println("Price: ");
        price = Double.parseDouble(scan.nextLine());
        book.setPrice(price);
    }
}
