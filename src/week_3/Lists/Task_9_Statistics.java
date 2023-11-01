package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//9.
//
//        Напишете програма която:
//
//        Чете от конзолата числа които са елементи на List
//        Извежда следната информация за списъка: дължина, всички елементи
//        Сортира списъка и извежда резултата
//        Обръща елементите на списъка (1 2 3 -> 3 2 1)
//        Чете елементите на втори списък.
//        Сравнява двата списъка елемент по елемент и на всяка итерация извежда следното съобщение “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”
public class Task_9_Statistics {
    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        ArrayList<Integer> ls1_help = new ArrayList<Integer>();
        ArrayList<Integer> ls1_compare = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter an element:");
            num = scan.nextInt();
            ls1.add(num);
            ls1_help.add(num);
            ls1_compare.add(num);
        } while (num != 0);

        System.out.printf("%-20s | %-20d%n", "Size:", ls1.size());
        System.out.printf("%-20s | ", "List 1:");
        System.out.print(Arrays.toString(ls1.toArray()));
        System.out.print("\n");
        System.out.printf("%-20s | ", "List 1 Sorted:");
        Collections.sort(ls1);
        System.out.print(Arrays.toString(ls1.toArray()));
        System.out.print("\n");
        System.out.printf("%-20s | ", "List 1 Reversed:");
        Collections.reverse(ls1_help);
        System.out.print(Arrays.toString(ls1_help.toArray()));
        System.out.print("\n");


        do {
            System.out.println("Enter an element for list 2:");
            num = scan.nextInt();
            ls2.add(num);
        } while (ls2.size() < ls1.size());

        System.out.printf("%-20s | ", "List 2:");
        System.out.print(Arrays.toString(ls2.toArray()));
        System.out.print("\n");
        for (int i = 0; i < ls1.size(); ++i) {
            if (ls1_compare.get(i) > ls2.get(i)) {
                System.out.printf("Element %d from list 1 is GREATER than element %d from list 2%n", ls1_compare.get(i), ls2.get(i));
            } else if (ls1_compare.get(i) < ls2.get(i)) {
                System.out.printf("Element %d from list 1 is LESS than element %d from list 2%n", ls1_compare.get(i), ls2.get(i));
            } else {
                System.out.printf("Element %d from list 1 is EQUAL to element %d from list 2%n", ls1_compare.get(i), ls2.get(i));
            }
        }
        scan.close();
    }
}

