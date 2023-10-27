package week_2.Variables_Scope;

//8. MultiplicationTable
//
//        Вашата програма очаква от потребителя да въведе число. След това отпечатва таблица за умножението на това число със всички числа от 1 до 10.
//
//        Изхода на екрана трябва да е подобен на този даден в примера.

import java.util.Scanner;

public class Task_8_MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = scan.nextInt();
        if (n < 0) {
            n = Math.abs(n);
        }

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d%n", n, i, n * i);
        }

        scan.close();
    }
}
