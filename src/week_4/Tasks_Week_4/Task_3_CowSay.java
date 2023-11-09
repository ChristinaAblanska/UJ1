package week_4.Tasks_Week_4;
//3.CowSay
//
//        Linux командата cowsay показва на екрана една крава и билборд, на който пише произволен текст:
//
//        ——————————
//
//        | If you have Egyptian flu:  |
//
//        | you’re going to be a mummy |
//
//        ——————————
//
//        ^__^
//
//        (oo)_______
//
//        (__)       )/
//
//        ||—-w |
//
//        ||     ||
//
//        Напишете програма която имитира CowSay. Имайте предвид, че височината на билборда се мени в зависимост от размера на текста, но не и широчината!
//
//        Направете метод say(String text).
//
//        Стринга, който трябва да се отпечата се въвежда от клавиатурата.

import java.util.Scanner;

public class Task_3_CowSay {

    public static final String[] COW = {"^__^",
            "(oo)_______",
            "(__)       )/",
            "||—-w |",
            "||     ||"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("What did the cow say?");
        input = scan.nextLine();

        say(input);

        scan.close();
    }

    private static void say(String input) {
        // print billboard
        printBillboard(input);

        // print cow
        printCow(COW);
    }

    private static void printBillboard(String input) {
        if (input.length() > 30) {
            System.out.println("——————————\n");
            int i = 0;
            int j = i + 1;
            for (; i < (input.length() / 30); i++) {
                System.out.println("| " + input.substring(i * 30, ((j * 30) - 1)) + " |");
                j++;
            }

            if (input.length() % 30 != 0) {
                System.out.println("| " + input.substring((i * 30) - 1) + " |");
            }
            System.out.println("\n——————————");
        } else {
            System.out.println("——————————\n");
            System.out.println("| " + input + " |");
            System.out.println("\n——————————");
        }
    }

    private static void printCow(String[] cow) {
        for (String s : cow) {
            System.out.println("          " + s);
//            System.out.print("\n");
        }
    }
}
