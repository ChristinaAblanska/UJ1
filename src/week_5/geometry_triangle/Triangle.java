package week_5.geometry_triangle;

import java.text.DecimalFormat;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double angleA;
    private double angleB;
    private double angleC;

    public double getSideA() {
        return sideA;
    }

    public Triangle(double sideA, double sideB, double angleA) {
        // c^2 = a^2 + b^2 + 2abcosG
        this.sideA = sideA;
        this.sideB = sideB;
        sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) + (2 * Math.cos(angleA)));

        this.angleA = (Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC);
        angleB = (Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC);
        angleC = (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB);
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
        DecimalFormat df = new DecimalFormat("#.#####");

        triangle.append("Side A: ").append(df.format(sideA))
                .append(" Side B: ").append(df.format(sideB))
                .append(" SIde C: ").append(df.format(sideC))
                .append("\nAngle A: ").append(df.format(angleA))
                .append(" Angle B: ").append(df.format(angleB))
                .append(" Angle C: ").append(df.format(angleC));

        return triangle.toString();
    }
}
