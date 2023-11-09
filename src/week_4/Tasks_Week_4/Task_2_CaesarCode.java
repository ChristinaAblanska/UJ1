package week_4.Tasks_Week_4;

//2.CaesarCode
//
//        Caesar’s Code е една от най-проститите техники за криптиране. Всяка една буква от изречението е заменена с друга буква, която е (n) на брой позиции в азбуката.
//
//        Така ‘A’ се заменя с ‘D’, ‘B’, с ‘E‘ … ,’X’ със ‘A’ …, ‘Z’ със ‘C’.
//
//        Напишете програма която иска от потребителя да направи избор – дали да криптира или да декриптира.
//
//        Въвежда се кода (n) – броят на позицииите.
//
//        След това потребителят трябва да въведе стринг, който може да съдържа както малки, така и големи латински букви и съответно генерира криптиран стринг, или декодира въведеният стринг.
//
//        Резултатът винаги се печата само с големи букви.
//
//        В програмата си дефинирайте статични методи, наречете ги crypt & decrypt.

import java.util.Scanner;

public class Task_2_CaesarCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice = 'A';
        int code = 0;
        String text = "0";

        // get the choice - C or D (Crypt or Decrypt)
        while (choice != 'C' && choice != 'D') {
            System.out.println("Crypt or Decrypt, please enter C or D:");
            choice = scan.next().toUpperCase().charAt(0);
        }

        // get the code n
        while (code <= 0 || code > 100) {
            System.out.println("Please choose the coding number:");
            code = scan.nextInt();
        }

        // get the text
        while (!allLetters(text)) {
            String codeDecode = choice == 'C' ? "Crypting" : "Decrypting";
            System.out.printf("Please enter the text for %s: ", codeDecode);
            text = scan.next().toUpperCase();
        }

        if (choice == 'C') {
            String encrypted = crypt(text, code);
            System.out.println(encrypted);
        } else {
            String decrypted = decrypt(text, code);
            System.out.println(decrypted);
        }

    }

    private static String crypt(String text, int code) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            ch = (char) (ch + code);
            if (ch > 'Z') ch = (char) (ch - ('Z' - 'A') - 1);
            encryptedText.append(ch);
        }
        return encryptedText.toString();
    }

    private static String decrypt(String text, int code) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            ch = (char) (ch - code);
            if (ch <= 'A') ch = (char) (ch + ('Z' - 'A') + 1);
            encryptedText.append(ch);
        }
        return encryptedText.toString();
    }

    private static boolean allLetters(String text) {
        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < 'A' || text.charAt(i) > 'Z') {
                result = false;
                break;
            }
        }
        return result;
    }
}
