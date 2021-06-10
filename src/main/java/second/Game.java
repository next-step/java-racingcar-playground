package second;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Car> cars;

    public Game() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void addCars(String input) {
        for(String name : input.split(",")) {
            this.cars.add(new Car(name));
        }
    }
}
