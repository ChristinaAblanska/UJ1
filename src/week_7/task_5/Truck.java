package week_7.task_5;

public class Truck extends Car{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double discount;
        if (weight > 2000) {
            discount = super.getSalePrice() * 0.1;
            return super.getSalePrice() - discount;
        } else {
            discount = super.getSalePrice() * 0.2;
            return super.getSalePrice() - discount;
        }
    }
}
