package carracing.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class nameTest {

    @Test
    void 자동차_이름_예외() {
        assertThatThrownBy(() -> new Name("다섯글자이상"))
            .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void 자동차_이름_성공_테스트(){
        Name name = new Name("성공");
        assertThat(name.getName()).isEqualTo("성공");
    }
}
