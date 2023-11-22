package week_2.Variables_Scope;

public class Task_14_Bobi_1 {

}
//    public static boolean checkUppercase(String str) {
//        boolean result = false;
//        int len = str.length();
//
//
//        for (int i = 0; i < len - 2; ++i) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                result = true;
//                break;
//            }
//        }
//        return result;
//    }
//
//    public static boolean starePoint(String str) {
//        // Не знам как да го направя да чете нищо
//        return str.trim().isEmpty();
//    }
//
//    public static void main(String[] args) {
//        String sentence;
//        Scanner scan = new Scanner(System.in);
//        sentence = scan.nextLine();
//
//        String askQustion = "Добре.";
//        String shoutQuestion = "Спокоооо, знам к'во правя!";
//        String shout = "Споко бе, ман!";
//        String noTalkingStare = "Хубаво деее";
//        String wiseAnswer = "Ахъ.";
//
//        while (!sentence.equals(".")) {
//            // Ако зададем/викаме въпрос
//            if (!sentence.isEmpty() && sentence.charAt(sentence.length() - 1) == '?') {
//                if (checkUppercase(sentence)) {
//                    System.out.println(shoutQuestion);
//                } else {
//                    System.out.println(askQustion);
//                }
//            } else {
//                // Ако му извикаме
//                if (checkUppercase(sentence)) {
//                    System.out.println(shout);
//                } else if (starePoint(sentence)) { // Ако го гледаме без да казваме нищо
//                    System.out.println(noTalkingStare);
//                } else {
//                    System.out.println(wiseAnswer); // Каквото и друго да му кажем
//                }
//            }
//            sentence = scan.nextLine();
//        }
//
//        scan.close();
//
//    }
