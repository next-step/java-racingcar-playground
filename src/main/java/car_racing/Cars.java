package car_racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carsName) {
        this.cars = getCars(carsName);
    }

    private List<Car> getCars(String[] carsName) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carsName[i]));
        }
        return cars;
    }
    public List<Car> play() {
        for (Car c:
             cars) {
            c.addScore(c.makeRandomNum(), c.getRaceScore());
        }
        return cars;
    }
    // 매 회차마다 문자열 출력
    public PrintResult printCurrent(List<Car> cars) {
        PrintResult result = new PrintResult(cars);
        for (Car c: cars) {
            result.writeCurrentResult(c);
        }System.out.println();
        return result;
    }
    // 최대값 찾기
    public List<Car> findHighestScore() {
        OptionalInt maxScore = cars.stream()
                .mapToInt(Car::getRaceScore)
                .max();

        return maxScore.isPresent() ?
                cars.stream()
                        .filter(car -> car.getRaceScore() == maxScore.getAsInt())
                        .collect(Collectors.toList())
                : Collections.emptyList(); // 최대값이 없으면 빈 리스트 반환
    }

}
