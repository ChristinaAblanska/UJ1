package week_5.students;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int schoolClass;
    private double avgGrade;

    public static int countStudents = 0;

    public Student(String firstName, String lastName, int age, int schoolClass, double avgGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.schoolClass = schoolClass;
        this.avgGrade = avgGrade;
        countStudents++;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String toString() {
        StringBuilder student = new StringBuilder();
        student.append(this.firstName).append(" ")
               .append(this.lastName).append(" - ")
               .append(this.age).append(" years; Class: ")
               .append(this.schoolClass).append(" - Average Grade: ")
               .append(this.avgGrade);
        return student.toString();
    }

    public void increaseAge() {
        this.age++;
    }

    public void increaseAge(int years) {
        this.age += years;
    }

    public void goToNextClass() {
        if (this.schoolClass < 12) {
            this.schoolClass++;
        }
    }

    public boolean isExcellent() {
        return this.avgGrade >= 5.5;
    }

    public boolean isVeryBad() {
        return this.avgGrade <= 2.5;
    }

}
