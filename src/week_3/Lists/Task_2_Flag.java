package week_3.Lists;

import java.util.Arrays;
import java.util.Scanner;

//2. Flag
//
//        Напишете програма, която отпечатва фигурата по-долу на екрана:
//
//        ██████████
//
//        ██████████
//
//        ██████████
//
//        Създайте масив, който да запълните със символа ‘u2588’, използвайки метода Array.fill().
//
//        Ако ви е интересно, можете да добавите цвят преди всеки ред като отпечатате стринга “�33[ЦВЯТm”, като за цвят имате следните числа:
//
//        39 = бял
//
//        32 = червен
//
//        31 = зелен
//
//        ! ВНИМАНИЕ ! – не пускайте решение с цвят, защото системата ще го приеме за грешно. Направете цвета, само ако сте любопитни и само на вашия компютър.
public class Task_2_Flag {
    public static final int WHITE = 39;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static void main(String[] args) {
        int height = 0;
        int width = 0;

        Scanner scan = new Scanner(System.in);
        // Четем височината на флага
        while (height <= 0) {
            System.out.println("Enter the height of the flag");
            height = scan.nextInt();
        }

        // Четем ширината на флага
        while (width <= 0) {
            System.out.println("Enter the width of the flag");
            width = scan.nextInt();
        }

        String[] flags = new String[width];
        Arrays.fill(flags, "\u2588");
        int[] color = {WHITE, GREEN, RED};

        for (int i = 0; i < 3; ++i) {
            for (int count = 0; count < height / 3; count++) {
                for (int j = 0; j < width; ++j) {
                    System.out.printf("\033[%dm%s", color[i], flags[j]);
                }
                System.out.print("\n");
            }
        }
    }
}
