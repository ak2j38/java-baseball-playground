package BaseballFeedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JudgementTest {
    Judgement jud;
    static final List<Integer> computer = Arrays.asList(1,2,3);

    @BeforeEach
    void setUp() {
        jud = new Judgement();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,3", "2,3,4,2", "3,4,5,1",  "4,5,6,0"})
    @DisplayName("일치하는 숫자 갯수 리턴하는 테스트")
    void correctCountTest(int num1, int num2, int num3, int expected) {
        assertThat(jud.correctCount(computer, Arrays.asList(num1,num2,num3))).isEqualTo(expected);
    }


}