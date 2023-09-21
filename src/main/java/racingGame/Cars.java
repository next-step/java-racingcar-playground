package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

//    public String lineCheck(List<Integer> list) {
//
//        List<Integer> carsLine = getCarsLine(list);
//
//        int topNum = 0;
//        StringBuilder carsListNm = new StringBuilder();
//
//        for(int i = 0; i < carsLine.size(); i++) {
//            if (topNum < carsLine.get(i)) {
//                topNum = carsLine.get(i);
//                carsListNm = new StringBuilder(cars.get(i).carName);
//            } else if (topNum == carsLine.get(i)) {
//                carsListNm.append(",").append(cars.get(i).carName);
//            }
//
//        }
//
//        return carsListNm.toString();
//    }

    public String play(int repeatNum) {

        List<Integer> randomNumList = randomNumList();

        IntStream.range(0, repeatNum)
                .forEach(i -> {
                    setCarsLine(randomNumList);
                    printPlay();
                });

        int topNum = 0;


//        this.cars.stream()
//                .map(car -> {
//                    car.line
//                })
//                .reduce(0, (a, b) -> b);

        StringBuilder carsListNm = new StringBuilder();

        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).equals(topNum);

            if (topNum < this.cars.get(i).line) {
                topNum = this.cars.get(i).line;
                carsListNm = new StringBuilder(cars.get(i).carName);
            } else if (topNum == this.cars.get(i).line) {
                carsListNm.append(",").append(cars.get(i).carName);
            }

        }
//        this.cars.stream()
//                .filter(car -> car.line > )

//        return getListLastData(carNameList);
        return "";
    }

    public <T> T getListLastData(List<T> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    private void setCarsLine(List<Integer> list) {
        IntStream.range(0, this.cars.size())
                .forEach(i -> this.cars
                        .get(i)
                        .play(list.get(i))
                );
    }

    private void printPlay() {
        this.cars
                .forEach(carData -> System.out.println(carData.carName + " : " + carData.line));
    }

    private List<Integer> randomNumList() {
        int min = 0;
        int max = 9;
        return IntStream.range(0, this.cars.size())
                .mapToObj(i -> random.nextInt(max - min + 1) + min)
                .collect(Collectors.toList());
    }
}
