package week_5.car_factory;

import java.text.DecimalFormat;

//марка, модел, тип каросерия, цвят, дължина, ширина, тегло, тип двигател (бензин, дизел, хибрид, електрически), цена и екстри (опционални).
public class Car extends Engine {
    private Brand brand;
    private Model model;
    private Bodywork bodywork;
    private Color color;
    private double length;
    private double width;
    private double weight;
    private double price;
    private boolean ac;
    private boolean automaticTransmission;
    private boolean navigation;
    private boolean tempomat;
    private boolean elGlass;

    public Car() {
        super();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public EngineType getEngine() {
        return super.getEngineType();
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Bodywork getBodywork() {
        return bodywork;
    }

    public void setBodywork(Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public boolean isNavigation() {
        return navigation;
    }

    public void setNavigation(boolean navigation) {
        this.navigation = navigation;
    }

    public boolean isTempomat() {
        return tempomat;
    }

    public void setTempomat(boolean tempomat) {
        this.tempomat = tempomat;
    }

    public boolean isElGlass() {
        return elGlass;
    }

    public void setElGlass(boolean elGlass) {
        this.elGlass = elGlass;
    }

    public String toString() {
        StringBuilder car = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.##");

        car.append(brand).append(": ")
                .append(model).append(" | bodywork: ")
                .append(bodywork).append("; color: ")
                .append(color).append("; engine: ")
                .append(super.getEngineType()).append("; length: ")
                .append(df.format(length)).append("m; width: ")
                .append(df.format(width)).append("m; weight: ")
                .append(df.format(weight)).append("t; ");

        if (ac || automaticTransmission || navigation || tempomat || elGlass) {
            car.append("Equipped with: ");
            if (ac) {
                car.append("AC ");
            }
            if (automaticTransmission) {
                car.append("Automatic Transmission ");
            }
            if (navigation) {
                car.append("Navigation ");
            }
            if (tempomat) {
                car.append("Tempomat ");
            }
            if (elGlass) {
                car.append("Electric glasses ");
            }
        } else {
            car.append("This car is not equipped with any extras. ");
        }
        car.append("Price: ").append(price).append("$");

        return car.toString();
    }

    public boolean hasAnyExtras() {
        return ac || automaticTransmission || navigation || tempomat || elGlass;
    }

    public void printCar() {
        System.out.printf("%-30s | %-10s | %-30s | %-20s | %-20s | %-10.2f | %-10.2f | %-10.2f |", brand, model, bodywork.toString(), color.toString(), super.getEngineType().toString(),
                length, width, weight);
        if (ac || automaticTransmission || navigation || tempomat || elGlass) {
            System.out.printf(" %-50s |", "Equipped with: ");
            if (ac) {
                System.out.printf(" %-25s |", "1");
            } else {
                System.out.printf(" %-25s |", "0");
            }
            if (automaticTransmission) {
                System.out.printf(" %-25s |", "1");
            } else {
                System.out.printf(" %-25s |", "0");
            }
            if (navigation) {
                System.out.printf(" %-25s |", "1");
            }
            else {
                System.out.printf(" %-25s |", "0");
            }
            if (tempomat) {
                System.out.printf(" %-25s |", "1");
            }
            else {
                System.out.printf(" %-25s |", "0");
            }
            if (elGlass) {
                System.out.printf(" %-25s |", "1");
            }
            else {
                System.out.printf(" %-25s |", "0");
            }
        } else {
            System.out.printf(" %-50s | %-25s | %-25s | %-25s | %-25s | %-25s |", "This car is not equipped with any extras. ", "0", "0", "0", "0", "0");
        }
        System.out.printf("%-10.2f |%n", price);
    }
}
