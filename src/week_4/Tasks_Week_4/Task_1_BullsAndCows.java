package week_4.Tasks_Week_4;
//BullsAndCows
//        Бикове и крави е логическа игра за отгатване на цифри. Играе се от двама противника, като всеки се стреми да отгатне тайното число, намислено от другия. След всеки ход, противникът дава броя на съвпаденията.
//
//        Играта протича по следния начин. На лист хартия всеки участник написва своето тайно число. Тайните числа са четирицифрени, като цифрите не трябва да се повтарят. След това, последователно един след друг, играчите задават въпрос с предположение за числото на противника. Противникът отговаря, като посочва броя на съвпаденията – ако дадена цифра от предположението се съдържа в тайното число и се намира на точното място, тя е „бик“, ако е на различно място, е „крава“.
//
//        Пример:
//
//        Тайно число: 4271 Предположение: 1234 Отговор: „1 бик и 2 крави“. (Бикът е „2“, а кравите са „4“ и „1“.)
//
//        На всеки ход играчите записват предположените числа и отговорите, за да могат чрез дедукция да идентифицират цифрите в тайното число на противника.
//
//        Първият играч, който открие тайното число на противника, е победител. Тъй като участникът, който започва, има логическо предимство, победителят от предната игра ще играе втори на ход. В някои случаи всеки играч има равен брой ходове, така че, ако първият пръв открие числото на противника, вторият има право на още един ход и ако и той успее, играта завършва наравно.
//
//        Направете програма, в която единият играч се опитва да познае числото на вторият играч. Вижте примера и го следвайте стриктно.
//
//        Тайното число трябва да се въвежда от клавиатурата на същият ред, като подканващият стринг.

import java.util.Scanner;

public class Task_1_BullsAndCows {
    public static void main(String[] args) {
        String secretNum = "0000";
        Scanner scan = new Scanner(System.in);
        String guess = "0000";
        boolean guessed = false;

        // Validate the input data - only numbers
        System.out.print("Тайно число: ");
        secretNum = scan.next();
        while (!validateInput(secretNum)) {
            System.out.println("Невалидно число!");
            secretNum = scan.next();
        }

        while (!guessed) {
            System.out.print("Тайно число: " + secretNum + " Преположение: ");
            guess = scan.next();
            while (!validateInput(guess)) {
                System.out.println("Невалидно число!");
                guess = scan.next();
            }

            // check for bulls - return number of bulls
            int bulls = checkForBulls(secretNum, guess);
            if (bulls == 4) {
                // update win
                guessed = true;
                System.out.printf("Тайно число: %s Преположение: %s %nОтговор: 4 бика", secretNum, guess);
                break;
            } else { // check for cows - return number of cows
                int cows = checkForCows(secretNum, guess);
                System.out.printf("Тайно число: %s Преположение: %s %nОтговор: %d бика и %d крави", secretNum, guess, bulls, cows);
            }
            System.out.print("\n");
        }
    }

    private static int checkForCows(String secretNum, String guess) {
        int cows = 0;
        for (int i = 0; i < guess.length(); i++) {
            char containsDigit = guess.charAt(i);
            if (secretNum.contains(Character.toString(containsDigit)) && secretNum.charAt(i) != guess.charAt(i)) {
                cows++;
            }
        }
        return cows;
    }

    private static int checkForBulls(String secretNum, String guess) {
        int bulls = 0;
        if (secretNum.equals(guess)) {
            bulls = 4;
        } else {
            for (int i = 0; i < secretNum.length(); i++) {
                if (secretNum.charAt(i) == guess.charAt(i)) {
                    bulls++;
                }
            }
        }
        return bulls;
    }


    private static boolean validateInput(String str) {
        return str.length() == 4 && allDigits(str) && allDifferent(str.toCharArray());
    }

    private static boolean allDifferent(char[] charArr) {
        boolean allDigitsDifferent = true;
        for (int i = 0; i < charArr.length && allDigitsDifferent; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    allDigitsDifferent = false;
                    break;
                }
            }
        }
        return allDigitsDifferent;
    }

    private static boolean allDigits(String str) {
        return !str.isEmpty() && str.chars().allMatch(Character::isDigit);
    }
}
