package racingcarGame.domain;

public class Position {
    private int position;
    public Position(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position cannot be less than 0");
        }
        this.position = i;
    }

    public Position() {
        this.position = 0;
    }
    public int getPosition() {
        return this.position;
    }

    public void move() {
        this.position += 1;
    }
}
