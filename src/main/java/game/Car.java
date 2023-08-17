package game;

import game.util.RandomBooleanGenerator;

public class Car {
    private String name;
    private int drives;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.length() == 0 || name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }

    public DriveResult driveOrNot() {
        if (canDrive()) {
            this.drives++;
        }
        return new DriveResult(name, drives);
    }

    private boolean canDrive() {
        return RandomBooleanGenerator.generate(60);
    }
}
