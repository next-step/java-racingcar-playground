package RacingGame.domain;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }
    public void setPosition(int position) {
        this.position=position;
    }

    public int getPosition() {
        return position;
    }

    public Position moveForward() {
        return new Position(this.position+1);
    }
}
