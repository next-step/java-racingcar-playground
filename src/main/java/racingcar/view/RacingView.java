package racingcar.view;

import java.util.Scanner;
import java.util.stream.Collectors;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class RacingView {

	public String printRace(Cars cars) {

		return 	cars.getCars()
			.stream()
			.map(RacingView::renderCarPosition)
			.collect(Collectors.joining("\n"))
			+ "\n";
	}

	private static String renderCarPosition(Car car) {
		return car.getName() + " : " + "-".repeat(car.getDistance() + 1);
	}

	public String[] inputNames(Scanner scanner) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

		return scanner.nextLine().trim().split(",");
	}

	public int inputTrialCount(Scanner scanner) {
		System.out.println("시도할 회수는 몇회인가요?");

		return Integer.parseInt(scanner.nextLine());
	}

	public String printWinners(Cars cars) {
		Cars winners = cars.findWinners();
		String winnerNames = winners.getCars().stream().map(Car::getName).collect(Collectors.joining(", "));

		return winnerNames + "가 최종 우승했습니다.";
	}


}
