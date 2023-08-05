package RacingGame;

public class Name {
    private String name;
    public Name(String carName) {
        if(isCarNameLengthOverFive(carName)) {
            throw new IllegalArgumentException("차량이름은 5글자를 초과할 수 없습니다");
        }
        this.name = carName;
    }

    public boolean isCarNameLengthOverFive(String inputCarName) {
        if (inputCarName.length() > 5) {
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
