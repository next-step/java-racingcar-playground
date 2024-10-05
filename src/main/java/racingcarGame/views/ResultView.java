package racingcarGame.views;

import racingcarGame.domain.Car;
import racingcarGame.domain.Cars;

import java.util.List;

public class ResultView {
    static String resultView = "실행결과";
    static String winningMention = "가 최종 우승했습니다.";

    public static void result() {
        System.out.println(resultView);
    }

    public static void racingResult(Cars cars){
        for (Car car : cars.getCars()) {
            System.out.print(car.getName()+" : ");
            locationResult(car);
            System.out.println();
        }
    }

    private static void locationResult(Car car) {
        int location = car.getLocation();
        for (int i = 0 ; i < location ; i++){
            System.out.print("-");
        }
    }

    public static void winner(Cars cars) {
        List<Car> carList = cars.getCars();
        System.out.print(carList.get(0).getName());
        int size = carList.size();
        for (int i = 1; i < size; i++){
            System.out.print(", "+carList.get(i).getName());
        }
        System.out.println(winningMention);
    }
}
