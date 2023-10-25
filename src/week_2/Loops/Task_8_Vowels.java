package week_2.Loops;

//8. Vowels
//
//        Направете програма Vowels, която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.
//
//        Дължината на String можете да вземете чрез метода String.length(), например: “hello world”.length(). А за да вземете първият символ от стринга, ползвайте “hello world”.charAt(0)

import java.util.Scanner;

public class Task_8_Vowels {
    public static void main(String[] args) {
        String sentence;
        Scanner scan = new Scanner(System.in);
        int sumVol = 0;
        System.out.println("Enter a sentence: ");
        sentence = scan.nextLine().toLowerCase();

        int len = sentence.length();

        for (int i = 0; i < len; ++i) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' || sentence.charAt(i) == 'y') {
                ++sumVol;
            }
        }

        System.out.println(sumVol);
        scan.close();
    }
}
