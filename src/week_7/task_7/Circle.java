package week_7.task_7;

public class Circle implements Movable {
    private double radius;
    private MovablePoint center;

    public Circle(double radius, MovablePoint center) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
