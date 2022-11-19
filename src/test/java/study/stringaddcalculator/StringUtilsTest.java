package study.stringaddcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
class StringUtilsTest {

    @Test
    @DisplayName("isEmpty(), 빈 문자열 확인 메서드 테스트")
    void isEmptyTest() {
        assertThat(StringUtils.isEmpty("")).isTrue();
    }

    @Test
    @DisplayName("isEmpty(), 문자열 Null 확인 테스트")
    void isEmptyNullTest() {
        assertThat(StringUtils.isEmpty(null)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("isNumeric(), 숫자 체크 테스트")
    @CsvSource(value = {"123:true", "ㅁ123:false", "363:true", "문자열:false"},delimiter = ':')
    void isNumericTest(String str, boolean expected) {
        assertThat(StringUtils.isNumeric(str)).isEqualTo(expected);
    }

}
