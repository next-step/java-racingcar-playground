package car;

import view.InputView;
import view.OutputView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RacingGame racingGame = new RacingGame(inputView, outputView);
        racingGame.game();
    }
}
