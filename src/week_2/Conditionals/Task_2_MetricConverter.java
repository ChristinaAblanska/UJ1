package week_2.Conditionals;

import java.util.Scanner;

//MetricConverter
//        Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
//
//        Ето таблицата за конвертиране на 1 meter (m):
//
//        1000 millimeters (mm)
//
//        100 centimeters (cm)
//
//        0.000621371192 miles (mi)
//
//        39.3700787 inches (in)
//
//        0.001 kilometers (km)
//
//        3.2808399 feet (ft)
//
//        1.0936133 yards (yd)
//
//        Програмата трябва да очаква от потребителя да въведе следните данни:
//
//        дължината, която трябва да се конвертира
//
//        нейната метрична единица
//
//        към коя метрична единица да се конвертира
//
//        Използвайте switch вместо вложени if-else. Ако не е валидна матрична единица отпечатайте грешка и излезте от програмата
public class Task_2_MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = 0.0;
        double len = 0.0;
        String from;
        String to;

        //Прочитаме дължината от клавиатурата
        System.out.println("Enter the required length: ");
        if (scan.hasNextDouble()) {
            length = scan.nextDouble();
            len = length;
        } else {
            System.out.println("Error! Invalid input!");
            return;
        }

        // Прочитаме към от каква метрична единица конвертираме.
        // Конвертираме прочетената стойност до малки бъкви,
        // за да избегнем допълнителни проверки.
        // Според нея конвертираме въведената дължина в метри.
        // Ако единицата, от която конвертираме, е метър, тогава не я пипаме
        System.out.println("From (m, mm, cm, mi, in, km, ft, yd): ");
        from = scan.next().toLowerCase();
        switch (from) {
            case "m":
                break;
            case "mm":
                length = length / 1000;
                break;
            case "cm":
                length = length / 100;
                break;
            case "mi":
                length = length / 0.000621371192;
                break;
            case "in":
                length = length / 39.3700787;
                break;
            case "km":
                length = length / 0.001;
                break;
            case "ft":
                length = length / 3.2808399;
                break;
            case "yd":
                length = length / 1.0936133;
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        double result;
        // Прочитаме към каква мерна единица конвертираме.
        // Конвертираме прочетената стойност до малки бъкви,
        // за да избегнем допълнителни проверки.
        // Извършваме самото конвертиране от метри към желаната мерна единица
        System.out.println("To (m, mm, cm, mi, in, km, ft, yd): ");
        to = scan.next().toLowerCase();
        switch (to) {
            case "m":
                System.out.printf("%.4f %s is %.4f %s", len, from, length, to);
                break;
            case "mm":
                result = length * 1000;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "cm":
                result = length * 100;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "mi":
                result = length * 0.000621371192;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "in":
                result = length * 39.3700787;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "km":
                result = length * 0.001;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "ft":
                result = length * 3.2808399;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            case "yd":
                result = length * 1.0936133;
                System.out.printf("%.4f %s is %.4f %s", len, from, result, to);
                break;
            default:
                System.out.println("Error! Invalid input!");
                return;
        }
        scan.close();
    }
}
