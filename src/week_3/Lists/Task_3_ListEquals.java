package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//3.ListEquals
//
//        Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
//
//        Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
//
//        Сверете дали елементите на въведения списък са същите като в първия и ако са, отпечатайте “true”, в противен случай – “false”.
//
//        Кой метод трябва да използвате тук?
public class Task_3_ListEquals {
    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(1, 10, 15 ));
        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.printf("Please enter number %d%n", i);
            ls2.add(scan.nextInt());
            ++i;
        }

        System.out.println(ls1.equals(ls2));
        scan.close();
    }
}
