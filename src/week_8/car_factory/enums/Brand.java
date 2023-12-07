package week_8.car_factory.enums;

import java.util.Random;

public enum Brand {
    AUDI, BMW, OPEL, WV, MERCEDES, KIA, HONDA, FERRARI, MCLAREN;

    private static final Random RANDBRAND = new Random();

    public static Brand randomBrand() {
        Brand[] brands = values();
        return brands[RANDBRAND.nextInt(brands.length)];
    }
}
