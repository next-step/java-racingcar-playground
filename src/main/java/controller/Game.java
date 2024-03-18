package controller;

import model.Car;
import util.MoveConditionGenerator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game {
    private InputView inputView = InputView.getInstance();
    private OutputView outputView = OutputView.getInstance();
    private List<Car> cars;
    private int cnt;

    public void init() {
        cars = createCars(inputView.readCarNames());
        cnt = inputView.readRoundCount();
    }

    public void run(){
        outputView.printResultMessage();
        while (cnt-- > 0) {
            round();
        }
        outputView.printGameResult(judge());
    }

    private void round(){
        for (Car car : cars) {
            play(car);
        }
        outputView.printRoundResult(cars);
    }

    private void play(Car car) {
        car.play(MoveConditionGenerator.generate());
    }

    private List<Car> judge() {
        List<Car> winners = new ArrayList<>();
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getLocation() - o1.getLocation();
            }
        });

        winners.add(cars.remove(0));
        while (!cars.isEmpty() && cars.get(0).getLocation() == winners.get(0).getLocation()) {
            winners.add(cars.remove(0));
        }
        return winners;
    }

    private static Car createCar(String name) {  // 복잡할 경우 Factory 패턴 사용
        return new Car(name);
    }

    private List<Car> createCars(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(createCar(name));
        }
        return cars;
    }
}
