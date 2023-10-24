package week_2.Conditionals;

import java.util.Scanner;

//Осигуровки
//        Направете програма, която изчислява осигуровките.
//
//        За целта потребителя трябва да въведе следните данни:
//
//        месечна заплата
//
//        години
//
//        Има 2 такси, които се плащат едната от служителя, а другата – от неговият работодател.
//
//        Законът изисква:
//
//        Ако заплатата е под 3000лв
//
//        Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
//
//        Ако служителя е над 55 години до 60 (включително) – 13% + 13%
//
//        Ако служителя е над 60 години до 65 (включително) – 7.5% + 9%
//
//        Ако служителя е над 65 – 5% + 7.5%
//
//        Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.
//
//        Отпечатайте:
//
//        първо колко е таксата за служителя
//
//        колко е таксата за работодателя
//
//        Не забравяйте, че можете да използвате вложени if-else структури.
//
//        Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
public class Task_5_Osigurovki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mothlyPay = 0.0;
        double employeeTax = 0.0;
        double employerTax = 0.0;
        int age;

        //Прочитаме данните от клавиатурата и извеждаме съобщение за грешка при невалиден вход
        System.out.println("Веведете месечна заплата: ");
        if (scan.hasNextDouble()) {
            mothlyPay = scan.nextDouble();
        } else {
            System.out.println("Грешни данни!");
            return;
        }

        System.out.println("Въведете своята възраст: ");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
        } else {
            System.out.println("Грешни данни!");
            return;
        }

        if (mothlyPay < 0 || age < 18 || age > 75) {
            System.out.println("Невалидни данни!");
            return;
        }

        //Изчисляваме данъците по зададената формула
        if (mothlyPay < 3000) {
            if (age <= 55) {
                employeeTax = mothlyPay * 0.2;
                employerTax = mothlyPay * 0.17;
            } else if (age > 55 && age <= 60) {
                employeeTax = mothlyPay * 0.13;
                employerTax = mothlyPay * 0.13;
            } else if (age > 60 && age <= 65) {
                employeeTax = mothlyPay * 0.075;
                employerTax = mothlyPay * 0.09;
            } else {
                employeeTax = mothlyPay * 0.05;
                employerTax = mothlyPay * 0.075;
            }
        } else {
            employeeTax = 3000 * 0.2;
            employerTax = 3000 * 0.2;
        }

        System.out.printf("Таксата на работника е %.2f\n", employeeTax);
        System.out.printf("Таксата на работодателя е %.2f", employerTax);

        scan.close();
    }
}
