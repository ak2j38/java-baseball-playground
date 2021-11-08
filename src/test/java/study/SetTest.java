package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    void 셋크기확인하는_테스트(){
        int size = numbers.size();
        assertThat(size).isEqualTo(4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void 셋_값존재하는지_확인하는_테스트(int input){
        Assertions.assertTrue(numbers.contains(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:true", "5:false"}, delimiter = ':')
    void 셋_값존재안하는것도_포함하는_테스트(int input, boolean expected){
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
