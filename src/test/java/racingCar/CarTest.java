package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

    Car car = null;

    @Test
    void 차_셋팅_실패() {

        String carName = "pobixxx";

        Assertions.assertThatThrownBy(() -> car = new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    void 차_셋팅() {
        String carName = "pobi";

        car = new Car(carName);
        Assertions.assertThat(car.getCarName()).isEqualTo(carName);
    }
}