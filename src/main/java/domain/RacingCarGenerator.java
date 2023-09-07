package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGenerator {

    public List<RacingCar> create(String racingCarNames) {

        String[] racingCarNameArray = racingCarNames.split(",");

        List<RacingCar> racingCarList = new ArrayList<>();

        for (String carName : racingCarNameArray) {
            racingCarList.add(new RacingCar(carName));
        }

        return racingCarList;
    }
}
