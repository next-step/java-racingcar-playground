package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationCheck {

    @Test
    void 자동차_이름_5자() {
        assertThatCode(() -> Validation.CheckName("abcdef")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("이름이 6글자 이상입니다");
        assertThatCode(() -> Validation.CheckName("abcd")).doesNotThrowAnyException();
    }

    @Test
    void 자동차_이름_null_empty_공백_확인() {
        assertThatCode(() -> Validation.CheckName(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("잘못된 이름 입니다 다시 입력 해 주세요");
        assertThatCode(() -> Validation.CheckName(" ")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("잘못된 이름 입니다 다시 입력 해 주세요");
        assertThatCode(() -> Validation.CheckName("")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("잘못된 이름 입니다 다시 입력 해 주세요");
    a
}
