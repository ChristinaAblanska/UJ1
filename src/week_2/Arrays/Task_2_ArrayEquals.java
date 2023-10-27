package week_2.Arrays;

//2. ArrayEquals
//
//        Нека имаме следният масив:
//
//        int[] myArray = { 1, 10, 15 };
//
//        Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
//
//        Сверете дали елементите на въведения масив е същият, като myArray и ако е, отпечатайте “true”, в противен случай – “false”.

import java.util.Scanner;

public class Task_2_ArrayEquals {

    public static boolean compareArrays(int [] arr1, int [] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        boolean equals = len1 == len2;
        for (int i = 0; i < len1 && equals; ++i) {
            if (arr1[i] != arr2[i]) {
                equals = false;
            }
        }

        return equals;
    }
    public static void main(String[] args) {
        int[] myArray = { 1, 10, 15 };
        Scanner scan = new Scanner(System.in);
        int len = myArray.length;
        int [] newArray = new int[len];

        for (int i = 0; i < len; ++i) {
            newArray[i] = scan.nextInt();
        }

        System.out.println(compareArrays(myArray, newArray));
        scan.close();
    }
}
