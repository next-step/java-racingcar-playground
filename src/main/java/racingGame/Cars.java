package racingGame;

import java.util.ArrayList;
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
            String car = strCars[i];
            carsList.add(new Car(car));
        }

        return carsList;
    }

    public List<Car> play(List<Integer> list) {
        List<Car> carList = new ArrayList<>();
        String commaCar = lineCheck(list);
        for (String s : commaCar.split(",")) {
            carList.add(new Car(s));
        }

        return carList;
    }

    public String lineCheck(List<Integer> list) {

        List<Integer> fastCarList = new ArrayList<>();

        for(int i = 0; i < cars.size(); i++) {
            fastCarList.add(cars.get(i).play(list.get(i)));
        }

        int topNum = 0;
        StringBuilder carsListNm = new StringBuilder();

        for(int i = 0; i < fastCarList.size(); i++) {
            if (topNum < fastCarList.get(i)) {
                topNum = fastCarList.get(i);
                carsListNm = new StringBuilder(cars.get(i).carName);
            } else if (topNum == fastCarList.get(i)) {
                carsListNm.append(",").append(cars.get(i).carName);
            }

        }

        return carsListNm.toString();
    }


}
