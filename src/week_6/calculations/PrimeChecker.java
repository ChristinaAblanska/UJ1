package week_6.calculations;

public class PrimeChecker {
    public boolean checkPrime(int n) {
        boolean result = false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                result = true;
                break;
            }
        }
        return !result;
    }
}
