package RacingGame;

public class Car {
    private Name carName;
    private Position carPosition;

    public void setCarName(String splitedName) {
        carName.setName(splitedName);
    }

    public  void SetCarPosition(int position) {
        carPosition.setPosition(position);
    }
}
