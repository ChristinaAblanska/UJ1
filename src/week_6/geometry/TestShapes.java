package week_6.geometry;

public class TestShapes {
    public static void main(String[] args) {
        Shape test = new Shape();
        Shape rectangle = new Rectangle(3, 4);
        Shape square = new Square(2);

        System.out.println("Shape: test");
        System.out.println("Test Area: " + test.getArea());
        System.out.println("Test Perimeter: " + test.getPerimeter());

        System.out.println();
        System.out.println("Shape: rectangle");
        System.out.println("rectangle Area: " + rectangle.getArea());
        System.out.println("rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println();
        System.out.println("Shape: square");
        System.out.println("square Area: " + square.getArea());
        System.out.println("square Perimeter: " + square.getPerimeter());
    }
}
