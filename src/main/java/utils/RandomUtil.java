package utils;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();

    public static int getNumber(final int bound) {
        return random.nextInt(bound);
    }
}
