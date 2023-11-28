package week_7.task_3;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
}
