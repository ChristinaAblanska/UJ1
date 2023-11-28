package week_7.task_6;

public class Demo {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(4);
        GeometricObject rectangle = new Rectangle(2, 5);

        System.out.printf("Circle perimeter: %.2f%n", circle.getPerimeter());
        System.out.printf("Rectangle perimeter:  %.2f%n", rectangle.getPerimeter());
        System.out.printf("Circle area:  %.2f%n", circle.getArea());
        System.out.printf("Rectangle area:  %.2f%n", rectangle.getArea());

        Resizable testResize = new ResizableCircle(4);
        System.out.println("Circle before resize: " + testResize.toString());
        testResize.resize(50);
        System.out.println("Circle after resize: " + testResize.toString());
    }
}
