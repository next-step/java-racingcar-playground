package racingCar.domain;

import java.util.Objects;

public class Position {
    private int position;
    public Position(){
        position = 1;
    }

    public Position(int position) {
        this.position = position;
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

    public Position move() {
        position += 1;
        return this;
    }

    public Position stop(){
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<position; i++){
            builder.append("-");
        }
        return builder.toString();
    }
}
