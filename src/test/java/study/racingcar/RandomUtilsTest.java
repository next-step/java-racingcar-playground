package study.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
class RandomUtilsTest {

    @Test
    @DisplayName("10 미만 랜덤 숫자 테스트")
    void getIntTest() {
        int limit = 10;
        assertThat(RandomUtils.getInt(limit)).isLessThan(limit).isNotNegative();
    }
}
