package week_6.geometry1;

import java.util.Scanner;

public class Line {
    private Point a;
    private Point b;
//    private double coefA;
//    private double coefB;
//    private double coefC;

    public Line() {
        this.a = new Point();
        this.b = new Point();
    }
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void readLine(Scanner scan) {
        Point a = new Point();
        Point b= new Point();

        double distanceAB = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        do {
            a.readPoint(scan);
            b.readPoint(scan);
        } while (distanceAB < 0);

        this.a = a;
        this.b = b;
    }

    public String toString() {
        return this.a.toString() + " | " + this.b.toString();
    }
}
