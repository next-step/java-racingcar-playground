package game.domain;

import game.utils.InputValid;
import game.views.InputView;
import game.views.OutputView;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Scanner;

public class CarRacingGame {
    private int repetition;
    public List<Car> carList;
    Scanner scanner = new Scanner(System.in);

    public void inputData() {
        OutputView.printInitCars();
        String carNames = scanner.nextLine();
        InputValid.isNullCarNames(carNames);
        this.carList = InputView.inputCars(carNames);
        OutputView.printInitRepete();
        this.repetition = InputView.inputRepetition();
    }

    public void gameResult() {
        OutputView.printBeforeGame();
        for (int i = 0; i < repetition; i++) {
            OutputView.printRacingCars(carList);
        }
    }

    public void findWinners() {
        List<Car> winners = Cars.findWinners();
        OutputView.printWinners(winners);
    }


}
