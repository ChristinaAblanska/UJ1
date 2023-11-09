package week_4.Tasks_Week_4;

import java.util.Scanner;

public class Task_6_TicTacToe {
    public static final char[][] FIELD = {{'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}};

    public static void main(String[] args) {
        boolean firsPlayer = true;
        boolean win = false;
        Scanner scan = new Scanner(System.in);
        int turns = 1;

        while (!win && turns <= 9) {
            printField(FIELD);
            makeMove(firsPlayer, scan);
            firsPlayer = !firsPlayer;
            win = checkForWinner(FIELD);
            if (win) {
                System.out.println("ПОБЕДА!");
            }
            turns++;
        }
        printField(FIELD);
    }

    private static boolean checkForWinner(char[][] field) {
        boolean win = false;
        for (int i = 0; i < 3 && !win; i++) {
            win = winRow(field, i);
        }
        for (int i = 0; i < 3 && !win; i++) {
            win = winCol(field, i);
        }

        win |= winDiag1(field);
        win |= winDiag2(field);

        return win;
    }

    private static boolean winRow(char[][] field, int row) {
        return field[row][0] == field[row][1] && field[row][1] == field[row][2];
    }

    private static boolean winCol(char[][] field, int col) {
        return field[0][col] == field[1][col] && field[1][col] == field[2][col];
    }

    private static boolean winDiag1(char[][] field) {
        return field[0][0] == field[1][1] && field[1][1] == field[2][2];
    }

    private static boolean winDiag2(char[][] field) {
        return field[0][2] == field[1][1] && field[1][1] == field[2][0];
    }

    private static void makeMove(boolean firsPlayer, Scanner scan) {
        boolean validMove = false;
        do {
            System.out.printf("Играч %d: ", firsPlayer ? 1 : 2);

            int move = scan.nextInt();
            if (move < 1 || move > 9) {
                System.out.println("Невалиден ход!");
                continue;
            }

            char symbol = firsPlayer ? 'X' : 'O';
            int i = (move - 1) / 3;
            int j = (move - 1) % 3;
            char current = FIELD[i][j];
            if (current == 'X' || current == 'O') {
                System.out.println("Позицията е заета!");
                continue;
            } else {
                FIELD[i][j] = symbol;
                validMove = true;
            }
        } while (!validMove);
    }

    private static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                switch (field[i][j]) {
                    case 'X':
                        System.out.print("\033[31mX\033[0m ");
                        break;
                    case 'O':
                        System.out.print("\033[32mO\033[0m ");
                        break;
                    default:
                        System.out.print(field[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
