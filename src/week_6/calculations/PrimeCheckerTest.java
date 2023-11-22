package week_6.calculations;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeCheckerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values: ");
        n = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(n);
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter value %d ", i);
            nums.add(scan.nextInt());
        }

        PrimeChecker check = new PrimeChecker();
        for (Integer num : nums) {
            if (check.checkPrime(num)) {
                System.out.println(num);
            }
        }
    }
}
