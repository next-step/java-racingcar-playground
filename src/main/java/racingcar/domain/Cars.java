package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> carNames) throws RuntimeException {
        cars = new ArrayList<>();
        for (String carName : carNames){
            cars.add(new Car(carName));
        }
        CarNameValidator.checkDuplication(carNames);
    }

    public List<Car> getCars(){
        return Collections.unmodifiableList(cars);
    }

    public void executeCarRacing(RandomNumberGenerator randomNumberGenerator) {
        for(Car car : cars){
            car.tryMoving(randomNumberGenerator.generate());
        }
    }
}
