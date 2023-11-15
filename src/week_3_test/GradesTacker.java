package week_3_test;

import java.util.ArrayList;
import java.util.Arrays;

public class GradesTacker {
    private final ArrayList<Double> grades;

    public GradesTacker() {
        this.grades = new ArrayList<>();
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }
    public boolean addGrade(double grade) {
       return this.grades.add(grade);
    }

    public boolean removeGrade(double grade) {
        return  this.grades.remove(grade);
    }

    public void printGrades() {
        System.out.println(Arrays.toString(grades.toArray()));
    }

    public double averageGrade() {
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double getMinGrade() {
        double min = Double.MAX_VALUE;
        for (Double grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public double getMaxGrade() {
        double max = Double.MIN_VALUE;
        for (Double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
