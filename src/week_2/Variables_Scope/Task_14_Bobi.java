package week_2.Variables_Scope;

//14.  Боби
//
//        Боби е тийнейджър и има “изобилен” речник:
//
//        Ако го попиташ нещо, отговаря с “Добре.”
//
//        Ако му се развикаш (Нетикет: ТОВА Е ВИКАНЕ – т.е. ако сме написали всичко с главни букви, значи му викаме), той отговаря със “Споко бе, ман!”
//
//        Ако му извикаш въпрос, следва “Спокоооо, знам к’во правя!”
//
//        Ако просто го посочиш или го гледаш лошо, без да му говориш, той отговаря с “Хубаво деее”
//
//        На всичко останало, което му говориш, той кима мъдро и продумва тихо “Ахъ.”.
//
//        Направете програма, в която потребителят може да “говори” с Боби, въвеждайки изречение от конзолата в безкраен цикъл. В зависимост от въведеното изречение, програмата трябва да отпечата отговора на Боби.
//
//        Ако въведете точка програмата спира изпълнението си.
//
//        Ето примерен разговор:
//
//        Здрасти!
//
//        Ахъ.
//
//        Какво е това Ахъ?
//
//        Добре.
//
//        ЧУ ЛИ МЕ?
//
//        Спокоооо, знам к’во правя!
//
//        ТИ НЕ СИ ДОБРЕ!
//
//        Споко бе, ман!
//
//        Хубаво деее

import java.util.Scanner;

public class Task_14_Bobi {
    public static boolean checkUppercase(String str) {
        boolean result = true;
        int len = str.length();


        for (int i = 0; i < len - 2; ++i) {
            if (str.charAt(i) == ' '  || str.charAt(i) == ',') {
                continue;
            } else if (!Character.isUpperCase(str.charAt(i))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean starePoint(String str) {
        // Не знам как да го направя да чете нищо
        return str.equals("----") || str.equals("****");
    }

    public static void main(String[] args) {
        String sentence;
        Scanner scan = new Scanner(System.in);
        sentence = scan.nextLine();

        String askQustion = "Добре.";
        String shoutQuestion = "Спокоооо, знам к’во правя!";
        String shout = "Споко бе, ман!";
        String noTalkingStare = "Хубаво деее";
        String wiseAnswer = "Ахъ.";

        while (!sentence.equals(".")) {
            // Ако зададем/викаме въпрос
            if (sentence.charAt(sentence.length() - 1) == '?') {
                if (checkUppercase(sentence)) {
                    System.out.println(shoutQuestion);
                } else {
                    System.out.println(askQustion);
                }
            } else {
                // Ако му извикаме
                if (checkUppercase(sentence)) {
                    System.out.println(shout);
                } else if (starePoint(sentence)) { // Ако го гледаме без да казваме нищо
                    System.out.println(noTalkingStare);
                } else {
                    System.out.println(wiseAnswer); // Каквото и друго да му кажем
                }
            }
            sentence = scan.nextLine();
        }

        scan.close();
    }
}
