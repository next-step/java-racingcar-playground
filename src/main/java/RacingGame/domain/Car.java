package RacingGame.domain;

public class Car {
    private Name carName;
    private Position carPosition;

    public Car (String splitedName)  {
        carName = new Name(splitedName);
        carPosition = new Position(0);
    }
    public String getCarName() {return carName.getName();}
    public int getCarPosition() {return carPosition.getPosition();}

    public void go(int randomNumber) {
        if(randomNumber < 4) {
            return;
        }
        carPosition.setPosition(carPosition.getPosition()+1);
    }

}
