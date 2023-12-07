package week_8.Student.Demo;

import week_8.Student.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student joro = new Student("Georgy", "Yanakiev", 34, 5, 4.5);
        Student hrisi = new Student("Christina", "Ablanska", 32, 10, 6.);
        Student marti = new Student("Martin", "Yanakiev", 9, 1, 5.5);

        System.out.println(joro.toString());
        System.out.println(hrisi.toString());
        System.out.println(marti.toString());

        joro.increaseAge();
        hrisi.increaseAge(2);
        marti.increaseAge();
        marti.goToNextClass();

        System.out.println();
        System.out.println(joro.toString());
        System.out.println(hrisi.toString());
        System.out.println(marti.toString());
    }
}
