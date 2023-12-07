package week_8.Student.Demo;

import week_8.Student.School;
import week_8.Student.Student;

import java.util.Scanner;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School();
        Scanner scan = new Scanner(System.in);
        int countStudents = 0;
        char choice = 'Y';

        while (choice == 'Y') {
            System.out.println("New entry? Y/N");
            choice = scan.next().toUpperCase().charAt(0);
            if (choice == 'Y') {
                String firstName;
                String lastName;
                int age;
                int schoolClass;
                double avgGrade;

                System.out.println("First Name:");
                firstName = scan.next().toUpperCase();
                System.out.println("Last Name:");
                lastName = scan.next().toUpperCase();
                System.out.println("Age: ");
                age = Integer.parseInt(scan.next());
                System.out.println("School class: ");
                schoolClass = Integer.parseInt(scan.next());
                System.out.println("Average grade: ");
                avgGrade = Double.parseDouble(scan.next());

                if (countStudents < School.maxCountOfStudents) {
                    Student pupil = new Student(firstName, lastName, age, schoolClass, avgGrade);
                    school.addStudent(pupil);
                } else {
                    System.out.println("Too many students!");
                    return;
                }
            } else {
                break;
            }
        }

        System.out.println("All students' count: " + Student.countStudents);
        school.printStudents();
        school.printGraduates();

        System.out.println("Go to next class:");
        school.goToNextClass();
        school.printGraduates();

        System.out.println("All with flying colors:");
        school.getAllFlyingColors();

        System.out.println("All failed: ");
        school.getAllFailed();

        scan.close();
    }
}
