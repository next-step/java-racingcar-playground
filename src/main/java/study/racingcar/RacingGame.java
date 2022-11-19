package study.racingcar;

import java.util.List;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class RacingGame {

    private final RacingCarInputView racingCarInputView;

    public RacingGame(RacingCarInputView racingCarInputView) {
        this.racingCarInputView = racingCarInputView;
    }

    public void start() {
        List<Car> cars = racingCarInputView.inputCars();
        int numberOfAttempt = racingCarInputView.inputNumberOfAttempt();
        RacingCarReferee referee = new RacingCarReferee(cars);

        racingCarInputView.printResultLabel();
        for (int i = 0; i < numberOfAttempt; i++) {
            racingCarInputView.print(referee.judge());
        }

        racingCarInputView.printWinners(referee.getWinners());
    }
}
