package game.utils;

public class CarName {

    private final int MAX_LEN = 5;
    private String carName;


    public CarName(String carName) {
        if (carName.length() > MAX_LEN) {
            throw new IllegalArgumentException("자동차 이름의 길이는 5보다 작아야 합니다.");
        }
        this.carName = carName;
    }
    public String getCarName() {
        return carName;
    }
}
