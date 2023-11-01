package week_3.Multidimentionsl_Arrays;


//PascalTriangle
//        В лекцията имаше пример за така нареченият тригълник на Паскал. Допълнете програмата, така че да разпечата този триъгълник на екрана.
//
//        Нека n = 5, a елементите на тригълника да са отделени от 1 празен символ. Вижте примера долу, който е за 3 елемента.

import java.util.Scanner;

public class Task_1_PascalTriangle {
    public static void main(String[] args) {
        int n = -1;
        Scanner scan = new Scanner(System.in);

        while (n <= 0) {
            System.out.println("Enter the size of the triangle: ");
            n = scan.nextInt();
        }

        int[][] pascal = new int[n][];
        for (int i = 0; i < pascal.length; ++i) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; ++j) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= n - i; k++) { // започваме от 1, за да махнем интервала на последния ред
                System.out.print(" "); // с табулация излиза по-добре за големи числа
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", pascal[i][j]);
            }
            System.out.print("\n");
        }

    scan.close();
    }
}
