package week_8.car_factory.enums;

import java.util.Random;

public enum Model {
    M253, M256, M311, M900, M768, M21, M007, M987, M237, M888;
    private static final Random RANDMODEL = new Random();

    public static Model randomModel() {
        Model[] models = values();
        return models[RANDMODEL.nextInt(models.length)];
    }
}
