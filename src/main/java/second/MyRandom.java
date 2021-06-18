package second;

import java.util.Random;

public class MyRandom {

    private final static Random random  = new Random();

    public static int getPosition(int lessThan) {
        return random.nextInt(lessThan);
    }
}
