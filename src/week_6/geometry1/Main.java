package week_6.geometry1;

import java.util.Scanner;

//        double A2 = line2.getP().getY() - line2.getQ().getY();
//        double B2 = line2.getQ().getX() - line2.getP().getX();
//        double C2 = (line2.getP().getX() * line2.getQ().getY()) - (line2.getQ().getX() * line2.getP().getY());
//
//        double resultA = A1 / A2;
//        double resultB = B1 / B2;
//        double resultC = C1 / C2;
//
//        if ((resultA == resultB) && (resultA != resultC)) {
//        System.out.println("Успоредни са");
//        } else if ((resultA == resultB) && (resultA == resultC)) {
//        System.out.println("Съвпадат");
//        } else if (resultA != resultB) {
//        System.out.println("Пресичат се");
//        }

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create line 1: ");
        Line line1 = new Line();
        line1.readLine(scan);

        System.out.println("Create line 2: ");
        Line line2 = new Line();
        line2.readLine(scan);

        System.out.println(line1.toString());
        System.out.println(line2.toString());

        System.out.println(getCommonPosition(line1, line2));

        scan.close();
    }

    public static String getCommonPosition(Line l1, Line l2) {
        if (isCommonOx(l1) && isCommonOx(l2)) {
            return "Съвпадащи с Ox";
        } else if (isCommonOy(l1) && isCommonOy(l2)) {
            return "Съвпадащи с Oy";
        } else {
            double A1 = l1.getA().getY() - l1.getB().getY();
            double B1 = l1.getB().getX() - l1.getA().getX();
            double C1 = (l1.getA().getX() * l1.getB().getY()) - (l1.getB().getX() * l1.getA().getY());

            double A2 = l2.getA().getY() - l2.getB().getY();
            double B2 = l2.getB().getX() - l2.getA().getX();
            double C2 = (l2.getA().getX() * l2.getB().getY()) - (l2.getB().getX() * l2.getA().getY());

            double resultA = A1 / A2;
            double resultB = B1 / B2;
            double resultC = C1 / C2;

            if ((resultA == resultB) && (resultA != resultC)) {
                return "Успоредни";
            } else if ((resultA == resultB) && (resultA == resultC)) {
                return "Съвпадащи";
            } else if (resultA != resultB) {
                return "Пресичат се";
            }
            return null;
        }
    }

    public static boolean isCommonOx(Line line) {
        return line.getA().getY() == 0 && line.getB().getY() == 0;
    }

    public static boolean isCommonOy(Line line) {
        return line.getA().getX() == 0 && line.getB().getX() == 0;
    }
}

