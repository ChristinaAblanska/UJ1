package week_5.geometry_circle;

import java.text.DecimalFormat;
public class Circle {
    private double radius;
    private Color color;

    public Circle() {
        this.radius = 1.0;
        this.color = Color.randomColor();
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void makeMeMoon() {
        color = Color.ЖЪЛТ;
    }

    public String toString() {
        StringBuilder circle = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.##");

        circle.append("Кръг с радиус ").append(radius)
                .append(" и диаметър ").append(2 * radius)
                .append(" Периметър ").append(df.format(getCircumference()))
                .append(" Лице ").append(df.format(getArea()))
                .append(" Цвят ").append(color);

        return circle.toString();
    }
}
