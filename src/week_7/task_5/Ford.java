package week_7.task_5;

public class Ford extends Car {
    private int year;
    private double manufacturerDiscount;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(double manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - this.manufacturerDiscount;
    }
}
