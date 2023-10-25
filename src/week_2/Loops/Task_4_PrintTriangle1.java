package week_2.Loops;

import java.util.Scanner;

//4.PrintTriangle1
//
//        Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
//
//        1 2 3 4 5
//
//        1 2 3 4
//
//        1 2 3
//
//        1 2
//
//        1
public class Task_4_PrintTriangle1 {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the triangle - (0; 30]: ");
        size = scan.nextInt();
        while (size <=0 || size > 30) {
            System.out.println("Invalid input!\nEnter the size of the square - (0; 30]:");
            size = scan.nextInt();
        }

        // Използваме 2 цикъла, като вътрешния отговаря за колоните и е растящ,
        // а външният намалява и отговаря за редовете
        for (int i = size; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%d ", j);
            }
            System.out.print("\n");
        }

        scan.close();
    }
}
