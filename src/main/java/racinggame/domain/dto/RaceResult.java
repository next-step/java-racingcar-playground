package racinggame.domain.dto;

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

    public String getWinners() {
        int highestPosition = getHighestPosition();

        return driveResults.stream()
                .filter(driveResult -> driveResult.isHighestPosition(highestPosition))
                .map(DriveResult::getName)
                .collect(Collectors.joining(", "));
    }

    private int getHighestPosition() {
        return driveResults.stream()
                .mapToInt(DriveResult::getPosition)
                .max()
                .getAsInt();
    }
}
