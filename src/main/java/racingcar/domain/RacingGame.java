package racingcar.domain;

import racingcar.domain.Cars;
import racingcar.domain.MoveStrategy;

public class RacingGame {
	private final Cars cars;
	private final MoveStrategy moveStrategy;
	private int trialCount;

	public RacingGame(Cars cars, int trialCount, MoveStrategy moveStrategy) {
		if(trialCount < 1) {
			throw new IllegalArgumentException("시도할 횟수는 1이상이어야 합니다.");
		}

		this.cars = cars;
		this.trialCount = trialCount;
		this.moveStrategy = moveStrategy;
	}

	public boolean isEnd() {
		return trialCount == 0;
	}

	public Cars race() {
		if(trialCount == 0) {
			return cars;
		}

		trialCount--;
		cars.moveAll(moveStrategy);
		return cars;
	}

	public Cars getWinners() {
		return cars.findWinners();
	}

}
