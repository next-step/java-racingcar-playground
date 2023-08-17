package game.domain;

import game.domain.Cars;
import game.domain.GameResult;
import game.domain.RoundResult;

public class RacingGame {
    private Cars cars;
    private int totalRound;

    public RacingGame(String carNames, int totalRound) {
        String[] carNamesArr = carNames.split(",");
        this.cars = new Cars(carNamesArr);
        this.totalRound = totalRound;
    }

    public GameResult playGame() {
        GameResult gameResult = new GameResult();

        for (int i = 0; i < totalRound; i++) {
            RoundResult roundResult = cars.playRound();
            gameResult.report(roundResult);
        }

        return gameResult;
    }
}

