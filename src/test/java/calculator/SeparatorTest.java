package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeparatorTest {

    @Test
    @DisplayName("기본 구분자(,|:)로 구분한다.")
    void basicTwoSeparatorsTest() {
        Separator separator = new Separator();
        String input = "1,2:3";
        assertThat(separator.separate(input)).isEqualTo(new String[]{"1","2","3"});
    }
    @Test
    @DisplayName("기본 구분자(,)로 구분한다.")
    void basicOneSeparatorTest() {
        Separator separator = new Separator();
        String input = "1,2";
        assertThat(separator.separate(input)).isEqualTo(new String[]{"1","2"});
    }

    @Test
    @DisplayName("커스텀 구분자로 구분한다.")
    void customSeparatorTest() {
        Separator separator = new Separator();
        String inputWithStarSplit = "//*\n1*2*3";
        String inputWithCollonSplit = "//;\n1;2;3";
        assertThat(separator.separate(inputWithStarSplit)).isEqualTo(new String[]{"1","2","3"});
        assertThat(separator.separate(inputWithCollonSplit)).isEqualTo(new String[]{"1","2","3"});
    }

    @Test
    @DisplayName("숫자 한개만 입력한다.")
    void inputOnlyOneNumberTest() {
        Separator separator = new Separator();
        String input = "1";
        assertThat(separator.separate(input)).isEqualTo(new String[]{"1"});
    }
}
