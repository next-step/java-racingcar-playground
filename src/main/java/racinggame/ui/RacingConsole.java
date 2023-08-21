package racinggame.ui;

import racinggame.domain.dto.GameResult;
import racinggame.domain.RacingGame;
import racinggame.domain.car.strategy.SixtyPercentChanceDrivableStrategy;

public class RacingConsole {
    private RacingInput racingInput;
    private RacingOutput racingOutput;

    public RacingConsole(RacingInput racingInput, RacingOutput racingOutput) {
        this.racingInput = racingInput;
        this.racingOutput = racingOutput;
    }

    public void start() {
        racingOutput.printRequestCarNames();
        String carNames = racingInput.receiveCarNames();

        racingOutput.printRequestTotalRound();
        int totalRound = racingInput.receiveTotalRound();

        RacingGame racingGame = new RacingGame(carNames.split(","));
        GameResult gameResult = racingGame.race(totalRound, new SixtyPercentChanceDrivableStrategy());

        racingOutput.printGameResult(gameResult);
    }
}
