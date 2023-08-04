package RacingGame;

public class Car {
    private Name carName;
    private Position carPosition;

    public Car (String splitedName , int position) {
        carName = new Name(splitedName);
        carPosition = new Position(0);
    }
    public String getCarName() {return carName.getName();}
    public int getCarPosition() {return carPosition.getPosition();}
}
