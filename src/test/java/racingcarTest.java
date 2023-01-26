import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class racingcarTest {


    @BeforeEach
    void init(){
    }


    @Test
    @DisplayName("0~9 값 난수 생성 테스트")
    void createRandomNum(){
        Random random = new Random();
        for(int j = 0; j < 100; j++){
            int i = random.nextInt(10);
            Assertions.assertThat(i).isBetween(0, 9);
        }
    }
    @Test
    @DisplayName("Car class 생성 테스트")
    void createCar(){
        Assertions.assertThatThrownBy(() ->{new Car("이름이너무긴차");})
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름은 5자를 넘어갈수 없습니다.");
    }


    @Test
    @DisplayName("race 메서드 테스트")
    void raceTest(){
        Car car1 = new Car("첫번째");
        Car car2 = new Car("두번째");
        Car car3 = new Car("세번째");

        for(int i = 0; i < 5; i++){
            System.out.println("============================");
            car1.race();
            car2.race();
            car3.race();
            System.out.println("============================");
        }

    }

}
