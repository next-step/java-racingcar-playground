package game.domain;

public class DriveResult {
    private Name name;
    private Position position;

    public DriveResult(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name.toString(), position.toString());
    }
}
