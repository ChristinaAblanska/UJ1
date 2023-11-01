package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Описание
//        1.FindListElement
//
//        Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
//
//        Напишете програма, която очаква потребителя да въведе число и след това намира на кой индекс се намира това число в даденият масив.
//
//        Ако числото не е в списъка, нека програмата отпечата -1.
//
//        Вижте метода ArrayList.indexOf()
//
//        Помните ли задачата FindElementIndex ? Сравнете леснотата на работа с масиви спрямо списъци.
public class Task_1_FindListElement {
    public static void main(String[] args) {
        ArrayList<Integer> intNums = new ArrayList<Integer>(Arrays.asList(1, 4, 6, 2, 10, 5));
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number: ");
        num = scan.nextInt();

        System.out.println(intNums.indexOf(num));
        scan.close();
    }

}
