package week_6.geometry1;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void readPoint(Scanner scan) {
        System.out.println("Enter X coordinate: ");
        this.x = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Y coodinate: ");
        this.y = Double.parseDouble(scan.nextLine());
    }

    public String toString() {
        StringBuilder point = new StringBuilder();
        point.append("[").append(this.x)
                .append(", ").append(this.y).append("]");

        return point.toString();
    }
}
