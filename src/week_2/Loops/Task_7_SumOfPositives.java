package week_2.Loops;

import java.util.Scanner;

//7. SumOfPositives
//
//        Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
//
//        Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг “Въведете положително число: “. Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
//
//        Отпечатайте :
//
//        Сумата с точност до вторият знак след десетичната запетая.
//
//        Кое е най-голямото въведено число
//
//        Кое е най-малкото въведено число
//
//        Помислете кой цикъл е най-добре да използвате? while, do-while или for?
public class Task_7_SumOfPositives {
    public static void main(String[] args) {
        double num;
        double sum = 0.0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Въведете положително число: ");
            num = scan.nextDouble();
            if (num > 0) {
                sum += num;
            }
            if (num < min && num != 0) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        } while (num > 0);

        System.out.printf("The sum is: %.2f%n", sum);
        System.out.printf("Max %.2f%n", max);
        System.out.printf("Min %.2f%n", min);

        scan.close();
    }
}
