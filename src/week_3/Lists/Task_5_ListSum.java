package week_3.Lists;

//5. ListSum
//
//        Напишете програма, която събира въведените от потребителя цели числа. Въвеждането продължава докато потребителя въведе 0.

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5_ListSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        Scanner scan = new Scanner(System.in);

        do {
            num = scan.nextInt();
            nums.add(num);
        } while (num != 0);

        int sum = 0;
        for (Integer n : nums) {
            sum += n;
        }

        System.out.println(sum);
        scan.close();
    }
}
