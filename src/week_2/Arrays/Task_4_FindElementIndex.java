package week_2.Arrays;

import java.util.Scanner;

//4. FindElementIndex
//
//        Нека имаме следният масив:
//
//        int[] myArray = { 1, 4, 6, 2, 10, 5 };
//
//        Напишете програма, която очаква потребителят да въведе число и след това намира на кой индекс се намира това число в дадения масив.
//
//        Ако числото не е в масива, нека програмата отпечата -1.
public class Task_4_FindElementIndex {
    public static void main(String[] args) {
        int[] myArray = { 1, 4, 6, 2, 10, 5 };
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();

        int index = -1;
        for (int i = 0; (i < myArray.length) /*&& (index > -1)*/; ++i) { //Защо не работи с това условие?
            if (num == myArray[i]) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        scan.close();
    }
}
