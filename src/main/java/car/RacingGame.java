package car;

import view.InputView;
import view.OutputView;

import java.io.IOException;

public class RacingGame {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingGame(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void game() throws IOException {
        outputView.inputName();
        String names = inputView.getInput();
        Cars cars = new Cars(names);
        outputView.getTrial();
        int trial = inputView.getNumericInput();
        for (int integer = 0; integer < trial; integer++) {
            cars.move();
            outputView.printLocations(cars);
        }
        outputView.printWinners(cars);
    }
}
