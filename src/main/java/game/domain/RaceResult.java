package game.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RaceResult {
    List<DriveResult> driveResults;

    public RaceResult(List<DriveResult> driveResults) {
        this.driveResults = driveResults;
    }

    @Override
    public String toString() {
        return driveResults.stream().map(DriveResult::toString).collect(Collectors.joining("\n"));
    }
}
