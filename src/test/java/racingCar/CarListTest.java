package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    @DisplayName("자동차 이름을 쉼표로 구분 후, 자동차 인스턴스를 생성하는 기능")
    @Test
    void 자동차_이름_구분(){
        String names = "gabi,qwer,abc";
        CarList carList = new CarList(names);
        List<Car> cars = carList.getCars();
        assertThat(cars).isEqualTo(Arrays.asList(new Car("gabi"), new Car("qwer"), new Car("abc")));
    }


}
