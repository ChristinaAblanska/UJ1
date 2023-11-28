package week_7.task_5;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.setSpeed(80);
        sedan.setRegularPrice(1500);
        ((Sedan)sedan).setLength(7);
        sedan.setColor("Blue");

        Car ford_1 = new Ford();
        ford_1.setSpeed(120);
        ford_1.setRegularPrice(2300);
        ford_1.setColor("Red");
        ((Ford)ford_1).setYear(2010);
        ((Ford)ford_1).setManufacturerDiscount(175);

        Car ford_2 = new Ford();
        ford_2.setSpeed(132);
        ford_2.setRegularPrice(2450);
        ford_2.setColor("Green");
        ((Ford)ford_2).setYear(2013);
        ((Ford)ford_2).setManufacturerDiscount(125);

        Car car = new Car();
        car.setSpeed(140);
        car.setRegularPrice(2000);
        car.setColor("Black");

        Car truck = new Truck();
        truck.setSpeed(75);
        truck.setRegularPrice(3200);
        truck.setColor("Gray");
        ((Truck)truck).setWeight(2900);

        Car sedan_1 = new Sedan();
        sedan_1.setSpeed(120);
        sedan_1.setRegularPrice(1800);
        ((Sedan)sedan_1).setLength(6);
        sedan_1.setColor("Orange");


        System.out.printf("%-20s | %-40s | %-20s | %-20s%n", "Name", "Instance of", "Regular Price", "Sale Price");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Sedan 1", sedan.getClass(), sedan.getRegularPrice(), sedan.getSalePrice());
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Sedan 2", sedan_1.getClass(), sedan_1.getRegularPrice(), sedan_1.getSalePrice());
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Ford 1", ford_1.getClass(), ford_1.getRegularPrice(), ford_1.getSalePrice());
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Ford 2", ford_2.getClass(), ford_2.getRegularPrice(), ford_2.getSalePrice());
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Car", car.getClass(), car.getRegularPrice(), car.getSalePrice());
        System.out.printf("%-20s | %-40s | %-20.2f | %-20.2f%n", "Truck", truck.getClass(), truck.getRegularPrice(), truck.getSalePrice());



    }
}
