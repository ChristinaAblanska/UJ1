package week_8.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        Color color;
        Circle circle;

        System.out.println("Въведете дължина на радиус или 0 за радиус по подразбиране [1.0]:");
        radius = scan.nextDouble();

        if (radius == 0) {
            radius = 1;
        }

        System.out.println("Изберете цвят (1 за жълт, 2 за червен, 3 за зелен, 4 за син)]:");
        color = switch (scan.nextInt()) {
            case 1 -> Color.ЖЪЛТ;
            case 2 -> Color.ЧЕРВЕН;
            case 3 -> Color.ЗЕЛЕН;
            case 4 -> Color.СИН;
            default -> Color.randomColor();
        };

        circle = new Circle(radius, color);
        System.out.printf("Създаден е %s кръг с радиус %.2f и диаметър %.2f%n", color.toString(), radius, radius * 2);
        System.out.println();
        System.out.println("Изберете опция: \n" +
                        "1. Периметър \n" +
                        "2. Лице \n" +
                        "3. Луна ли е? \n" +
                        "4. Направи кръга луна \n" +
                        "5. Принтирай toString");

        switch (scan.nextInt()) {
            case 1 :
                System.out.printf("Периметърът на кърга е: %.2f%n", circle.getCircumference());
                break;
            case 2:
                System.out.printf("Лицето на кръга е: %.2f%n", circle.getArea());
                break;
            case 3:
                if (circle.getColor() == Color.ЖЪЛТ) {
                    System.out.printf("Кръгът е луна%n");
                } else {
                    System.out.printf("Кръгът не е луна%n");
                }
                break;
            case 4:
                if (circle.getColor() == Color.ЖЪЛТ) {
                    System.out.printf("Кръгът вече е луна. Няма да правя нищо.%n");
                } else {
                    circle.makeMeMoon();
                    System.out.printf("Готов. Направих кръга на луна%n");
                }
                break;
            case 5:
                System.out.println(circle.toString());
        }
    }
}
