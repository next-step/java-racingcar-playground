package study.racingcar;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class RacingCarReferee {

    private static final int FORWARD_MINIMUM_RULE_LIMIT = 4;

    private static final int FORWARD_MAXIMUM_RULE_LIMIT = 10;

    private final List<Car> cars;

    public RacingCarReferee(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> judge() {
        cars.stream()
                .filter(car -> isForward())
                .forEach(Car::forward);
        return cars;
    }

    public List<Car> getWinners() {

        int maxDistance = cars.stream()
                .mapToInt(Car::getDistance)
                .max()
                .orElse(-1);

        return cars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .collect(toList());
    }

    private boolean isForward() {
        return FORWARD_MINIMUM_RULE_LIMIT < RandomUtils.getInt(FORWARD_MAXIMUM_RULE_LIMIT);
    }
}
