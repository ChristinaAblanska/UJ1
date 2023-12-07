package week_8.car_factory.enums;

import java.util.Random;

public enum Bodywork {
    COUPE, HEDGEBACK, VAN, MIMIVAN, COMBI;

    private static final Random RANDBODY = new Random();

    public static Bodywork randomBodywork() {
        Bodywork[] bodyworks = values();
        return bodyworks[RANDBODY.nextInt(bodyworks.length)];
    }
}
