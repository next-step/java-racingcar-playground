package racingcar;

public class RacingGame {
    private Cars cars;
    private int gameCount;

    public RacingGame(String input, int gameCount) {
        this.cars = new Cars(input);
        this.gameCount = gameCount;
    }

    public Cars getCars() {
        return cars;
    }
}
