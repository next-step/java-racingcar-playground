package second;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private final List<Car> cars;
    private int playCount;

    public Game() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void addCars(String input) {
        for(String name : input.split(",")) {
            this.cars.add(new Car(name.trim()));
        }
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void play() {
        for (int i = 0; i < this.playCount; i++) {
            carMove();
        }
    }

    private void carMove() {
        for (Car car : this.cars) {
            car.move();
            car.print();
        }
        System.out.println();
    }

    public List<Car> getWinners() {
        int maxPosition = getMaxPosition();
        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car);
            }
        }
        return winner;
    }

    public void printWinners(List<Car> winners) {
        System.out.printf("Winner is %s!", getFormattedNames(winners));
    }

    private String getFormattedNames(List<Car> winners) {
        return String.join(",", winners.stream().map(c -> c.getName()).collect(Collectors.toList()));
    }

    private int getMaxPosition() {
        int max = 0;
        for (Car car : cars) {
            if (car.getPosition()>max) {
                max = car.getPosition();
            }
        }
        return max;
    }
}
