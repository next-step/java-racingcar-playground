package game.domain;

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

    public int getDrives() {
        return drives;
    }

    public String getName() {
        return name;
    }
}
