package racing;

import java.util.Collection;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCar() {
        return carList;
    }

    public void move(List<Car> carList) {
        carList.stream().forEach(car -> car.move((int) Math.round(Math.random())));
    }
}
