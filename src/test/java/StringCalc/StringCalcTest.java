package StringCalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalcTest {

    private Main main;

    @BeforeEach
    void setMain(){
        main = new Main();
    }

    @Test
    void 덧셈테스트(){
        assertThat(main.calc(1, 2, "+")).isEqualTo(3);
    }

    @Test
    void 뺄셈테스트(){
        assertThat(main.calc(4, 2, "-")).isEqualTo(2);
    }

    @Test
    void 곱셈테스트(){
        assertThat(main.calc(5, 2, "*")).isEqualTo(10);
    }

    @Test
    void 나눗셈테스트(){
        assertThat(main.calc(10, 2, "/")).isEqualTo(5);
    }

}
