package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    private Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing();
    }
    @Test
    @DisplayName("자동차 추가")
    void addCar() {
        racing.addCar("pobi");
        racing.addCar("crong");
        racing.addCar("honux");

        assertThat(racing.getCars().size()).isEqualTo(3);
        assertThat(racing.getCars()).extracting("name").containsExactly("pobi", "crong", "honux");
    }
}
