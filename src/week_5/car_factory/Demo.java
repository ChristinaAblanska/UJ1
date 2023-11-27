package week_5.car_factory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int numberOfcars = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the required number of cars to be produced: ");
        numberOfcars = scan.nextInt();

        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < numberOfcars; i++) {
            boolean index = (i + 1) % 2 == 0;
            cars.add(prodeuceNewCar(index));
        }

        System.out.println("All cars produced: " + numberOfcars);
        System.out.println();
        System.out.println("All cars with extras: " + getNumberofExtras(cars));
        System.out.println();
        System.out.println("Different engines cars: ");
        getDifferentEngines(cars);
        System.out.println();
        // Table
        printAllCars(cars);
        System.out.println();
        // String
        printAllCarsString(cars);

    }

    private static void printAllCarsString(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    private static void getDifferentEngines(ArrayList<Car> cars) {
        int petrol = 0;
        int diesel = 0;
        int hybrid = 0;
        int electric = 0;

        for (Car car : cars) {
            switch (car.getEngine()) {
                case PETROL -> {
                    petrol++;
                    break;
                }
                case DIESEL -> {
                    diesel++;
                    break;
                }
                case HYBRID -> {
                    hybrid++;
                    break;
                }
                case ELECTRIC -> {
                    electric++;
                    break;
                }
            }
        }
            if (petrol > 0) {
                System.out.printf("%-30s | %-30d%n", "Petrol engines", petrol);
            }
            if (diesel > 0) {
                System.out.printf("%-30s | %-30d%n", "Diesel engines", diesel);
            }
            if (hybrid > 0) {
                System.out.printf("%-30s | %-30d%n", "Hybrid engines", hybrid);
            }
            if (electric > 0) {
                System.out.printf("%-30s | %-30d%n", "Electric engines", electric);
            }
    }

    private static int getNumberofExtras(ArrayList<Car> cars) {
        int numberOfExtras = 0;
        for (Car car : cars) {
            if (car.hasAnyExtras()) {
                numberOfExtras++;
            }
        }
        return numberOfExtras;
    }

    // Питай как да оправиш последните колони?
    private static void printAllCars(ArrayList<Car> cars) {
        System.out.printf("%-30s | %-10s | %-30s | %-20s | %-20s | %-10s | %-10s | %-10s | %-50s | %-25s | %-25s | %-25s | %-25s | %-25s |%-10s |%n",
        "Brand", "Model", "Bodywork", "Color", "Engine", "Length", "Width", "Weight", "Extras", "AC", "Automatic Transmission", "Navigation", "Tempomat", "ElGlass", "Price");
        for (Car car : cars) {
            car.printCar();
        }
    }

    private static Car prodeuceNewCar(boolean index) {
        Car newCar = new Car();
        Random randomNumber = new Random();

        newCar.setBrand(Brand.randomBrand());
        newCar.setModel(Model.randomModel());
        newCar.setBodywork(Bodywork.randomBodywork());
        newCar.setColor(Color.randomColor());

        newCar.setLength(2 + randomNumber.nextDouble(9.0));
        newCar.setWidth(2 + randomNumber.nextDouble(9.0));
        newCar.setWeight(300 + randomNumber.nextDouble(1700));

//        newCar.setEngine(EngineType.randomEngine());
          boolean[] extras = new boolean[5];

        while (index && countExtras(extras) < 2) {
            for(int i = 0; i < 5; i++) {
                extras[i] = randomNumber.nextBoolean();
            }
            newCar.setAc(extras[0]);
            newCar.setAutomaticTransmission(extras[1]);
            newCar.setNavigation(extras[2]);
            newCar.setTempomat(extras[3]);
            newCar.setElGlass(extras[4]);
        }

        newCar.setPrice(5000 + calculatePrice(newCar));

        return newCar;
    }

    public static int countExtras(boolean[] extras) {
        int count = 0;
        for (boolean extra : extras) {
            if (extra) {
                count++;
            }
        }
        return count;
    }
    public static double calculatePrice(Car newCar) {
        double price = 0;
        if (newCar.isAc()) {
            price += 1500;
        }
        if (newCar.isAutomaticTransmission()) {
            price += 3000;
        }
        if (newCar.isNavigation()) {
            price += 500;
        }
        if (newCar.isTempomat()) {
            price += 350;
        }
        if (newCar.isElGlass()) {
            price += 250;
        }
        return price;
    }
}
