package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//7. SortNames
//
//        Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
//
//        След това, имената се сортират в азбучен ред и се отпечатват на екрана.
public class Task_7_SortNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3; ++i) {
            System.out.printf("Please enter name #%d%n", i);
            names.add(scan.next());
        }

        Collections.sort(names);
        System.out.println(Arrays.toString(names.toArray()));
        scan.close();
    }
}
