package week_2.Conditionals;

import java.util.Scanner;

//1. BigOne
//
//        Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
//
//        Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
//
//        Например: “резултатът е 10” e невалидно.
public class Task_1_BigOne {
    public static void main(String[] args) {
        double num_1;
        double num_2;
        Scanner scan = new Scanner(System.in);

        //Проверяваме дали потребителят е въвел число
        //ако не излизаме от програмата
        System.out.println("Enter the first number: ");
        if (scan.hasNextDouble()) {
            num_1 = scan.nextDouble();
        } else {
            System.out.println("Invalid input!");
            return;
        }

        //Проверяваме дали потребителят е въвел число
        //ако не излизаме от програмата
        System.out.println("Enter the second number: ");
        if (scan.hasNextDouble()) {
            num_2 = scan.nextDouble();
        } else {
            System.out.println("Invalid Input!");
            return;
        }

        //Проверяваме кое е по-голямото число
        if (num_1 >= num_2) {
            System.out.println(num_1);
            scan.close();
            return;
        } else {
            System.out.println(num_2);
            scan.close();
            return;
        }
    }
}
