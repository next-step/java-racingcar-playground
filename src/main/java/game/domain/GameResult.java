package game.domain;

import java.util.List;
import java.util.stream.Collectors;

public class GameResult {
    private final List<RaceResult> raceResults;

    public GameResult(List<RaceResult> raceResults) {
        this.raceResults = raceResults;
    }

    private String getWinners() {
        RaceResult finalRaceResult = raceResults.get(raceResults.size() - 1);
        return finalRaceResult.getWinners();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(raceResults.stream().map(RaceResult::toString).collect(Collectors.joining("\n\n")))
            .append('\n')
            .append(getWinners())
            .append("가 최종 우승했습니다");

        return sb.toString();
    }
}
