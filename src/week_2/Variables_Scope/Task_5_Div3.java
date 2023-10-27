package week_2.Variables_Scope;

//5. Div3
//
//        Изпишете не екрана на конзолата числата от 1 до 40 включително, които се делят без остатък на 3.
//
//        Нека всяко число, делящо се на 3, е отпечатано на отделен ред.
//
//        Използвайте оператора %.
public class Task_5_Div3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
