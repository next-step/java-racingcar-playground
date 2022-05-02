package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없다.")
    void carNameCannotExceedFiveCharacters() {
        assertThatThrownBy(() -> new Name("aarona"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차 이름은 공백일 수 없다.")
    void carNameCannotBeBlank() {
        assertThatThrownBy(() -> new Name(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 공백일 수 없습니다.");
    }
}
