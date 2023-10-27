package week_2.Variables_Scope;

import java.util.Scanner;

//4. CharFrequency
//
//        Направете програма, която очаква от потребителяt да въведе:
//
//        Изречение
//
//        Символ
//
//        Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
//
//        Метода str.charAt(i) връща символа от даденият стринг на позиция i.
public class Task_4_CharFrequency {
    public static void main(String[] args) {
        String sentence;
        char symbol;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sentence = scan.nextLine();
        System.out.println("Enter a symbol:");
        symbol = scan.next().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); ++i) {
            if (sentence.charAt(i) == symbol) {
                ++count;
            }
        }

        System.out.println(count);
        scan.close();
    }

}
