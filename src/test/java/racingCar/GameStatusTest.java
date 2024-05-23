package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.domain.GameStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameStatusTest {

    @DisplayName("게임 종료 테스트")
    @Test
    void 게임종료(){
        GameStatus status = GameStatus.END;
        assertThat(status.isEnd(0)).isTrue();
    }

    @DisplayName("게임 시작 테스트")
    @Test
    void 게임시작(){
        GameStatus status = GameStatus.START;
        assertThat(status.isStart()).isTrue();
    }
}
