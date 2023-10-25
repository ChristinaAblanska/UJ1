package week_2.Loops;

//6. ReverseNumber
//
//        Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
//
//        Ако числото е отрицателно – просто игнорирайте знака.
//
//        Подсказка: Нека имаме числото 456.
//
//        Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
//
//        Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
//
//        Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
//
//        Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.

import java.util.Scanner;

public class Task_6_ReverseNumber {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Invalid input!");
            return;
        }

        if (num < 0) {
            num = Math.abs(num);
        }

        int result = 0;
        String helper = Integer.toString(num);
        int i = helper.length();
        int reminder;

        do {
            --i;
            reminder = num % 10;
            result += (int) (reminder * Math.pow(10, i));
            num = num / 10;

        } while (num > 0);

        System.out.println(result);
        scan.close();
    }
}
