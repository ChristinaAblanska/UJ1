package week_4.Tasks_Week_4;

//MinGap
//        Напишете програма, която очаква потребителя да въведе масив от int числа от конзолата. След това този масив се подава на статичен метод computeMinGap(array), който връща най-малката разлика м/у числата.
//
//        Например при следният масив:
//
//        int[] array = {1,3,6,7,12};
//
//        Имаме следните разлики – 2 (3-1), 3 (6-3), 1 (7-6), 5 (12-7). Така, че при този масив, функцията трябва да върне 1.
//
//        Имайте предвид, че разликата може и да е отрицателна, например при масива {3, 5, 10, 11, 4, 8}. В този случай разликата -7 (4-11) е най-малката и именно това е резултата, който трябва да върне функцията.
//
//        Макар и на пръв поглед безмислена, информацията от тази програма може да е полезна. Например, ако върнатият резултат е >= 0, тогава сте сигурни, че масива е сортиран (от по-малко към по-голямо). Ако резултата е >0, освен, че е сортиран, масивът също така съдържа само уникални числа.
//
//        Програмата очаква от потребителя:
//
//        броят на числата, които ще се въвеждат
//
//        всички числа

import java.util.Scanner;

public class Task_4_MinGap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.println("Enter the size of the array: ");
            n = scan.nextInt();
        }

        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element [%d]: ", i);
            numbers[i] = scan.nextInt();
        }

        System.out.println(minGap(numbers));
        scan.close();
    }

    private static int minGap(int[] numbers) {
        int[] mins = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            mins[i] = numbers[i + 1] - numbers[i];
        }
        return minimum(mins);
    }

    private static int minimum(int[] mins) {
        int min = mins[0];
        for (int i = 1; i < mins.length; i++) {
            if (mins[i] < min) {
                min = mins[i];
            }
        }
        return min;
    }
}
