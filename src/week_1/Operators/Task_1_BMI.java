package week_1.Operators;

//1. BMI
//Направете програма BMI, с която да изчислите моя Body Mass Index. Аз тежа 80кг и съм висок 171см. Ако съм съм надвишил малко теглото и съм Overweight напишете на екрана more training, less eating, ако не съм – напишете you rock!

public class Task_1_BMI {
    public static void main(String[] args) {
        double height = 1.79;
        double weight = 68.5;
        double bmi = weight / Math.pow(height, 2);

        System.out.println(bmi >= 18.5 && bmi <= 24.9 ? "you rock" : "more training, less eating");

    }
}
