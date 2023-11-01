package week_3.Lists;

//8. SumOfCouples
//
//        Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата и въвеждането продължава, докато въведе 0. (Игнорирайте нулата и не я слагайте в масива/списъка)
//
//        След това потребителят трябва да въведе още едно число sum.
//
//        Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.
//
//        Например, ако потребителят въведе числата [2, 3, 4, 5, 1] и след това въведе сумата 6, тогава трябва да отпечата:
//
//        2 4
//
//        5 1
//
//        Защото:
//
//        2 + 4 = 6
//
//        5 + 1 = 6
//
//        Тази задача често можете да видите и на техническо интервю за работа.

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_8_SumOfCouples {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int num;
        int sum;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            nums.add(num);
        } while (num != 0);
        nums.remove(nums.size() - 1);

        System.out.println("Enter the sum");
        sum = scan.nextInt();


        for (int i = 0; i < nums.size() - 1; ++i) {
            int current = nums.get(i);
            for (int j = i + 1; j < nums.size(); ++j) {
                if (current + nums.get(j) == sum) {
                    System.out.println(current + " " + nums.get(j));
                }
            }
        }
        //System.out.println(Arrays.toString(nums.toArray()));
        scan.close();
    }
}
