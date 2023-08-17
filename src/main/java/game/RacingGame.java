package game;

public class RacingGame {
    private Cars cars;
    private int totalRound;

    public RacingGame(String[] carNames, int totalRound) {
        this.cars = new Cars(carNames);
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

class Main {

}
