package racingCar;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getCarName() + " : " + car.getPositionVisual());
        }
        System.out.println();
    }

    public static void printWinner(List<Car> winners) {
        String winner = winners.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));

        System.out.println(winner + "가 최종 우승했습니다.");
    }
}
