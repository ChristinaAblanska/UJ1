package week_2.Conditionals;

import java.util.Scanner;

//TaxCalculator
//        Напишете програма – калкулатор на данъците.
//
//        В България имаме плосък данък, което означава, че винаги имаме 10% данък независимо от заплатата ни. Но в някои държави данъка зависи от това колко ни е голяма заплатата.
//
//        Именно такъв калкулатор ще направим!
//
//        Като за начало, в нашата програма трябва да въведем годишната заплата.
//
//        След това да изчислим данъка както следва:
//
//        за първите 20000 няма данък
//
//        за вторите 20000 има данък от 10%, но само върху парите надвишаващи необлагаемите доходи.
//
//        за третите 20000 данъкът е както следва: ** 0 за първите 20000 ** 10% за вторите 20000 ** 20% за парите над 40000
//
//        всички пари над 60000 се таксуват с 30%
//
//        Пример: ако имам годишна заплата 83000, ще трябва да платя:
//
//        0 за първите 20к
//
//        10% от вторите 20к – т.е. 2000
//
//        20% от третите 20к – т.е. 4000
//
//        30% от останалите 23000 – т.е. 6900
//
//        или общо 12900
//
//        Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
public class Task_4_TaxCalculator {
    public static void main(String[] args) {
        double annual_salary = 0.0;
        double tax = 0.0;
        double helper = 0.0;
        Scanner scan = new Scanner(System.in);

        //Прочитаме годишната заплата от клавиатурата
        //Правим проверка за невалидни данни
        System.out.println("Enter your annual salary");
        if (scan.hasNextDouble()) {
            annual_salary = scan.nextDouble();
        } else {
            System.out.println("Invalid Input!");
            return;
        }

        // Изчисляваме данъците като добавяме съответната фиксирана стойност за всеки 2000
//        if (annual_salary <= 0) {
//            System.out.println("You poor thing... get a job!");
//            scan.close();
//            return;
//        } else
        if (annual_salary <= 20000) {
            System.out.println("You don't have any taxes");
        } else if (annual_salary > 20000 && annual_salary <= 40000){
            helper = annual_salary - 20000;
            tax = helper * 0.1;
        } else if (annual_salary > 40000 && annual_salary <= 60000) {
            helper = annual_salary - 40000;
            tax = 2000 + (helper * 0.2);
        } else {
            helper = annual_salary - 60000;
            tax = 6000 + (helper * 0.3);
        }

        System.out.printf("%.2f", tax);

        scan.close();
    }
}
