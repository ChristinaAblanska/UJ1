package week_2.Loops;

import java.util.Scanner;

//5. PrintTriangle2
//
//        Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
//
//        # # # # # #
//
//        # # # # #
//
//        # # # #
//
//        # # #
//
//        # #
//
//        #
public class Task_5_PrintTriangle2 {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the triangle - (0; 30]: ");
        size = scan.nextInt();
        while (size <=0 || size > 30) {
            System.out.println("Invalid input!\nEnter the size of the square - (0; 30]:");
            size = scan.nextInt();
        }

        // Използваме 3 цикъла, външният отговаря за редовете
        // Първият вътрешен измества с определен брой интервали надясно
        // Втроият печата решетките
        for (int i = size; i >= 1; --i) {
            for (int k = 1; k <= size - i; ++k) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }

        scan.close();
    }
}
