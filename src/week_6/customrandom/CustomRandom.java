package week_6.customrandom;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class CustomRandom extends Random {
    public ArrayList<Double> getRandomNumbers(double a, double b) {
        ArrayList<Double> result = new ArrayList<>();
        Random rand = new Random();
        int n = rand.nextInt(10);

        for (int i = 0; i < n; i++) {
            result.add(rand.nextDouble(a, b + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        CustomRandom test = new CustomRandom();
        System.out.println(test.getRandomNumbers(4.0, 25.1).toString());
    }
}
