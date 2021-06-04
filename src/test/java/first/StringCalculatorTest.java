package first;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {

    @Test
    void 단순_구분자_분리() {
        assertThat("1,2".split(",")).contains("1", "2");
    }

    @Test
    void 복합_구분자_분리() {
        assertThat("1,2:3".split("[,:]")).contains("1", "2", "3");
    }

    @Test
    void 정규표현식_구분자_분리() {
        Matcher matcher = Pattern.compile("//(.*)\n(.*)").matcher("//:\n1:2:3");
        matcher.find();
        assertThat(matcher.group(1)).isEqualTo(":");
        assertThat(matcher.group(2)).isEqualTo("1:2:3");
    }

    @Test
    void 정규표현식_구분자_분리_복합() {
        Matcher matcher = Pattern.compile("//(.*)\n(.*)").matcher("1,2;3");
        String seperator = "[,;]";
        if (matcher.find()) {
            seperator = matcher.group(1);
        }
        assertThat(seperator).isEqualTo("[,;]");
    }

    @Test
    void 정규표현식_구분자_분리_복합2() {
        Matcher matcher = Pattern.compile("//(.*)\n(.*)").matcher("//;\n1;2;3");
        String seperator = "[,;]";
        if (matcher.find()) {
            seperator = matcher.group(1);
        }
        assertThat(seperator).isEqualTo(";");
    }

    @Test
    void NULL_덧셈() {
        assertThat(StringCalculator.add(null)).isEqualTo(0);
    }

    @Test
    void 빈문자_덧셈() {
        assertThat(StringCalculator.add("")).isEqualTo(0);
    }

    @Test
    void 단순_구분자_덧셈() {
        assertThat(StringCalculator.add("1,2,3")).isEqualTo(6);
    }

    @Test
    void 복합_구분자_덧셈() {
        assertThat(StringCalculator.add("1,2;3")).isEqualTo(6);
    }

    @Test
    void 정규표현식_구분자_덧셈() {
        assertThat(StringCalculator.add("//::\n1::2::3")).isEqualTo(6);
    }

    @Test
    void 음수값_덧셈_예외던지기() {
        assertThatThrownBy(() -> StringCalculator.add("-1,2,3"));
        assertThatThrownBy(() -> StringCalculator.add("1,2;-3"));
        assertThatThrownBy(() -> StringCalculator.add("//,\n1,-2,3"));
    }

    @Test
    void 숫자가아닌_덧셈_예외던지기() {
        assertThatThrownBy(() -> StringCalculator.add("-1,2,#"));
        assertThatThrownBy(() -> StringCalculator.add("1,@;-3"));
        assertThatThrownBy(() -> StringCalculator.add("//,\n1,&,3"));
    }
}
