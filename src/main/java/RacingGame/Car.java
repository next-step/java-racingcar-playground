package RacingGame;

public class Car {
    private Name carName;
    private Position carPosition;

    public Car (String splitedName , int position) {
        carName = new Name(splitedName);
        carPosition = new Position(0);
    }
    public Name getCarName() {return carName;}
    public Position getCarPosition() {return carPosition;}
}
