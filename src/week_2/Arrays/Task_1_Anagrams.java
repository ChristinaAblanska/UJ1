package week_2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Anagrams
//        Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и false, ако не са. Абстрахирайте се от големината на буквите.
//
//        Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви, които са в разбъркан ред.
//
//        Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи. За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.
//
//        Не забравяйте един от най-добрите приятели на програмиста – не кучето, а класът Arrays. Той може да ви е от изключителна полза.
public class Task_1_Anagrams {
    public static void main(String[] args) {
        String word1;
        String word2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word 1:");
        word1 = scan.next().toLowerCase();
        System.out.println("Enter word 2:");
        word2 = scan.next().toLowerCase();

        char [] word1Chars = word1.toCharArray();
        Arrays.sort(word1Chars);
        char [] word2Chars = word2.toCharArray();
        Arrays.sort(word2Chars);

        int word1Len = word1Chars.length;
        int word2Len = word2Chars.length;
        boolean equals = word1Len == word2Len;
        for (int i = 0; i < word1Len && equals; ++i) {
            if (word1Chars[i] != word2Chars[i]) {
                equals = false;
            }
        }

        System.out.println(equals);
        scan.close();
    }
}
