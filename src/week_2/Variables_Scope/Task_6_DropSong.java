package week_2.Variables_Scope;

//6. DropSong
//
//        Направете програма, която очаква потребителят да въведе някакво число.
//
//        След това ако числото се дели:
//
//        на 3 – отпечатва “Пльок”
//
//        на 5 – “Пляс”
//
//        на 7 – “Пльос”
//
//        Ако не се дели на нито едно от горните, се печата въведеното число. Въвеждането е в цикъл и продължава докато потребителят въведе числото 0.
//
//        При 0 трябва да отпечатате “Пльок Пляс Пльос” – защото 0 се дели без остатък на всички числа.
//
//        Примери: 28 се дели на 1, 2, 4, 7, 14, 28 – значи печатаме “Пльос” 30 се дели на 1, 2, 3, 5, 6, 10, 15, 30 – печатаме “Пльок Пляс” 34 се дели 1, 2, 17 и 34, така че просто отпечатваме “34”

import java.util.Scanner;

public class Task_6_DropSong {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();

        do {
            if (num == 0) {
                System.out.print("Пльок Пляс Пльос");
                break;
            }
            if (num % 3 == 0) {
                System.out.print("Пльок ");
            }
            if (num % 5 == 0) {
                System.out.print("Пляс ");
            }
            if (num % 7 == 0) {
                System.out.print("Пльос ");
            }
            if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
                System.out.print(num);
            }

            System.out.println();
            System.out.println("Enter a number: ");
            num = scan.nextInt();
        } while (num != 0);

        scan.close();
    }
}
