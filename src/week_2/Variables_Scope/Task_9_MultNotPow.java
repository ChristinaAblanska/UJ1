package week_2.Variables_Scope;

import java.util.Scanner;

//9. MultNotPow
//
//        Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.
//
//        Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.
//
//        Първото въведено число е x, a второто – y.
public class Task_9_MultNotPow {
    public static void main(String[] args) {
        int x;
        int y;
        int result = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X from x^y: ");
        x = scan.nextInt();
        System.out.println("Enter Y from x^y: ");
        y = scan.nextInt();

        if (y != 0) {
            for (int i = 1; i <= y; ++i) {
                result *= x;
            }
        }

        System.out.printf("%d ^ %d = %d%n", x, y, result);

        scan.close();
    }
}
