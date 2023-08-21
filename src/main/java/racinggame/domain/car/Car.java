package racinggame.domain.car;

import racinggame.domain.car.strategy.DrivableStrategy;
import racinggame.domain.dto.DriveResult;

public class Car {
    Name name;
    Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public DriveResult drive(DrivableStrategy drivableStrategy) {
        if (drivableStrategy.canMove()) {
            position.goForward();
        }

        return new DriveResult(this.name, this.position);
    }
}
