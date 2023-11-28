package week_6.calculations;

import java.util.ArrayList;
import java.util.Random;

public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Adder();
        System.out.println(arithmetic.getClass());
        System.out.println(arithmetic.getClass().getSuperclass());

        Random rand = new Random();
        int n = rand.nextInt(2, 21);
//        int n = 2000000000; // свърши ни паметта
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(2, 21);
        }

        System.out.println(arithmetic.add(numbers));
    }

}
