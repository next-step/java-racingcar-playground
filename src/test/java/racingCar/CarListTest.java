package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.controller.CarList;
import racingCar.domain.CarName;
import racingCar.domain.Position;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    private CarList cars;
    private String names;

    @BeforeEach
    void setUp(){
        names = "gabi,abc,qwer";
        cars = new CarList( names);

    }

    @DisplayName("자동차 이름을 쉼표로 구분")
    @Test
    void 자동차_쉼표로구분(){
        Assertions.assertThatThrownBy(()->{
            CarName carName1 = new CarName("");
            CarName carName2 = new CarName("12345");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("랜덤값이 4이상인 차량들 움직이기")
    @Test
    void move(){
        Map<CarName, Position> map = new HashMap<>();
        for (String name : names.split(",")){
            map.put(new CarName(name), new Position(2));
        }
        assertThat(cars.move(4)).hasToString(map.toString());
    }

    @DisplayName("랜덤값이 4미만인 차량들 멈추기")
    @Test
    void stop(){
        Map<CarName, Position> map = new HashMap<>();
        for (String name : names.split(",")){
            map.put(new CarName(name), new Position());
        }
        assertThat(cars.move(3)).hasToString(map.toString());
    }
}
