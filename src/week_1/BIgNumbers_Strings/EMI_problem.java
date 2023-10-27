package week_1.BIgNumbers_Strings;

import java.math.BigDecimal;

import java.math.MathContext;
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
public class EMI_problem {
    public static void main(String[] args) {
        BigDecimal P = new BigDecimal("10000000");
//        double rFixed = 10.5;
//        int divisor = 12;
//        int n = 120;
        BigDecimal rFixed = new BigDecimal("10.5");
        BigDecimal divisor = new BigDecimal("12");
       // BigDecimal n = new BigDecimal( "120");// not used remove or n.intValue()
        int n_new = 120;
        BigDecimal bigHundred = new BigDecimal("100");
//        double r_monthly1 = (rFixed / divisor) / 100;
//        BigDecimal r_monthly = BigDecimal.valueOf(r_monthly1);
        BigDecimal percentage = rFixed
                .divide(bigHundred, new MathContext(9));
        BigDecimal r_monthly = percentage.divide(divisor, new MathContext(9));

        BigDecimal over = P.multiply(r_monthly)
                .multiply(BigDecimal.ONE.add(r_monthly))
                        .pow(n_new);
        BigDecimal under = BigDecimal.ONE.add(r_monthly)
                .pow(n_new).subtract(BigDecimal.ONE);

        System.out.println(under);
        BigDecimal perMonth = over.divide(under, RoundingMode.HALF_EVEN);

        System.out.println(perMonth.setScale(10, RoundingMode.HALF_EVEN));

    }
}
