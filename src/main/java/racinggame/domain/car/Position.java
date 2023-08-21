package racinggame.domain.car;

public class Position {
    private static final String POSITION_SYMBOL = "-";

    private int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public void goForward() {
        position++;
    }

    public boolean matches(int position) {
        return this.position == position;
    }

    public int get() {
        return position;
    }

    protected Position clone() {
        return new Position(this.position);
    }

    @Override
    public String toString() {
        return POSITION_SYMBOL.repeat(position);
    }
}
