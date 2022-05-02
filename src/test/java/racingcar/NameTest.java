package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없다.")
    void theNameOfTheCarCannotExceedFiveCharacters() {
        assertThatThrownBy(() -> new CarName("aarona"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }
}
