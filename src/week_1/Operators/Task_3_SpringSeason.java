package week_1.Operators;

//3. SpringSeason
//        Напишете програма, в която дефинирате 2 int променливи – month & day. Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и false, в противен случай.
//        Нека:
//
//        month = 5
//        day = 1
public class Task_3_SpringSeason {
    public static void main(String[] args) {
        int month = 7;
        int day = 1;

        System.out.println(((month > 3 && month < 6) ||
                (month == 3 && day >= 20) ||
                (month == 6 && day <= 20)) ? "true" : "false");
    }
}