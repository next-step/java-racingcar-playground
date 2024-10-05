package racingcarGame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static racingcarGame.utils.GenerateNumber.generateNumber;

public class Race {

    private final Cars cars;

    public Race(Cars car) {
        this.cars = car;
    }
    public void race() {
        Cars cars = getCars();
        for(Car car: cars.getCars()){
            int rand = generateNumber();
            car.move(rand);
        }
    }
    public Cars winner(int farLocation) {
        Cars cars = getCars();
        List<Car> carsList = new ArrayList<>();
        for(Car car: cars.getCars()){
            Optional<Car> result = Optional.ofNullable(compareFarLocation(farLocation, car));
            result.ifPresent(carsList::add);
        }
        return new Cars(carsList);
    }
    public int farLocation() {
        int far = 0;
        for(Car car: cars.getCars()){
            far = compareLocation(far, car);
        }
        return far;
    }
    private static int compareLocation(int location,Car car){
        return Math.max(car.getLocation(), location);
    }
    private static Car compareFarLocation(int farLocation,Car car){
        if(car.getLocation() == farLocation){
            return car;
        }
        return null;
    }
    public Cars getCars() {
        return cars;
    }
}

