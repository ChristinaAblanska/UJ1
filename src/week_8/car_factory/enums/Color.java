package week_8.car_factory.enums;

import java.util.Random;

public enum Color {
    BLUE, GREEN, RED, WHITE, BLACK, GRAY, YELLOW;

    private static final Random RANDCOLOR = new Random();

    public static Color randomColor() {
        Color[] colors = values();
        return colors[RANDCOLOR.nextInt(colors.length)];
    }

}
