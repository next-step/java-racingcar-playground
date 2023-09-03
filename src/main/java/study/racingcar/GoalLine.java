package study.racingcar;

import java.util.ArrayList;
import java.util.List;

public class GoalLine {

    public List<String> informWonRacingCars(List<RacingCar> racingCars) {
        List<String> wonRacingCarNames = new ArrayList<>();

        int maxMove = 0;
        for (RacingCar racingCar : racingCars) {
            maxMove = Math.max(racingCar.getMoveCnt(), maxMove);
        }

        for (RacingCar racingCar : racingCars) {
            if (racingCar.getMoveCnt() == maxMove) {
                wonRacingCarNames.add(racingCar.getName());
            }
        }

        return wonRacingCarNames;
    }
}
