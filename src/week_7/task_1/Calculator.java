package week_7.task_1;

public class Calculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            } else {
                continue;
            }
        }
        return sum;
    }
}
