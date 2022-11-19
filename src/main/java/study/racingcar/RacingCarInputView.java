package study.racingcar;

import java.util.List;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/19
 */
public interface RacingCarInputView {

    List<Car> inputCars();

    int inputNumberOfAttempt();

    void print(List<Car> cars);

    void printResultLabel();

    void printWinners(List<Car> cars);
}
