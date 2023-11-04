package week_4.Tasks_Exersise_week_4;

import java.util.Scanner;

//SumNaturalNumbers
//        Целите, положителни числа 1,2,3 … се казват още натурални числа.
//
//        Нека вашата програма очаква от потребителя да въведе едно число и после използвайки рекурсивна функция, да изчисли сбора на всички числа от 1 до въведеното число.
public class Task_2_SumNaturalNumbers {
    public static int sumNaturalNums(int n) {
        if (n > 0) {
            return n + sumNaturalNums(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = -1;
        Scanner scan = new Scanner(System.in);

        while (n < 0) {
            System.out.println("Please enter a natural number:");
            n = scan.nextInt();
        }

        System.out.printf("The sum of the Natural Numbers till %d is %d", n, sumNaturalNums(n));

        scan.close();
    }
}
