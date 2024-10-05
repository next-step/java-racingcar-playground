package racingcarGame;

import org.junit.jupiter.api.Test;
import racingcarGame.domain.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 차_1개_생성_테스트() throws Exception {
        Car car1 = new Car("hhj12");
        assertThat(car1).isNotEqualTo(null);
        assertThat(car1.getLocation()).isEqualTo(0);
        assertThat(car1.getName()).isEqualTo("hhj12");
    }

    @Test
    void 차_1개_생성_이름_유효성_테스트() throws Exception {
        assertThatThrownBy(()->{
            Car car2 = new Car("heehun");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 차_1대_이동(){
        Car car1 = new Car("hhj12");
        car1.move(5);
        assertThat(car1.getLocation()).isEqualTo(1);
    }

}
