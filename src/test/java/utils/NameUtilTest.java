package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameUtilTest {
    
    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("자동차 이름 null 또는 공백")
    void nameNullAndEmpty(String text) {
        assertThatThrownBy(() -> NameUtil.validation(text))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 이름입니다. 다시 입력해주세요.");
    }

    @Test
    @DisplayName("자동차 이름 5글자 초과")
    void nameMoreThen5() {
        assertThatThrownBy(() -> NameUtil.validation("racing"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5글자를 초과할 수 없습니다. 다시 입력해주세요.");
    }

    @Test
    @DisplayName("자동차 이름 시작, 끝 공백 제거")
    void nameTrimSuccess() {
        assertThat(NameUtil.validation(" young ")).isEqualTo("young");
    }

    @Test
    @DisplayName("자동차 이름 부여 성공")
    void nameSuccess() {
        assertThat(NameUtil.validation("young")).isEqualTo("young");
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("입력값 null 또는 공백")
    void splitNullAndEmpty(String text) {
        assertThatThrownBy(() -> NameUtil.split(text))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 입력입니다. 다시 입력해주세요.");
    }

    @ParameterizedTest
    @ValueSource(strings = {",", "name,", ",name", ",name,"})
    @DisplayName("쉼표(,) 위치 확인")
    void splitCommaStartOrEnd(String text) {
        assertThatThrownBy(() -> NameUtil.split(text))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.");
    }

    @Test
    @DisplayName("자동차 이름 분리 성공")
    void splitNameSuccess() {
        final String[] result = NameUtil.split("name1,name2,name3");

        assertThat(result.length).isEqualTo(3);
        assertThat(result).containsExactly("name1", "name2", "name3");
    }
}
