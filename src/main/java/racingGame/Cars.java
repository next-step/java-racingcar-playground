package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private List<Car> cars;

    private Random random = new Random();

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


    public String play(int repeatNum) {

        List<Integer> randomNumList = randomNumList();
        String lastWinner = "";
        for (int i = 0; i < repeatNum; i++) {
            lastWinner = lineCheck(randomNumList);
            printPlay();
        }

        return lastWinner;
    }

    private void printPlay() {
        for(int i = 0; i < this.cars.size(); i++) {
            System.out.println(this.cars.get(i).carName + " : " + this.cars.get(i).line);
        }
    }

    private List<Integer> randomNumList() {
        List<Integer> randomNumList = new ArrayList<>();

        int min = 0;
        int max = 9;
        for(int i = 0; i < this.cars.size(); i++) {
            int carRandomNum = random.nextInt(max - min + 1) + min;
            randomNumList.add(carRandomNum);
        }
        return randomNumList;
    }
}
