package game.domain;

import java.util.Random;

public class SixtyPercentChanceDrivableStrategy implements DrivableStrategy {
    @Override
    public boolean canMove() {
        return new Random().nextInt(10) >= 4;
    }
}
