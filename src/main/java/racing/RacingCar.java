package racing;

public class RacingCar {

    public static final int STANDARD_MOVE_NUMBER = 4;
    private final String name;
    private int position;

    public RacingCar(String carName) {
        validRacingCarNameLength(carName);
        this.name = carName;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }


    private void validRacingCarNameLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public void play(int gameNumber) {
        if (gameNumber < STANDARD_MOVE_NUMBER) return;

        position++;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < position; i++) {
            buffer.append("-");
        }
        return String.format("%s : %s", name, buffer.toString());
    }
}
