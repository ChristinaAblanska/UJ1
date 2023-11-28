package week_7.task_6;

public class Rectangle implements GeometricObject {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        StringBuilder rectangle = new StringBuilder();
        rectangle.append("Rectangle: width - ").append(width)
                .append(", height - ").append(height);
        return rectangle.toString();
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
}
