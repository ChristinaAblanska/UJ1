package week_2.Variables_Scope;

//12. SumNotMult
//
//        Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.
//
//        Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.
//
//        Първото въведено число е x, a второто – y.

import java.util.Scanner;

public class Task_12_SumNotMult {
    public static void main(String[] args) {
        int x;
        int y;
        int result = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X from x*y: ");
        x = scan.nextInt();
        System.out.println("Enter Y from x*y: ");
        y = scan.nextInt();

        if (0 != y) {
            for (int i = 1; i <= y; ++i) {
                result += x;
            }
        }
        System.out.printf("%d * %d = %d%n", x, y, result);

        scan.close();
    }
}