package game.domain;

import game.utils.CarName;

public class Car {
    private final int MAX_MOVE = 9;
    private final int MIN_MOVE = 4;
    private CarName carName;
    private int position;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public Car(int position) {
        this.position = position;
    }

    public int move(int distance) {
        validPosition(distance);
        return this.position += 1;
    }

    private void validPosition(int position) {
        if (position > MAX_MOVE || position < MIN_MOVE) {
            throw new IllegalArgumentException("자동차는 최대 4이상 9이하 만큼만 움직일 수 있습니다.");
        }
    }
}
