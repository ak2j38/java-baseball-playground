package BaseballFeedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumberGeneratorTest {

    NumberGenerator numberGenerator;

    @BeforeEach
    void setUp() {
        numberGenerator = new NumberGenerator();
    }

    @RepeatedTest(10)
    @DisplayName("3자리의 랜덤 숫자 생성")
    void createRandomNumbersSize3Test() {
        assertThat(numberGenerator.createRandomNumbers().size()).isEqualTo(3);
    }

    @RepeatedTest(10)
    @DisplayName("겹치지 않는 랜덤 숫자 생성")
    void createRandomNumbersNoDuplicateTest() {
        List<Integer> randomNumbers = numberGenerator.createRandomNumbers();
        for (int num : randomNumbers) {
            assertThat(randomNumbers.stream().filter(n -> n.equals(num)).count()).isEqualTo(1);
        }
    }
}