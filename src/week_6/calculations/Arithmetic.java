package week_6.calculations;

public class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int a : numbers) {
            sum += a;
        }
        return sum;
    }
}
