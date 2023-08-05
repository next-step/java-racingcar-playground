package RacingGame;

public class RacingGameApplication {
    public static void main(String args[]) {
        InputView input = new InputView();
        Parser parser = new Parser();
        GameService game = new GameService();

        String[] carNames = parser.splitInputNames(input.requestCarName());
        Cars joinedCars = game.joinCar(carNames);

        game.inputRounds();
        game.playRound(joinedCars);
    }
}
