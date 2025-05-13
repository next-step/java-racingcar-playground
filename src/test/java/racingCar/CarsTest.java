package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CarsTest {

    private final String input = "pobi,crong,honux";

    private Cars cars = null;

    @BeforeEach
    void setUp() {
        cars = new Cars(input);
    }

    @Test
    void 차_셋팅_실패() {

        String str = "pobicronghonux";
        Assertions.assertThatThrownBy(() -> new Cars(str))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력 값에 쉼표(,) 기준으로 구분합니다.");
    }

    @Test
    void 차_셋팅() {
        cars.getAllCarList().forEach(e -> {
            System.out.println("e.getCarName() = " + e.getCarName());
        });
    }

    @Test
    void playing() {

        int count = 5;

        for (int i = 0; i < count; i++) {
            cars.play();
        }

        ResultView.printWinner(cars.whoIsWinner(cars.getAllCarList()));
    }
}