package week_7.task_3;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.printf("Circle perimeter: %.2f%n", circle.getPerimeter());
        System.out.printf("Square perimeter:  %.2f%n", square.getPerimeter());
        System.out.printf("Circle area:  %.2f%n", circle.getArea());
        System.out.printf("Square area:  %.2f%n", square.getArea());
    }
}
