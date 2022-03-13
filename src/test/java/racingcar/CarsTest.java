package racingcar;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	void findWinners() {
		Car ws = new Car("ws", 5);
		Car mh = new Car("mh", 5);
		Car dh = new Car("dh", 3);
		Cars cars = new Cars(Arrays.asList(ws, mh, dh));

		assertThat(cars.findWinners()).containsExactly(ws, mh);
	}

	@Test
	void getMaxPosition() {
		Car ws = new Car("ws", 5);
		Car mh = new Car("mh", 4);
		Car dh = new Car("dh", 3);
		Cars cars = new Cars(Arrays.asList(ws, mh, dh));

		assertThat(cars.getMaxPosition()).isEqualTo(new Position(5));
	}

	@Test
	void moveAll() {
		Car ws = new Car("ws", 5);
		Car mh = new Car("mh", 4);
		Car dh = new Car("dh", 3);
		Cars cars = new Cars(Arrays.asList(ws, mh, dh));

		cars.moveAll(() -> true);
		List<Car> carList = cars.getCars();

		assertAll(
			() -> assertThat(carList.get(0).getPosition()).isEqualTo(new Position(6)),
			() -> assertThat(carList.get(1).getPosition()).isEqualTo(new Position(5)),
			() -> assertThat(carList.get(2).getPosition()).isEqualTo(new Position(4))
		);

	}

}
