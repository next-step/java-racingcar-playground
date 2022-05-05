package racingcar;

import java.util.Objects;

public class Position {
    private int position;

    public Position() {

    }

    public Position(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        String result = "-";
        for (int i = 0; i < position; i++) {
            result += "-";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public void move() {
        this.position++;
    }

    public boolean lessThan(Position maxPosition) {
        return position < maxPosition.position;
    }
}
