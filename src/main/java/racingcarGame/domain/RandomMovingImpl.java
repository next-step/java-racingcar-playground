package racingcarGame.domain;

import java.util.Random;

public class RandomMovingImpl implements MovingStrategy{
    private static final int MAX_BOUND = 10;
    private static final int FORWARD_NUM = 4;
    @Override
    public boolean movable() {
        return getRandomNo() >= FORWARD_NUM;
    }


    private int getRandomNo() {
        Random rand = new Random();
        return rand.nextInt(MAX_BOUND);
    }
}
