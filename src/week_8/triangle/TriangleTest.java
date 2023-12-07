package week_8.triangle;

import java.util.Scanner;


// Защо подчертава исхода в син цвят?
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideA;
        double sideB;
        double angleA;
        Triangle triangle;


        System.out.print("Side A: ");
        sideA = Double.parseDouble(scan.nextLine());
        System.out.print("Side B: ");
        sideB = Double.parseDouble(scan.nextLine());
        System.out.print("Angle A: ");
        angleA = Double.parseDouble(scan.nextLine());

        // No exception
//        double sideC = getSideC(sideA, sideB, angleA);
//        if (checkForTriangle(sideA, sideB, sideC)) {
//            triangle = new Triangle(sideA, sideB, angleA);
//            System.out.println(triangle.toString());
//            System.out.printf("Perimeter: %.2f%n",triangle.getPerimeter());
//            System.out.printf("Area: %.2f%n",triangle.getArea());
//        } else {
//            System.out.println("Invalid Triangle! Please try again!");
//        }

        // throw an exception
        double sideC = getSideC(sideA, sideB, angleA);
        if (!checkForTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Invalid sides for a triangle!");
        } else {
            triangle = new Triangle(sideA, sideB, angleA);
        }

        System.out.println(triangle.toString());
        System.out.printf("Perimeter: %.2f%n",triangle.getPerimeter());
        System.out.printf("Area: %.2f%n",triangle.getArea());

        scan.close();
}

    public static double getSideC(double sideA, double sideB, double angleA) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) + (2 * Math.cos(Math.toRadians(angleA))));
    }

    public static boolean checkForTriangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return false;
        } else {
            boolean first = sideA < sideB + sideC;
            boolean second = sideB < sideA + sideC;
            boolean third = sideC < sideA + sideB;
            return first && second && third;
        }
    }
}
