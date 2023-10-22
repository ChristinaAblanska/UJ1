package week_1.Operators;

//4. SpringSeason2
//        Напишете програма, в която дефинирате 2 int променливи – month & day.
//        Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и false, в противен случай.
//        Нека:
//
//        month = 4
//        day = 31
//        Проверихте ли внимателно какви са ви входните данни? Ами ако въведа ден 31 на месец, който няма 31 дни? Или пък въведа дата 40-ти май?
//
//        Да, прави сте! Това е същата задача като SpringSeason, но с различни входни данни.
public class Task_4_SpringSeason2 {
    public static void main(String[] args) {
        int month = 2;
        int day = 28;

        System.out.println(month % 2 == 0 && month < 8 && day > 30 ? "Invalid Period" :
                month == 2 && day > 28 ? "Invalid Period" :
                        month % 2 != 0 && month > 8 && day > 30 ? "Invalid Period" :
                                ((month > 3 && month < 6) ||
                                        (month == 3 && day >= 20) ||
                                        (month == 6 && day <= 20)) ? "true" : "false");
    }
}
