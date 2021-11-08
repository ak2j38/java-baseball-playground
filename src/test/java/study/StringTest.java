package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] sp = "1,2".split(",");
        assertThat(sp[0]).isEqualTo("1");
        assertThat(sp[1]).isEqualTo("2");
        assertThat(sp).contains("1");
        assertThat(sp).contains("2");
        assertThat(sp).containsExactly("1", "2");
    }

    @Test
    void subString(){
        String ss = "(1,2)".substring(1,4);
        assertThat(ss).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정위치의 문자를 가져오는 테스트")
    void charAt(){
        Character c0 = "abc".charAt(0);
        Character c1 = "abc".charAt(1);
        Character c2 = "abc".charAt(2);

        assertThat(c0).isEqualTo('a');
        assertThat(c1).isEqualTo('b');
        assertThat(c2).isEqualTo('c');
    }

    @Test
    @DisplayName("예외 발생시키는 테스트")
    void charAt2(){
        assertThatThrownBy(()->{
            Character c3 = "abc".charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("3");
    }
}
