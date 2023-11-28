package week_4.Tasks_Week_4;

import java.util.Scanner;

//PrintPatterns
//        Напишете програма която отпечата следните текстови графики на екрана:
//        Потребителят трябва да въведе:
//
//        коя фигура иска да отпечата – a, b или c
//
//        размера на фигурата.
public class Task_5_PrintPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice = 'h';

        printFigures(6);
//        printFigureA(6);
//        System.out.println("a)");
//
//        printFigureB(6);
//        System.out.println("b)");
//
//        printFigureC(6);
//        System.out.println("c)");

        while (choice != 'a' && choice != 'b' && choice != 'c') {
            System.out.println("Choose a figure (a, b, c): ");
            choice = scan.next().toLowerCase().charAt(0);
        }

        int size = 0;
        while (size <= 0) {
            System.out.println("Size of the figure is:");
            size = scan.nextInt();
        }

        switch (choice) {
            case 'a':
                printFigureA(size);
                break;
            case 'b':
                printFigureB(size);
                break;
            case 'c':
                printFigureC(size);
                break;
        }

        scan.close();
    }

    private static void printFigures(int size) {
        String[] figA = createFigureA(size);
        String[] figB = createFigureB(size);
        String[] figC = createFigureC(size);

        for (int i = 0; i < size; i++) {
            System.out.printf("%s %s %s", figA[i], figB[i], figC[i]);
            System.out.print("\n");
        }
    }

    private static void printFigureC(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < (size * 2) - 1 - i; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private static String[] createFigureC(int size) {
        String[] figureC = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder currentRow = new StringBuilder();
            for (int j = 0; j <= size; j++) {
                currentRow.append(" ");
            }
            for (int k = i; k < (size * 2) - 1 - i; k++) {
                currentRow.append("#");
            }
            figureC[i] = currentRow.toString();
        }
        return figureC;
    }

    private static void printFigureB(int size) {
        for (int i = size; i >=1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * size) - (2 * i) - 1; k++) {
                System.out.print("#");
            }
            for (int j = 0; j <= (i * 2) + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * size) - (2 * i) - 1; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    private static String[] createFigureB(int size) {
        String[] figureB = new String[size];
        for (int i = size - 1; i >= 0; i--) {
            int curr = 0;
            StringBuilder currentRow = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                currentRow.append(" ");
            }
            for (int k = 0; k < (2 * size) - (2 * i) - 1; k++) {
                currentRow.append("#");
            }
            for (int j = 0; j <= (i * 2) + 1; j++) {
                currentRow.append(" ");
            }
            for (int k = 0; k < (2 * size) - (2 * i) - 1; k++) {
                currentRow.append("#");
            }
            figureB[curr] = currentRow.toString();
            curr++;
        }
        return figureB;
    }

    private static void printFigureA(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < (size * 2) - 1 - i; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private static String[] createFigureA(int size) {
        String[] figureA = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder currentRow = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                currentRow.append(" ");
            }
            for (int k = i; k < (size * 2) - 1 - i; k++) {
                currentRow.append("#");
            }
            figureA[i] = currentRow.toString();
        }
        return figureA;
    }
}
