package week_6.geometry;

import java.util.Scanner;

public class TestShapes1 {
    public static void main(String[] args) {
//        Shape rect = new Rectangle();
//        Shape square = new Square();
//        Shape triangle = new Triangle();
//        Shape circle = new Circle();

        Shape shape = new Shape();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a shape\n1. Rectangle\n2. Square\n3. Triangle\n4. Circle");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 :
                double height;
                double width;
                System.out.println("Enter height: ");
                height = scan.nextDouble();
                System.out.println("Enter width: ");
                width = scan.nextDouble();
                shape = new Rectangle(height, width);
                break;
            case 2:
                double side;
                System.out.println("Enter the side of the square:");
                side = scan.nextDouble();
                shape = new Square(side);
                break;
            case 3:
                double sideA;
                double sideB;
                double sideC;
                System.out.println("Enter sideA: ");
                sideA = scan.nextDouble();
                System.out.println("Enter sideB: ");
                sideB = scan.nextDouble();
                System.out.println("Enter sideC: ");
                sideC = scan.nextDouble();

                if (checkForTriangle(sideA, sideB, sideC)) {
                    shape = new Triangle(sideA, sideB, sideC);
                } else {
                    System.out.println("These sides cannot form a triangle!");
                }
                break;
            case 4 :
                double radius;
                System.out.println("Enter a radius: ");
                radius = scan.nextDouble();
                if (radius > 0) {
                    shape = new Circle(radius);
                } else {
                    System.out.println("Invalid Radius!");
                }
                break;
            default:
                System.out.println("No such choice in the system!");
                return;
        }

        if (shape instanceof Square) {
            System.out.printf("Квадрат със страна %.2f%n", ((Square) shape).getHeight());
        } else if (shape instanceof Rectangle) {
            System.out.printf("Правоъгълник с дължина %.2f и ширина %.2f%n", ((Rectangle) shape).getHeight(), ((Rectangle) shape).getWidth());
            System.out.printf("Страната на най-големия квадрат който се събира в правоъгълника е: %.2f%n", ((Rectangle) shape).getMaxPossibleSquareInside());
        } else if (shape instanceof Triangle) {
            System.out.printf("Триъгълник със страни %.2f, %.2f, %.2f%n", ((Triangle) shape).getSideA(), ((Triangle) shape).getSideB(), ((Triangle) shape).getSideC());
            System.out.printf("И ъгли (в градуси): %.2f, %.2f, %.2f%n", ((Triangle) shape).getAngleA(), ((Triangle) shape).getAngleB(), ((Triangle) shape).getAngleC());
            double minCos = minCos(((Triangle) shape).getAngleA(), ((Triangle) shape).getAngleB(), ((Triangle) shape).getAngleC());
            if (minCos < 0) {
                System.out.println("Тъпоъгълен");
            } else if (minCos > 0) {
                System.out.println("Остроъгълен");
            } else {
                System.out.println("Правоъгълен");
            }
        } else if (shape instanceof Circle) {
            System.out.printf("Кръг с радиус %.2f и диаметър %.2f%n", ((Circle) shape).getRadius(), ((Circle) shape).getDiameter());
        } else {
            System.out.println("Неопределена форма :(");
        }

    }

    public static boolean checkForTriangle(double sideA, double sideB, double sideC) {
        boolean first = sideA < sideB + sideC;
        boolean second = sideB < sideA + sideC;
        boolean third = sideC < sideA + sideB;
        return first && second && third;
    }

    public static double minCos(double a, double b, double c) {
        double min = Math.min(a, b);
        return Math.min(min, c);
    }
}
