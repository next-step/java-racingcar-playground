package racingGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 글자수5개제한() {
        assertThatThrownBy(() -> new Car("asdfgd"))
                .isInstanceOf(RuntimeException.class);
    }
}
