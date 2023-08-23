package racingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    private final int GO_NUM = 4;

    private List<Car> cars;

    public Cars(String carList) {
        this.cars = makeCar(carList);
    }

    private List<Car> makeCar(String carList) {

        List<Car> carsList = new ArrayList<>();

        String[] strCars = carList.split(",");

        for (int i = 0; i < strCars.length; i++) {
            String car = strCars[i]; // 각 요소에 접근
            carsList.add(new Car(car));
        }

        return carsList;
    }

    public CarStatus stopPlayCheck(int i) {

        if (i < GO_NUM) {
            return CarStatus.STOP;
        }

        return CarStatus.PLAY;
    }
}
