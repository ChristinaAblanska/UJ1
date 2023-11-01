package week_3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//10.
//
//        Напишете програма която:
//
//        Чете два списъка от конзолата
//        Извежда в конзолата тяхното обединение и сечение. Ползвайте ArrayList или LinkedList.
public class Task_10_UnionSubunion {
    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<Integer>();
        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        ArrayList<Integer> lsUniion = new ArrayList<Integer>();
        ArrayList<Integer> lsNoDublicates = new ArrayList<Integer>();
        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter an element from list 1:");
            num = scan.nextInt();
            ls1.add(num);
        } while (num != 0);
        ls1.remove(ls1.size() - 1);

        do {
            System.out.println("Enter an element from list 2:");
            num = scan.nextInt();
            ls2.add(num);
        } while (num != 0);
        ls2.remove(ls2.size() - 1);

        for (int i = 0; i < ls1.size(); ++i) {
            lsUniion.add(ls1.get(i));
        }
        for (int i = 0; i < ls2.size(); ++i) {
            lsUniion.add(ls2.get(i));
        }
//        System.out.println("List 1: " + Arrays.toString(ls1.toArray()));
//        System.out.println("List 2: " + Arrays.toString(ls2.toArray()));
        System.out.println("Union: " + Arrays.toString(lsUniion.toArray()));

        for (Integer n : lsUniion) {
            if (!lsNoDublicates.contains(n)) {
                lsNoDublicates.add(n);
            }
        }

        System.out.println("Section: " + Arrays.toString(lsNoDublicates.toArray()));
        scan.close();
    }
}
