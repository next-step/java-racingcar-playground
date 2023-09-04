package domain;

import java.util.ArrayList;
import java.util.List;

public class GoalLine {

    public List<RacingCar> informWinner(List<RacingCar> racingCars) {
        Position maxPosition = new Position();
        for (RacingCar racingCar : racingCars) {
            maxPosition = racingCar.findBiggerPosition(maxPosition);
        }

        List<RacingCar> winners = new ArrayList<>();
        for (RacingCar racingCar : racingCars) {
            if (racingCar.isMaxPosition(maxPosition)) {
                winners.add(racingCar);
            }
        }

        return winners;
    }
}
