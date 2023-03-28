package model;

public class RacingCar {
    private final String carName;
    private int numOfMove;

    public RacingCar(String carName) {
        this.carName = carName;
        this.numOfMove = 0;
    }

    public void moveRacingCar(int inputNumber) {
        if(4 < inputNumber) numOfMove++;
    }

    public int getNumOfMove() {
        return numOfMove;
    }
}
