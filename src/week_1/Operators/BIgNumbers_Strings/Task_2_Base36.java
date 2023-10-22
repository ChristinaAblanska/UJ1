package week_1.Operators.BIgNumbers_Strings;

//Base36
//        Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
//        Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9, така и всички букви от английската азбука – A до Z.
//        Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
//        Затова трябва да отпечатате числото 0x7DEDEDE1 в:
//
//        Двоичен формат (с представка 0b отпред)
//        Осмичен формат (с представка 0 отпред)
//        Десетичен формат
//        Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
//        36-тично, като всички букви са главни.

public class Task_2_Base36 {
    public static void main(String[] args) {
        String num = "7DEDEDE1";
        int myNumDecimal = Integer.parseInt(num, 16); //2112744929

        String myNumBinary = Integer.toBinaryString(myNumDecimal); //1111101111011011110110111100001
        String myNumOctal = Integer.toOctalString(myNumDecimal); //17573366741
        String myNumHex = Integer.toHexString(myNumDecimal); //7dedede1
        String myNum36 = Integer.toString(myNumDecimal, 36); //yxvgf5

        System.out.println("Binary - 0b" + myNumBinary);
        System.out.println("Octal - 0" + myNumOctal);
        System.out.println("Decimal - " + myNumDecimal);
        System.out.println("Hex - 0x" + myNumHex.toLowerCase());
        System.out.println("36 Base - " + myNum36.toUpperCase());
    }
}
