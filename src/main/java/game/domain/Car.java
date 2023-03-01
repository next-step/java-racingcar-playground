package game.domain;


import game.utils.CarName;
import game.utils.InputValid;
import game.utils.RandomNum;

public class Car {

    private CarName carName;
    private int position;


    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public Car(int position) {
        this.position = position;
    }

    public int move(int distance) {
        if (InputValid.validMove(distance)) {
            return plusCarDistance();
        }
        return getCarPosition();
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getCarPosition() {
        return this.position;
    }

    private int plusCarDistance() {
        return this.position += 1;
    }

}
