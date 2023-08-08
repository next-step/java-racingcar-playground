package RacingGame;

import RacingGame.Controller.GameService;
import RacingGame.DTO.Cars;
import RacingGame.util.Parser;
import RacingGame.view.InputView;

public class RacingGameApplication {
    public static void main(String args[]) {
        GameService game = new GameService();

        Cars joinedCars = game.joinCar(game.splitInputString());
        game.inputRounds();
        game.playRound(joinedCars);
    }
}
