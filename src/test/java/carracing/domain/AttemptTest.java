package carracing.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AttemptTest {

    @Test
    void 진행횟수_확인() {
        Attempt attempt = new Attempt(2);
        assertThat(attempt.toInt()).isEqualTo(2);
    }
    @Test
    void 진행횟수생성시_예외발생(){
        assertThatThrownBy(() -> new Attempt(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 시도횟수_감소(){
        Attempt attempt = new Attempt(3);
        attempt=attempt.decrease();
        assertThat(attempt.toInt()).isEqualTo(2);
    }
}