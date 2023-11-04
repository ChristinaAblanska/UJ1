package week_4.Tasks_Exersise_week_4;

import java.util.Scanner;

//NumberOfDigits
//        Направете метод, който отпечатва броя на цифри в дадено число.
//
//        Направете програма, която очаква от потребителя да въведе цяло число и след това извиква горният метод, за да отпечата броят на цифрите във веведеното число.
public class Task_1_NumberOfDigits {
    public static int numberOfDigits(int n) {
        int count = 0;
        n = Math.abs(n);
        while (n >= 1) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = scan.nextInt();
        System.out.printf("The number of digits in %d is %d", n, numberOfDigits(n));

        scan.close();
    }
}
