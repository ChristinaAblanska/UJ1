package week_7.task_7;

public class MovablePoint implements Movable {

    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        StringBuilder point = new StringBuilder();
        point.append("[X: ").append(x)
                .append(", Y: ").append(y)
                    .append(" | xSpeed: ").append(xSpeed)
                        .append(", ySpeed: ").append(ySpeed).append("]");
        return point.toString();
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
