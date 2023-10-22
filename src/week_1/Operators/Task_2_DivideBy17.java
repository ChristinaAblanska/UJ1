package week_1.Operators;

//import java.util.Random;

//2. DivideBy17
//Измислих си едно число – 8589935681. Чудя се дали се дели на 17.
//Напишете програма, която проверява дали числото се дели на 17. И ако е така – напишете на екрана yes, в противен случай напишете no.
//Подсказка – използвайте операторите ‘остатък от делене’ и ternary оператор.
public class Task_2_DivideBy17 {
    public static void main(String[] args) {
//        Random generator = new Random();
//        int myNUm = generator.nextInt();

        int myNUm = 15;
        System.out.println(((myNUm % 17) == 0) ? "Yes" : "No");
    }
}
