package week_1.Operators.BIgNumbers_Strings;

import java.math.BigDecimal;

import java.math.RoundingMode;

//EMI
//        Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на определена дата всеки календарен месец. Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
//        Годишната вноска се изчислява по формулата:
//        Където:
//
//        P е заетата сума
//        r е годишната лихва
//        n е броят на вноските
//        За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.
//
//        Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5% и смятам да го изплатя за 10 години.
//
//        Колко ще е моята месечна вноска?
//
//        ИЗПОЛЗВАЙТЕ BigDecimal!
public class Task_1_EMI {
    public static void main(String[] args) {
        BigDecimal P = new BigDecimal("10000000");
        double rFixed = 10.5;
        int divisor = 12;
        int n = 120;
        //BigDecimal bigHundred = new BigDecimal("100");
        double r_monthly1 = (rFixed/divisor)/100;
        BigDecimal r_monthly = BigDecimal.valueOf(r_monthly1);

        BigDecimal over = (P.multiply(r_monthly)).multiply((BigDecimal.ONE.add(r_monthly)).pow(n));
        BigDecimal under = ((BigDecimal.ONE.add(r_monthly)).pow(n)).subtract(BigDecimal.ONE);

        BigDecimal perMonth = over.divide(under, RoundingMode.HALF_UP);

        System.out.println(perMonth.setScale(10, RoundingMode.HALF_UP));

    }
}
