package week_7.task_3;

public class Square extends Shape {
    private double side;

    public Square (double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
