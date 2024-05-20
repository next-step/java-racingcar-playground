package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarList {

    public static final int BOUND = 9;
    public static final int VICTORY_NO = 5;
    private List<Car> cars;
    private Random random;

    public CarList(String names) {
        cars = Arrays.stream(names.split(","))
                .map(this::newInstance)
                .collect(Collectors.toList());

        random = new Random();
    }


    public void play(){
        cars.stream()
            .forEach(this::playProcess);
    }

    private void playProcess(Car car) {
        int randNumber = random.nextInt(BOUND) + 1;
        car.process(randNumber);
    }


    private Car newInstance(String name) {
        return new Car(name);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void whoIsVictory() {
        cars.stream()
                .forEach(this::isVictory);
    }

    private void isVictory(Car car){
        if (car.getCarPosition().getPosition() >= VICTORY_NO){
            System.out.println(car.getCarName().getName() + " Victory");
        }
    }
}
