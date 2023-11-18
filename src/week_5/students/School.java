package week_5.students;

import java.util.ArrayList;

public class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Integer> classes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Integer> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Integer> classes) {
        this.classes = classes;
    }

    public void addStudent(Student pupil) {
        this.students.add(pupil);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void printGraduates() {
        for (Student student : students) {
            if (student.getSchoolClass() == 12) {
                System.out.println("Йееейй! Завърших!");
                System.out.println(student.toString());
            }
        }
    }

    public void goToNextClass() {
        for (Student student : students) {
            student.goToNextClass();
        }
    }

    public void getAllFlyingColors() {
        for (Student student : students) {
            if (student.getAvgGrade() >= 5.5) {
                System.out.println(student.toString());
            }
        }
    }

    public void getAllFailed() {
        for (Student student : students) {
            if (student.isVeryBad()) {
                System.out.println(student.toString());
            }
        }
    }
}
