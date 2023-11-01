package week_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

//Напишете програма която:
//
//        Чете елементите на един списък от конзолата
//        Извежда в конзолата двойките индекси (i, j) на елементите които удовлетворяват следното условие: Ai*Aj<=max(Ai, Ai+1, … Aj), i<j
//Например ако имаме списък с елементи 1 1 2 4 2 тогава очакваният изход е (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 5)
public class Task_12_Couples {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<String> pairs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            ls.add(num);
        } while (num != 0);
        ls.remove(ls.size() - 1);

        System.out.println(ls);

        for (int i = 0; i < ls.size() - 1; i++) {
            for (int j = i + 1; j < ls.size(); j++) {
                int max_aij = ls.get(i);
                for (int k = i; k <= j; k++) {
                    max_aij = Math.max(max_aij, ls.get(k));
                }


//                if (ls.get(i) * ls.get(j) <= max_aij) {
//                    String pair = "(" + i + "," + j  + ")";
//                    pairs.add(pair);
//                }
                if (ls.get(i) * ls.get(j) <= max_aij) {
                    String pair = "(" + (i + 1) + "," + (j + 1) + ")";
                    pairs.add(pair);
                }
            }
        }

        System.out.println("Двойките, отговарящи на даденото условие са:");
        for (String pair : pairs) {
            System.out.println(pair);
        }

    scan.close();
    }
}
