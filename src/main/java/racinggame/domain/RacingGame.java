package racinggame.domain;

import racinggame.domain.car.Cars;
import racinggame.domain.car.strategy.DrivableStrategy;
import racinggame.domain.dto.GameResult;
import racinggame.domain.dto.RaceResult;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;

    public RacingGame(String[] carNames) {
        this.cars = new Cars(carNames);
    }

    public GameResult race(int round, DrivableStrategy drivableStrategy) {
        List<RaceResult> raceResults = new ArrayList<>();
        for (int i = 0; i < round; i++) {
            RaceResult raceResult = cars.race(drivableStrategy);
            raceResults.add(raceResult);
        }
        return new GameResult(raceResults);
    }
}
