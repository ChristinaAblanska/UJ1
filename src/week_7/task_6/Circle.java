package week_7.task_6;

public class Circle implements GeometricObject {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        StringBuilder circle = new StringBuilder();
        circle.append("Circle: radius = ").append(radius);
        return circle.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
