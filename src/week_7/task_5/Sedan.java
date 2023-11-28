package week_7.task_5;

public class Sedan extends Car {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        double discount;
        if (length > 6.5) {
            discount = super.getSalePrice() * 0.05;
            return super.getSalePrice() - discount;
        } else {
            discount = super.getSalePrice() * 0.1;
            return super.getSalePrice() - discount;
        }
    }

}
