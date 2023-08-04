package RacingGame;

public class Name {
    private String name;
    public Name(String carName) {
        this.name = carName;
    }

    public boolean isCarNameLengthOverFive(String inputCarName) {
        if (name.length() > 5) {
            return true;
        }
        return false;
    }

    public void setName (String splitedCarName) {
        name = splitedCarName;
    }

    public String getName() {
        return name;
    }
}
