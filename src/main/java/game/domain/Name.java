package game.domain;

public class Name {
    private static final int MAXIMUM_LENGTH = 5;

    private final String name;

    public Name(String name) {
        if (name.isEmpty() || name.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
