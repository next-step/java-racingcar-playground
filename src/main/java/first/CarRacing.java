package first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {

    private final List<Car> cars;

    public CarRacing() {
        this.cars = new ArrayList<>();
    }

    public CarRacing(String input) {
        this();
        this.addCars(input);
    }

    public boolean isNotFinish() {
        for (Car car : this.cars) {
            if (car.getPosition() >= 5) {
                return false;
            }
        }
        return true;
    }

    public void play() {
        while (this.isNotFinish()) {
            this.run();
        }
        this.printWinner();
    }

    private void run() {
        for (Car car : this.cars) {
            car.play();
        }
        System.out.println();
    }

    private void printWinner() {
        List<Car> collect = this.cars.stream().filter(c -> c.getPosition() >= 5).collect(Collectors.toList());
        for (Car car : collect) {
            System.out.print(car.getName());
        }
        System.out.println("가 최종 우승했습니다");
    }

    private void addCars(String input) {
        for (String name : input.split(",")) {
            this.cars.add(new Car(name));
        }
    }
}
