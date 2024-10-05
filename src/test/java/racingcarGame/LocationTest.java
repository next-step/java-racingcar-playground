package racingcarGame;

import org.junit.jupiter.api.Test;
import racingcarGame.domain.Position;

import static org.assertj.core.api.Assertions.*;

public class LocationTest {
    @Test
    void create() {
        Position position = new Position(3);
        assertThat(position).isNotNull();
        assertThat(position.getPosition()).isEqualTo(3);

    }
    @Test
    void valid() {
        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class);

    }
}
