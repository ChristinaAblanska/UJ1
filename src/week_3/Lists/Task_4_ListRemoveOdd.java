package week_3.Lists;

//4. ListRemoveOdd
//
//        Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
//
//        Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка. Внимавайте с for-a – ако махнете първият елемент – вторият ще стане първи.
//
//        Може да почнете итерацията в обратен ред – отзад, напред

import java.util.ArrayList;
import java.util.Arrays;

public class Task_4_ListRemoveOdd {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 4, 6, 2, 10, 5));

        int i;
        if (nums.size() % 2 == 0) {
            i = nums.size() - 1;
        } else {
            i = nums.size() - 2;
        }

        for (; i > 0; i -= 2) {
            nums.remove(i);
        }

        System.out.println(nums);
    }
}
