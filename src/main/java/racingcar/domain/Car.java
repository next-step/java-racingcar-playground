package racingcar.domain;

public class Car implements Comparable<Car>{
    private static final int MOVE_LIMIT =4;
    private static final int STARTING_POSITION = 0;

    private final String carName;
    private int position;

    public Car(String carName) throws RuntimeException{
        CarNameValidator.validateCarName(carName);
        this.carName = carName;
        this.position = STARTING_POSITION;
    }

    public void tryMoving(int randomNumber) {
        if(isMovable(randomNumber)){
            this.position++;
        }
    }

    private boolean isMovable(int randomNumber) {
        return randomNumber >= MOVE_LIMIT;
    }


    public String getCarName(){
        return this.carName;
    }

    public int getCarPosition() {
        return this.position;
    }

    @Override
    public int compareTo(Car otherCar) {
        return otherCar.position - this.position;
    }
}
