package racingcarGame.utils;

import java.util.Random;

public class GenerateNumber {
    public static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
