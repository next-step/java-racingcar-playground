package game;

public class DriveResult {
    private String name;
    private int drives;

    public DriveResult(String name, int drives) {
        this.name = name;
        this.drives = drives;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name, "-".repeat(drives));
    }
}
