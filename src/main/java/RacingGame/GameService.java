package RacingGame;

public class GameService {

    public Cars joinCar (String [] splitedCarNames) {
        Cars cars = Cars.getInstance();
        for(int index=0; index<splitedCarNames.length; index++) {
            Car car = new Car(splitedCarNames[index], 0);
            cars.setJoinedCar(car);
        }
        return cars;
    }
}
