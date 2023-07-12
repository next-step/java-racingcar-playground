package study.racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EventOrganizerTest {

    @Test
    @DisplayName("경주에 참여할 자동차의 이름을 결정하세요!(이름은 쉼표(,)를 기준으로 구분)")
    void generateCar() {
        //given
        String carNames = "superCar,normalCar,slowCar";
        //when
        EventOrganizer eventOrganizer = new EventOrganizer();
        List<Car> participatingCars = eventOrganizer.generateCar(carNames);
        //then
        assertThat(participatingCars).usingRecursiveComparison()
            .isEqualTo(Arrays.asList(new Car("superCar",0), new Car("normalCar",0), new Car("slowCar",0)));
    }

    @Test
    @DisplayName("시도할 횟수를 결정하세요!")
    void determineTryNum() {
        //given
        int tryNum = 5;
        //when
        //then
    }

}
