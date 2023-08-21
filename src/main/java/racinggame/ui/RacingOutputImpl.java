package racinggame.ui;

import racinggame.domain.dto.GameResult;

public class RacingOutputImpl implements RacingOutput {
    @Override
    public void printRequestCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(일므은 쉼표(,)를 기준으로 구분).");
    }

    @Override
    public void printRequestTotalRound() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    @Override
    public void printGameResult(GameResult gameResult) {
        System.out.println(gameResult.toString());
    }
}
