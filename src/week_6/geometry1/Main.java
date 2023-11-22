package week_6.geometry1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create line 1: ");
        Line line1 = new Line();
        line1.readLine(scan);

        System.out.println("Create line 2: ");
        Line line2 = new Line();
        line2.readLine(scan);

        System.out.println(line1.toString());
    }
}
