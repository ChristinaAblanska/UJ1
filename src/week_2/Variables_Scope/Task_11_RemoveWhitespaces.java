package week_2.Variables_Scope;

import java.util.Scanner;

//11. RemoveWhitespaces
//
//        Направете програма, която очаква от потребителя да въведе изречение.
//
//        След въвеждане на изречението, вашата програма трябва да премахне всички празни символи и табулация от изречението и да го отпечата на екрана.
public class Task_11_RemoveWhitespaces {
    public static void main(String[] args) {
        String sentence;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sentence = scan.nextLine();

        String [] words = sentence.split(" |[ \t]");

        for (int i = 0; i < words.length; ++i) {
            System.out.print(words[i]);
        }

        scan.close();
    }
}
