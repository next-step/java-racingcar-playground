package game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoundResult {
    private List<DriveResult> driveResults = new ArrayList<>();

    public void report(DriveResult driveResult) {
        driveResults.add(driveResult);
    }

    @Override
    public String toString() {
        return driveResults.stream()
                .map(DriveResult::toString)
                .collect(Collectors.joining("\n"));
    }
}
