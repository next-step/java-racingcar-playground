package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.domain.RacingRecordDTO;

public class Application {
    public static void main(String[] args){
        RacingCarController racingCarController = new RacingCarController();
        racingCarController.playGame();
    }
}
