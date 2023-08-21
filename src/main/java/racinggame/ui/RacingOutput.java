package racinggame.ui;

import racinggame.domain.dto.GameResult;

public interface RacingOutput {
    void printRequestCarNames();
    void printRequestTotalRound();
    void printGameResult(GameResult gameResult);
}
