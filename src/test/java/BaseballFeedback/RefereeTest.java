package BaseballFeedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    Referee referee;
    static final List<Integer> ANSWER = Arrays.asList(1,2,3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @DisplayName("3스트라이크")
    @Test
    void strike_3() {
        assertThat(referee.compare(ANSWER, Arrays.asList(1,2,3))).isEqualTo("3스트라이크");
    }

    @DisplayName("3볼")
    @Test
    void ball_3() {
        assertThat(referee.compare(ANSWER, Arrays.asList(3,1,2))).isEqualTo("3볼");
    }

    @DisplayName("낫싱")
    @Test
    void nothing() {
        assertThat(referee.compare(ANSWER, Arrays.asList(7,8,9))).isEqualTo("낫싱");
    }

    @DisplayName("2볼 1스트라이크")
    @Test
    void ball_1_strike_2() {
        assertThat(referee.compare(ANSWER, Arrays.asList(1,3,2))).isEqualTo("2볼 1스트라이크");
    }
}