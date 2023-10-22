package week_1.Input_Output;

import java.util.Scanner;

//OddOrEven
//        Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
//        Ако числото е четно, трябва да се изпише “even” (без кавичките), а ако е нечетно – трябва да се изпише “odd”.
//
//        Подсказка: използвайте ternary оператора (?:)
public class Task_2_OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myNum;

        System.out.println("Please enter a number:");

        if (scan.hasNextInt()) {
            myNum = scan.nextInt();
            System.out.println(myNum % 2 == 0 ? "Even" : "Odd");
        } else {
            System.out.println("Invalid Input!");
        }

        scan.close();
    }
}
