package RacingGame.domain;


import domain.CarNameValidator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameValidatorTest {
    @Test
    public void 자동차_이름_글자수_테스트() {
        assertThatThrownBy(() -> CarNameValidator.validateCarName("testtest"))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("모든 자동차 이름은 5글자 이하여야 합니다.");
    }
    @Test
    public void 자동차_이름이_존재하지_않는_경우_테스트(){
        assertThatThrownBy(()->CarNameValidator.validateCarName(""))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("모든 자동차 이름은 반드시 존재해야 합니다.");
    }
    @Test
    public void 자동차_이름이_공백인_경우_테스트(){
        assertThatThrownBy(() -> CarNameValidator.validateCarName("    "))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("자동차 이름은 공백으로 설정할 수 없습니다.");
    }

    @Test
    public void 자동차_이름_중복_테스트(){
        assertThatThrownBy(()->CarNameValidator.checkDuplication(Arrays.asList("이브" , "이브", "포비")))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("자동차 이름은 중복될 수 없습니다.");
    }

    @Test
    public void 자동차_이름_정상_테스트(){
        assertThat(CarNameValidator.validateCarName("규영")).isTrue();
    }

}
