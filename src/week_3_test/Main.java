package week_3_test;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfGrades = 5;
//        Scanner scan = new Scanner(System.in);
        GradesTacker gradesBook = new GradesTacker();
        populateList(gradesBook, numberOfGrades);

//        for (int i = 0; i < numberOfGrades; i++) {
//            System.out.println("Enter garde: ");
//            if (scan.hasNextDouble()) {
//                gradesBook.addGrade(scan.nextDouble());
//            } else {
//                System.out.println("Invalid entry, please try again!");
//                i--;
//            }
//        }

        gradesBook.printGrades();
        System.out.println("Average Grade = " + gradesBook.averageGrade());
        System.out.println("Min Grade = " + gradesBook.getMinGrade());
        System.out.println("Max Grade = " + gradesBook.getMaxGrade());

//        gradesBook.removeGrade(5);
//        gradesBook.printGrades();


    }

    public static void populateList(GradesTacker grades, int size) {
        Random randomizer = new Random();

        for (int i = 0; i < size; i++) {
            grades.addGrade(2 + randomizer.nextInt(5));
        }
    }
}
