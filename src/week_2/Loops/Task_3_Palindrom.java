package week_2.Loops;

import java.util.Scanner;

//3.Palindrom
//
//        Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
//
//        Игнорирайте малки-големи букви.
//
//        Ако думата е палиндром, да отпечата true, в противен случай false.
//
//        Палиндром е дума, която се чете еднакво отпред и отзад. Например следните думи са палиндроми: mom, radar, nikokin
//
//        Тази задача е една от най-често срещаните при технически интервюта.
public class Task_3_Palindrom {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = scan.next().toLowerCase();

        int len = word.length();
        int i = 0;
        int j = len - 1;
        boolean flag = true;

        // Използваме 2 утератора, които да обхождат думата едновременно то 2те страни буква по буква, стигайки до средата
        while (flag && i <= (len / 2) - 1 && j >= (len / 2)) {
            if (word.charAt(i) != word.charAt(j)) {
                flag = false;
            }
            ++i;
            --j;
        }

        System.out.println(flag);
        scan.close();
    }
}
