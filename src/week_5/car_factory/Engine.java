package week_5.car_factory;

import java.util.Random;

public enum Engine {
    PETROL, DIESEL, HYBRID, ELECTRIC;

    private static final Random RANDENGINE = new Random();

    public static Engine randomEngine() {
        Engine[] engines = values();
        return engines[RANDENGINE.nextInt(engines.length)];
    }
}
