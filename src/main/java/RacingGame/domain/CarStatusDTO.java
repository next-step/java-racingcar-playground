package RacingGame.domain;

public class CarStatusDTO {
    private final String carName;
    private final int position;

    public CarStatusDTO(String carName,int position) {
        this.carName = carName;
        this.position = position;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
