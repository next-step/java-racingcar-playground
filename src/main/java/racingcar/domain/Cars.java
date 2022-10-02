package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

import java.util.*;

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

    public Map<String, Integer> getRacingRecord() {
        Map<String, Integer> racingRecord = new LinkedHashMap<>();
        for(Car car : cars) {
            racingRecord.put(car.getCarName(), car.getCarPosition());
        }
        return racingRecord;
    }
}
