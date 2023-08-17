package game.ui;

import game.domain.GameResult;

public interface RacingOutput {
    void printRequestCarNames();
    void printRequestTotalRound();
    void printGameResult(GameResult gameResult);
}
