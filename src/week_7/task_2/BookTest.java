package week_7.task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<MyBook> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int maxCount = 3;

        for (int i = 0; i < maxCount; i++) {
            String title;
            String author;
            double price = 0;

            System.out.print("Book title: ");
            title = scan.nextLine();
            System.out.print("Book author: ");
            author = scan.nextLine();
            System.out.print("Book price: ");
            price = Double.parseDouble(scan.nextLine());
            while (price < 0) {
                System.out.print("Invalid Price! Please try again:");
                price = Double.parseDouble(scan.nextLine());
            }

            MyBook book = new MyBook(title, author, price);
            books.add(book);
        }

        for (MyBook book : books) {
            book.display();
            System.out.println();
        }

        scan.close();
    }
}
