package game.util;

import java.util.Random;

public class RandomBooleanGenerator {
    public static boolean generate(int truePercentage) {
        return new Random().nextInt(100) < truePercentage;
    }
}
