package week_8.circle;

import java.util.Random;

public enum Color {
    ЖЪЛТ, СИН, ЗЕЛЕН, ЧЕРВЕН;

    private static final Random RANDCOLOR = new Random();

    public static Color randomColor() {
        Color[] colors = values();
        return colors[RANDCOLOR.nextInt(colors.length)];
    }
}
