package week_7.task_6;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double i = Math.abs(percent / 100.0);
        double increase = super.getRadius() * i;
        super.setRadius(super.getRadius() + increase);
    }
}
