package study;

import study.racingcar.RacingCarConsoleView;
import study.racingcar.RacingCarInputView;
import study.racingcar.RacingGame;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/16
 */
public class RacingcarApplication {

    public static void main(String[] args) {
        RacingCarInputView racingCarInputView = new RacingCarConsoleView();
        RacingGame racingGame = new RacingGame(racingCarInputView);
        racingGame.start();
    }
}
