package week_8.car_factory.enums;

import java.util.Random;

public enum EngineType {
    PETROL, DIESEL, HYBRID, ELECTRIC;

    private static final Random RANDENGINE = new Random();

    public static EngineType randomEngine() {
        EngineType[] engineTypes = values();
        return engineTypes[RANDENGINE.nextInt(engineTypes.length)];
    }
}
