package racingCar.domain;

public enum GameStatus {
    START, END;


    public boolean isEnd(int tryCount) {
        return tryCount == 0;
    }


    public boolean isStart() {
        return this == START;
    }
}
