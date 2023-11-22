package week_6.geometry;

import static  java.lang.Math.pow;
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this(0, 0, 0);
    }
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * ((s - sideA) * (s - sideB) * (s - sideC)));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getCosA() {
        return (pow(sideB, 2) + pow(sideC, 2) - pow(sideA, 2)) / (2 * sideB * sideC);
    }

    public double getCosB() {
        return (pow(sideA, 2) + pow(sideC, 2) - pow(sideB, 2)) / (2 * sideA * sideC);
    }

    public double getCosC() {
        return (pow(sideA, 2) + pow(sideB, 2) - pow(sideC, 2)) / (2 * sideA * sideB);
    }
}
