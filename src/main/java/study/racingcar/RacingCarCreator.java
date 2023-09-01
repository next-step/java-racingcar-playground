package study.racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCarCreator {

    public List<RacingCar> createRacingCars(List<String> racingCarNameList) {
        List<RacingCar> racingCarList = new ArrayList<>();
        for (String racingCarName : racingCarNameList) {
            racingCarList.add(RacingCar.create(racingCarName));
        }
        return racingCarList;
    }
}
