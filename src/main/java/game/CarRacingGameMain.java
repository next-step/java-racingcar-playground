package game;

import game.domain.Car;
import game.domain.CarRacingGame;
import game.views.InputView;
import game.views.OutputView;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

        OutputView.printInitCars();
        String carNames = scanner.nextLine();
        if (StringUtils.isBlank(carNames)) { //TODO valid로 넣기
            throw new IllegalArgumentException("자동차 이름을 입력해 주세요.");
        }
        List<Car> carList = InputView.inputCars(carNames);
        OutputView.printInitRepete();
        InputView.inputRepete();


        OutputView.printRacingCars(carList);

    }
}