package RacingGame.util;

import java.util.Random;

public class RandomNumber {
    public int genateRandomNumber() {
        Random generator = new Random();
        return generator.nextInt(9)+1;
    }
}
