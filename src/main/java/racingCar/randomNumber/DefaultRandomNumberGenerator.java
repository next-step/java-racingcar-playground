package racingCar.randomNumber;

import java.util.Random;

public class DefaultRandomNumberGenerator implements RandomNumber {

    private final Random random = new Random();

    @Override
    public int generate() {
        return random.nextInt(10);
    }
}

