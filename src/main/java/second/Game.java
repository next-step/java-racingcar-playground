package second;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Car> cars;
    private int playCount;

    public Game() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void addCars(String input) {
        for(String name : input.split(",")) {
            this.cars.add(new Car(name));
        }
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public void play() {
        for (int i = 0; i < this.playCount; i++) {
            playGames();
        }
    }

    private void playGames() {
        for (Car car : this.cars) {
            car.play();
            car.print();
        }
        System.out.println();
    }
}
