package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	void create() {
		assertThatThrownBy(() -> {
			new Car("abcdef");
		}).isInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> {
			new Car("");
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void move() {
		Car car = new Car("ws");
		car.move(() -> true);

		assertThat(car.getPosition()).isEqualTo(new Position(1));
	}

	@Test
	void notMove() {
		Car car = new Car("ws");
		car.move(() -> false);

		assertThat(car.getPosition()).isEqualTo(new Position(0));
	}
}
