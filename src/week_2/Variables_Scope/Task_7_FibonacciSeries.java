package week_2.Variables_Scope;

//7. FibonacciSeries
//
//        Направете програма, която отпечатва първите n числа от серията на Фибоначи.
//
//        Серията на Фибоначи се състои от числа, където всяко едно число е сбор от предишните 2 числа. А първите 2 числа са 0 и 1. Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
//
//        Броят на числата n, които трябва да се отпечатат се въвеждат от конзолата.
//
//        Отпечатайте числата с един интервал между всяко едно число.

import java.util.Scanner;

public class Task_7_FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci numbers: ");
        n = scan.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println("0 1");
        } else {
            int n1 = 0;
            int n2 = 1;
            System.out.printf("%d %d ", n1, n2);
            for (int i = 2; i < n; ++i) {
                System.out.printf("%d ", n1 + n2);
                int help = n1;
                n1 = n2;
                n2 = help + n2;
            }
        }

        scan.close();
    }

}
