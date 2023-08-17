package game.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    List<RoundResult> roundResults = new ArrayList<>();

    public void report(RoundResult roundResult) {
        roundResults.add(roundResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        roundResults.stream()
                .forEach(roundResult
                        -> sb.append(roundResult.toString()).append("\n\n"));

        RoundResult finalRoundResult = roundResults.get(roundResults.size() - 1);
        String winners = finalRoundResult.getWinners();

        sb.append(winners);
        sb.append("가 최종 우승헀습니다.");

        return sb.toString();
    }
}
