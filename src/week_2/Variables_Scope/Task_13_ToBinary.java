package week_2.Variables_Scope;

import java.util.Scanner;

//13. ToBinary
//
//        Нека потребителят въведе цяло положително число.
//
//        Тогава, използвайки цикъл, преобразувайте числото в двоичен вид и го разпечатайте на екрана, започвайки отзад напред.
//
//        Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101.
public class Task_13_ToBinary {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scan.nextInt();

        String result = "";

        while (n > 0) {
            int reminder = n % 2;
            result = result + reminder;
            n = n / 2;
        }

        for (int i = result.length() - 1; i >= 0 ; --i) {
            System.out.print(result.charAt(i));
        }

        scan.close();
    }
}
