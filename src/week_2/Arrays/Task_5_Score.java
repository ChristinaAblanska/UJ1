package week_2.Arrays;

//5. Score
//
//        Напишете програма, която подканва потребителя да въведе брой на състезателите и след това да въведе техния резултат в секунди и се записват в масив.
//
//        Отпечатва:
//
//        Всички резултати
//
//        Най-бързия
//
//        Най-бавния
//
//        Средно аритметично (avg)
//
//        Стандартно отклонение (standard deviation). За помощ:
//
//        сд1 = сумата от всички ( (елемент – avg) на квадрат)
//
//        сд = корен квадратен ( сд1 / броя на елементите)
//
//        Изкараният резултат трябва да е подобен на този в дадения пример!

import java.util.Scanner;

public class Task_5_Score {
    public static int sumArr (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static double sd1 (int [] arr, double avg) {
        double result = 0.;
        for (int i = 0; i < arr.length; ++i) {
            result += Math.pow(arr[i] - avg, 2);
        }
        return result;
    }

    public static void printArr (int [] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args) {
        int numOfPlayers;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of players:");
        numOfPlayers = scan.nextInt();
        while (numOfPlayers <= 0) {
            System.out.println("Invalid input!\nPlease enter valid number of players:");
            numOfPlayers = scan.nextInt();
        }

        int [] playersTime = new int[numOfPlayers];
        for (int i = 0; i < numOfPlayers; ++i) {
            System.out.printf("Player %d score: ", i);
            playersTime[i] = scan.nextInt();
        }

        int fastest = playersTime[0];
        int slowest = playersTime[0];
        for (int i = 1; i < numOfPlayers; ++i) {
            if (playersTime[i] < fastest) {
                fastest = playersTime[i];
            }
            if (playersTime[i] > slowest) {
                slowest = playersTime[i];
            }
        }

        double avg = (double) (sumArr(playersTime)) / numOfPlayers;
        double sd = sd1(playersTime, avg) / numOfPlayers;

        System.out.print("All playres' time: ");
        printArr(playersTime);
        System.out.println();
        System.out.printf("The fastest time %d%n", fastest);
        System.out.printf("The slowest time %d%n", slowest);
        System.out.printf("Average time %.2f%n", avg);
        System.out.printf("Standard deviation %.2f%n", sd);

        scan.close();
    }
}
