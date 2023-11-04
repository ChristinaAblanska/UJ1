package week_2.Conditionals;

import java.util.Scanner;

//3. NumberOfWords
//
//        Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
//
//        Използване на String.split().length за да определите броят на думите.
//
//        Ако са повече от 10 – просто отпечатва “твърде дълго изречение” (без кавичките)
public class Task_3_NumberOfWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Веведете изречение: ");
       // String sentence = scan.nextLine();
        int len = scan.nextLine().split("\\s+").length;

        //Брои една дума заради \n
        //Сплитва на интервал и ако имаме само 1 запетая я брои като отделна дума, да правим ли проверка, ще трябва цикъл
        if (len > 0 && len <= 10) {
            System.out.println(len);
        } else {
            System.out.println("твърде дълго изречение");
        }

        scan.close();
    }
}
