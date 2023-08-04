package RacingGame;

import java.util.ArrayList;

public class Cars {
    private static Cars instance = new Cars();
    private ArrayList<Car> joinedCar = new ArrayList<>();

    private Cars() {}

    public static Cars getInstance() {
        return instance;
    }

    public ArrayList<Car> getJoinedCar() {
        return joinedCar;
    }

    public void setJoinedCar(Car car) {
        joinedCar.add(car);
    }
}
