package week_2.Variables_Scope;

import java.util.Scanner;

//10. PrimeNumber
//
//        Направете програма, която очаква от потребителя да въведе число. След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.
//
//        Простото число може да се дели само на 1 и на себе си. Ако се дели на което и да е друго цяло число, тогава не е просто.
//
//        Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.
public class Task_10_PrimeNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int numberOfDividers = 1;

        if (n < 0) {
            n = Math.abs(n);
        }
        if (n == 0) {
            System.out.println("Undecided!");
            return;
        } else {
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    ++numberOfDividers;
                }
            }
        }

        System.out.println(numberOfDividers <= 1);

        scan.close();
    }
}
