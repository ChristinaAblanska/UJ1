package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//6. Print3rd
//
//        Напишете програма, която изисква от потребителя да въвежда имена от конзолата, като въвеждането приключва, когато потребителя въведе точка (.).
//
//        Отпечатайте 3-тото въведено име на екрана.
//
//        Сортирайте списъка и отпечатайте сортирания списък.
//
//        Какво ще направите ако няма 3ти елемент? Може би съобщение за грешка?
public class Task_6_Print3rd {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        String name;
        Scanner scan = new Scanner(System.in);

        do {
            name = scan.next();
            names.add(name);
        } while (!name.equals("."));

        names.remove(".");
        
        if (names.size() < 3) {
            System.out.println("There is no 3rd name!");
            return;
        } else {
            System.out.println(names.get(2));
            Collections.sort(names);
            System.out.println(Arrays.toString(names.toArray()));
        }

        scan.close();
    }
}
