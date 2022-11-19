package study.stringaddcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
class CustomTokenMatcherTest {

    private CustomTokenMatcher customTokenMatcher;

    @BeforeEach
    void init() {
        customTokenMatcher = new CustomTokenMatcher("//;\n1;2;3");
    }

    @Test
    @DisplayName("내용 테스트")
    void getContent() {
        assertThat(customTokenMatcher.getContent()).isEqualTo(Arrays.asList("1","2","3"));
    }
}
