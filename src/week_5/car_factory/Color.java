package week_5.car_factory;

import java.util.Random;

public enum Color {
    BLUE, GREEN, RED, WHITE, BLACK, GRAY, YELLOW;

    private static final Random RANDCOLOR = new Random();

    public static Color randomColor() {
        Color[] colors = values();
        return colors[RANDCOLOR.nextInt(colors.length)];
    }

}
