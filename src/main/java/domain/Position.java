package domain;

import java.util.Objects;

public class Position {

    private final int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position can't less than zero");
        }
        this.position = position;
    }

    public Position move() {
        return new Position(position + 1);
    }

    public Position compare(Position maxPosition) {
        return position >= maxPosition.position ? this : maxPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
