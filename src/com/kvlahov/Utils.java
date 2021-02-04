package com.kvlahov;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static double getRandomDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
