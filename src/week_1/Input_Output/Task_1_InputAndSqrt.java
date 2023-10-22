package week_1.Input_Output;

import java.util.Scanner;

//InputAndSqrt
//        Напишете програма, която чете 1 число от конзолата, изчислява му корен квадратен и отпечатва резултата на екрана с точност до 5-тия знак след запетаята.
public class Task_1_InputAndSqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double myNum;

        if (scan.hasNextDouble()) {
            myNum = scan.nextDouble();
            double result = Math.sqrt(myNum);
            System.out.printf("%s %f %s %.5f", "The sq root of", myNum, "is", result);
        } else {
            System.out.println("Invalid input");
        }

        scan.close();
    }
}
