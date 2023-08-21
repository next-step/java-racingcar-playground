package racinggame.domain.dto;

import racinggame.domain.car.Name;
import racinggame.domain.car.Position;

public class DriveResult {
    private Name name;
    private Position position;

    public DriveResult(Name name, Position position) {
        this.name = name;
        this.position = position.clone();
    }

    public String getName() {
        return name.toString();
    }

    public int getPosition() {
        return position.get();
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name.toString(), position.toString());
    }

    public boolean isHighestPosition(int highestPosition) {
        return this.position.matches(highestPosition);
    }
}
