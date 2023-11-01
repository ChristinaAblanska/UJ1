package week_3.Multidimentionsl_Arrays;

import java.util.Scanner;

//2. TheMatrix
//
//        Направете програма, която:
//
//        Очаква потребителят да въведе редове (<10). Докато потребителят не въведе коректен ред, програмата продължава да го пита за броя на редовете. Използвайте подканващ стринг “Брой редове: “
//
//        Очаква потребителят да въведе колони (<10). Докато потребителят не въведе коректна колона, програмата продължава да го пита за броя на колоните. Използвайте подканващ стринг “Брой колони: “
//
//        Иска от него да въведе двете матрици, които са съставени от цели числа. Използвайте същите подканващи низове като в дадения пример.
//
//        След това тя трябва да отпечата:
//
//        Двете матрици една до друга. Отделете двете матрици с низа ” | “
//
//        стринга “Сумата на матриците е:” на отделен ред
//
//        Сборът им (поелементарна сума)
//
//        стрингът “Директната сумата на матриците е:” на отделен ред
//
//        Сборът им (пряка/директна сума)
//
//        Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравняване наляво.
//
//        За помощ използвайте wikipedia или MathIsFun
//
//        Наблегнете на валидирането на входните данни при въвеждане размера на матрицата.
public class Task_2_TheMatrix {
    public static void main(String[] args) {
        int row = 11;
        int col = 11;
        Scanner scan = new Scanner(System.in);

        // Четем редовете на матрицата
        while (row <= 0 || row > 10) {
            System.out.print("Брой редове (<=10): ");
            row = scan.nextInt();
        }

        // Четем колоните на матрицата
        while (col <= 0 || col > 10) {
            System.out.print("Брой колони (<=10): ");
            col = scan.nextInt();
        }
        System.out.print("\n");

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        // Четем първата матрица
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Елемент A[%d][%d] = ", i, j);
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.print("\n");

        // Четем втората матрица
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Елемент B[%d][%d] = ", i, j);
                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.print("\n");

        // Отпечатваме 2те матрици една до друга
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("%-4d", matrix1[i][j]);
            }
            System.out.print("|");
            for (int j = 0; j < col ; j++) {
                System.out.printf("%-4d", matrix2[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Отпечатва поелементна сума на матриците
        System.out.println("Сумата на матриците е:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", matrix1[i][j] + matrix2[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Отпечатва пряка директна сума на матриците
        System.out.println("Директната сумата на матриците е:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", matrix1[i][j]);
            }
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", 0);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", 0);
            }
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", matrix2[i][j]);
            }
            System.out.print("\n");
        }

        scan.close();
    }
}
