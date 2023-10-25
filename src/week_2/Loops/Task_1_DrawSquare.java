package week_2.Loops;

import java.util.Scanner;

//DrawSquare
//        Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
//
//        # # # #
//
//        # # # #
//
//        # # # #
//
//        # # # #
public class Task_1_DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the square (0;30]: ");

        // Прочитаме размера на квадрата от конзолата
        // Проверяваме дали е въведено число
        // И дали това число е в интервала (0;30]
        if(scan.hasNextInt()) {
            size = scan.nextInt();
            if (size <= 0 || size > 30) {
                System.out.println("Invalid input!");
                return;
            }
        } else {
            System.out.println("Invalid input!");
            return;
        }

        // Печатаме квадрата с 2 вложени цикъла
        // Външният отговаря за редовете, вътрешният - за колоните
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }

        scan.close();
    }
}
