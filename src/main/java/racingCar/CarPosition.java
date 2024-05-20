package racingCar;

public class CarPosition {

    private int position;

    public CarPosition(){
        position = 1;
    }

    public int getPosition() {
        return position;
    }

    public int process(){
        return ++position;
    }
}
