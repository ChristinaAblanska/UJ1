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

    public static void main(String[] args) {
        String sentence = "";
        Scanner scan = new Scanner(System.in);

        String askQustion_Bobi = "Добре.";
        String shoutQuestion_Bobi = "Спокоооо, знам к’во правя!";
        String shout_Bobi = "Споко бе, ман!";
        String noTalkingStare_Bobi = "Хубаво деее";
        String wiseAnswer_Bobi = "Ахъ.";

        while (!sentence.equals(".")) {
            System.out.print("Ти: ");
            sentence = scan.nextLine();
            if (sentence.isBlank()) {
                System.out.println("Боби: " + noTalkingStare_Bobi);
            } else if (sentence.equals(".")) {
                break;
            } else {
                boolean askQuestion = (sentence.charAt(sentence.length() - 1) == '?') && !sentence.equals(sentence.toUpperCase());
                boolean shoutQustion = (sentence.charAt(sentence.length() - 1) == '?') && sentence.equals(sentence.toUpperCase());
                boolean justShout = sentence.equals(sentence.toUpperCase()) && !(sentence.charAt(sentence.length() - 1) == '?') && !sentence.isBlank() && !sentence.equals(".");

                if (shoutQustion) {
                    System.out.println("Боби: " + shoutQuestion_Bobi);
                } else if (askQuestion) {
                    System.out.println("Боби: " + askQustion_Bobi);
                } else if (justShout) {
                    System.out.println("Боби: " + shout_Bobi);
                } else {
                    System.out.println("Боби: " + wiseAnswer_Bobi);
                }
            }
        }

        scan.close();
    }
}
