package racingcar;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> findWinners() {
		Position maxPosition = getMaxPosition();

		return cars.stream()
			.filter(car -> car.getPosition().equals(maxPosition))
			.collect(Collectors.toList());
	}

	public Position getMaxPosition() {

		return cars.stream().map(Car::getPosition).max(
			Comparator.comparingInt(Position::getPosition)
		).orElse(new Position(0));
	}

	public List<Car> getCars() {
		return cars;
	}

	public void moveAll(MoveStrategy moveStrategy) {
		cars.forEach(car -> car.move(moveStrategy));
	}
}
