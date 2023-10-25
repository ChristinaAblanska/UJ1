package week_2.Loops;

import java.util.Scanner;

//2. Factorial
//
//        Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
//
//        Потребителят може да въведе невалидно число (нула или отрицателно). Искайте да въведе число, докато не въведе положително.
//
//        Ако не си спомняте от математиката:
//
//        Факториел на 3 = 3 * 2 * 1
//
//        Факториел на 50 = 50 * 49 * 48 … * 2 * 1
public class Task_2_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        // Четем число от клавиатурата и проверяваме дали е положително
        // Ако е 0 или отрицателно, то искаме да се въведе положително
        System.out.println("Enter a positive integer: ");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            while (num <= 0) {
                System.out.println("Invalid input!\nEnter a positive integer!");
                num = scan.nextInt();
            }
        } else {
            // Мога ли някак да правя проверката за букви в горния цикъл, за да не излизам тук от програмата?
            System.out.println("Invalid input!\nEnter a positive integer!");
            return;
        }

        // Изчисляваме стойността на факторела
        int fact = 1;
        for (int i = 1; i <= num; ++i) {
            fact *= i;
        }

        System.out.printf("%d! = %d", num, fact);

        scan.close();
    }
}
