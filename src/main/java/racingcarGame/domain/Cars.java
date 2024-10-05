package racingcarGame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }
    public Cars(List<Car> carList) {
        this.cars = carList;
    }
    public List<Integer> getLocations() {
        List<Car> carList = getCars();
        List<Integer> locations = new ArrayList<>();
        for (Car car : carList) {
            locations.add(car.getLocation());
        }
        return locations;
    }
}
