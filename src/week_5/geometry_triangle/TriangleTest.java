package week_5.geometry_triangle;

import java.util.Scanner;

// Защо подчертава исхода в син цвят?
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideA;
        double sideB;
        double angleA;

        System.out.println("Side A: ");
        sideA = Double.parseDouble(scan.nextLine());
        System.out.println("Side B: ");
        sideB = Double.parseDouble(scan.nextLine());
        System.out.println("Angle A: ");
        angleA = Double.parseDouble(scan.nextLine());

        Triangle triangle = new Triangle(sideA, sideB, angleA);

        System.out.println(triangle.toString());
        System.out.printf("Perimeter: %.2f%n", triangle.getPerimeter());
        System.out.printf("Area: %.2f%n", triangle.getArea());
        scan.close();
    }
}
