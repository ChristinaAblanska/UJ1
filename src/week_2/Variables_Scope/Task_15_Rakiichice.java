package week_2.Variables_Scope;

//15. Ракийчице
//
//        Събрали сме плодове, направили сме си джибри и сега е време да преценим кога е най- добрият момент, в който да отидем до казана и да получим дълго чаканата си домашна ракийка.
//
//        Знаем, че процесът на ферментация е свързан с бактерии, които преработват захарта в алкохол. Освен тези приятни бактерии обаче, има и едни други, не толкова дружелюбни бактерии, които преобразуват алкохола в оцет.
//
//        Ако приемем, че в началото на процеса имаме 100% захар. За един ден бактериите преобразуват 10% (от наличната захар) в алкохол и 1% от алкохола в оцет.
//
//        След колко дни трябва да отидем до казана, така че да получим възможно най-много алкохол?

public class Task_15_Rakiichice {
    public static void main(String[] args) {
        double totalSugar = 100.;
        double alcohol = 10.;
        double alcoholQuantity = 0.;
        double vinegar = 1.;
        double vinegarQuantity = 0.;
        int days = 1;

        while (1 <= totalSugar) { //Не иска да изведе резултат тук с 0?
            alcoholQuantity += totalSugar * (alcohol / 100);
            vinegarQuantity += totalSugar * (vinegar / 100);

            totalSugar = totalSugar - (totalSugar * (alcohol / 100) + totalSugar * (vinegar / 100));
            days++;
        }

        System.out.printf("Total alcohol = %.2f%n", alcoholQuantity);
        System.out.printf("Total vinegar = %.2f%n", vinegarQuantity);
        System.out.printf("Sugar left: %.2f%n", totalSugar);
        System.out.println("Max days: " + days);
    }
}
