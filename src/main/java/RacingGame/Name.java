package RacingGame;

public class Name {
    private String carName;
    public Name(String carName) {
        this.carName = carName;
    }

    public boolean isCarNameLengthOverFive(String inputCarName) {
        if (carName.length() > 5) {
            return true;
        }
        return false;
    }
}
