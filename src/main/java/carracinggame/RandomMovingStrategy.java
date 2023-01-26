package carracinggame;

import carracinggame.MovingStrategy;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private static final int FORWARD_NUM=4;
    private static final int MAX_BOUND=10;
    @Override
    public boolean movable() {
         return getRandomNumber()>=FORWARD_NUM;
    }
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
