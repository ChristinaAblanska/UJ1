package week_5.geometry_triangle;

import java.text.DecimalFormat;
//import static java.lang.Math.sqrt;
//import static java.lang.Math.pow;
//import static java.lang.Math.cos;
//import static java.lang.Math.acos;
import static java.lang.Math.*;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double angleA;
    private double angleB;
    private double angleC;


    public Triangle(double sideA, double sideB, double angleC) {
        // c^2 = a^2 + b^2 + 2abcosG
        this.sideA = sideA;
        this.sideB = sideB;
        sideC = sqrt((pow(sideA, 2) + pow(sideB, 2)) - (2 * sideA * sideB) * cos(toRadians(angleC)));

        this.angleC = angleC;//toDegrees(acos((pow(sideB, 2) + pow(sideC, 2) - pow(sideA, 2)) / (2 * sideB * sideC)));
        angleB = toDegrees(acos((pow(sideA, 2) + pow(sideC, 2) - pow(sideB, 2)) / (2 * sideA * sideC)));
        angleA = toDegrees(acos((pow(sideB, 2) + pow(sideC, 2) - pow(sideA, 2)) / (2 * sideB * sideC)));


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

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public void setAngleC(double angleC) {
        this.angleC = angleC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public String toString() {
        StringBuilder triangle = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.##");

        triangle.append("Side A: ").append(df.format(sideA)).append(" | ")
                .append(" Side B: ").append(df.format(sideB)).append(" | ")
                .append(" Side C: ").append(df.format(sideC))
                .append("\nAngle A: ").append(df.format(angleA)).append(" | ")
                .append(" Angle B: ").append(df.format(angleB)).append(" | ")
                .append(" Angle C: ").append(df.format(angleC));

        return triangle.toString();
    }

//    public static boolean checkForTriangle(double sideA, double sideB, double sideC) {
//        boolean first = sideA < sideB + sideC;
//        boolean second = sideB < sideA + sideC;
//        boolean third = sideC < sideA + sideB;
//        return first && second && third;
//    }
}
