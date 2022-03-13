package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class PositionTest {
	@Test
	void create() {
		assertThatThrownBy( () -> {
			new Position(-1);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void add() {
		Position position = new Position(1);
		position.add();

		assertThat(position).isEqualTo(new Position(2));
	}
}
