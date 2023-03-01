package game.domain;

public class CarPosition {

    private static final int MAX_RANDOM_NUM = 9;
    private static final int MIN_RANDOM_NUM = 0;
    private static final int MAX_MOVE_NUM = 9;
    private static final int MIN_MOVE = 4;
    private int carDistance = 0;

    public CarPosition(int moveNum) {
        if (MAX_RANDOM_NUM < moveNum || moveNum < MIN_RANDOM_NUM) {
            throw new IllegalArgumentException("0이상 9이하에 해당하는 랜덤값이 주어져야 합니다.");
        }else if (MIN_MOVE <= moveNum && moveNum <= MAX_MOVE_NUM) {
            this.carDistance = this.carDistance + 1;
        }
    }

    public int getDistance() {
        return this.carDistance;
    }

    public int plusCarDistance() {
        return this.carDistance + 1;
    }
}
