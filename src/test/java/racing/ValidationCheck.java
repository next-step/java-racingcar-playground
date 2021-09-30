package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationCheck {

    @Test
    void 자동차_이름_5자() {
        assertThatThrownBy(() -> Validation.CheckName("abcdef")).isInstanceOf(IllegalArgumentException.class).hasMessage("이름이 6글자 이상입니다")
    }
}
