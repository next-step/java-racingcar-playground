import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalcuratorTest {
    StringAddCalcurator stringAddCalcurator = new StringAddCalcurator();

    @Test
    @DisplayName("빈문자 혹은 null값 입력 시 0 반환")
    public void test1() {
        assertThat(stringAddCalcurator.solve("")).isEqualTo(0);
        assertThat(stringAddCalcurator.solve(null)).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나 입력 시 해당 값을 반환")
    public void test2() {
        assertThat(stringAddCalcurator.solve("12")).isEqualTo(12);
        assertThat(stringAddCalcurator.solve("2")).isEqualTo(2);
    }

    @Test
    @DisplayName("콤마를 이용해서 구분 시 숫자들의 총 합을 반환")
    public void test3() {
        assertThat(stringAddCalcurator.solve("1,2")).isEqualTo(3);
        assertThat(stringAddCalcurator.solve("1,2,3")).isEqualTo(6);
    }

    @Test
    @DisplayName("콜롬를 이용해서 구분 시 숫자들의 총 합을 반환")
    public void test4() {
        assertThat(stringAddCalcurator.solve("1:2")).isEqualTo(3);
        assertThat(stringAddCalcurator.solve("1:2:3")).isEqualTo(6);
    }

    @Test
    @DisplayName("콤마와 콜롬을 이용해 구분 시 숫자들의 총 합을 반환")
    public void test5() {
        assertThat(stringAddCalcurator.solve("1,2:3")).isEqualTo(6);
    }
}
