package week_2.Variables_Scope;

import java.util.Scanner;

//3. CapitalizeString
//
//        Направете програма, която очаква потребителят да въведе едно цяло изречение.
//
//        Нека вашата програма прочете изречението и след това, ако започва с малка буква да я смени на голяма. Нека добави точка, ако изречението не завършва със символ за край на изречението – точка, удивителна или въпросителна.
public class Task_3_CapitalizeString {
    public static void main(String[] args) {
        String sentence;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        sentence = scan.nextLine();

        String firstLetter = sentence.substring(0, 1).toUpperCase();
        String sentenceNext = sentence.substring(1);
        String result = firstLetter + sentenceNext;


        int len = result.length();
        String lastSymbol = result.substring(len - 1, len);
        switch (lastSymbol) {
            case ".":
            case "?":
            case "!":
                break;
            default:
                result = result + ".";
        }

        System.out.println(result);
        scan.close();
    }
}
