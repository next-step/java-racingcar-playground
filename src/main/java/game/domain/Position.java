package game.domain;

public class Position {
    private static final String POSITION_SYMBOL = "-";

    private int position = 0;

    public void goForward() {
        position++;
    }

    @Override
    public String toString() {
        return POSITION_SYMBOL.repeat(position);
    }
}
