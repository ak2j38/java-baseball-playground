package BaseballFeedback;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ValidationTest {
    @Test
    void 컴퓨터정답_1_9() {
        assertThat(BaseballFB.setAnswer(1)).isTrue();
        assertThat(BaseballFB.setAnswer(9)).isTrue();
        assertThat(BaseballFB.setAnswer(0)).isFalse();
        assertThat(BaseballFB.setAnswer(10)).isFalse();
    }


}
