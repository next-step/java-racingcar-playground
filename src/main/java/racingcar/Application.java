package racingcar;

import java.util.Scanner;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.domain.RandomMoveStrategy;
import racingcar.view.RacingView;

public class Application {
	public static void main(String[] args) {
		RacingView racingView = new RacingView();

		Scanner scanner = new Scanner(System.in);

		try {
			String[] names = racingView.inputNames(scanner);
			Cars cars = new Cars(names);
			int trialCount = racingView.inputTrialCount(scanner);

			RacingGame racingGame = new RacingGame(cars, trialCount, new RandomMoveStrategy());

			while(!racingGame.isEnd()) {
				System.out.println(racingView.printRace(racingGame.race()));
			}

			System.out.println(racingView.printWinners(racingGame.getWinners()));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
