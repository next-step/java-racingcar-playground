package racingcar;

public class Game {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String carNames = inputView.inputCarNames();
        int count = inputView.inputCount();
        RacingGame racingGame = new RacingGame(carNames, count);

        racingGame.start(resultView);
    }
}
