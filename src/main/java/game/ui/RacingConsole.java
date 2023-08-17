package game.ui;

import game.domain.GameResult;
import game.domain.RacingGame;

public class RacingConsole {
    private RacingInput racingInput;
    private RacingOutput racingOutput;

    public RacingConsole(RacingInput racingInput, RacingOutput racingOutput) {
        this.racingInput = racingInput;
        this.racingOutput = racingOutput;
    }

    public void start() {
        racingOutput.printRequestCarNames();
        String strCarNames = racingInput.receiveCarNames();

        racingOutput.printRequestTotalRound();
        int totalRound = racingInput.receiveTotalRound();

        RacingGame racingGame = new RacingGame(strCarNames, totalRound);
        GameResult gameResult = racingGame.playGame();

        racingOutput.printGameResult(gameResult);
    }
}
