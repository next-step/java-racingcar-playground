package racingcar.view;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class RacingViewTest {
	@Test
	void printRace() {
		Car ws = new Car("ws", 2);
		Car mh = new Car("mh");
		Car dh = new Car("dh", 1);
		Cars cars = new Cars(Arrays.asList(ws, mh, dh));

		RacingView racingView = new RacingView();

		assertThat(racingView.printRace(cars)).isEqualTo("ws : ---\nmh : -\ndh : --\n");
	}

	@Test
	void printWinners() {
		Car ws = new Car("ws", 2);
		Car mh = new Car("mh");
		Car dh = new Car("dh", 2);
		Cars cars = new Cars(Arrays.asList(ws, mh, dh));

		RacingView racingView = new RacingView();

		assertThat(racingView.printWinners(cars)).isEqualTo("ws, dh가 최종 우승했습니다.");
	}

	@Test
	void inputName() {
		String input = "ws,mh,dh";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner scanner = new Scanner(System.in);

		RacingView racingView = new RacingView();

		assertThat(racingView.inputNames(scanner)).containsExactly("ws", "mh", "dh");
	}

	@Test
	void inputTrialCount() {
		String input = "5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner scanner = new Scanner(System.in);

		RacingView racingView = new RacingView();

		assertThat(racingView.inputTrialCount(scanner)).isEqualTo(5);
	}
}
