package BaseballFeedback;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);

        Judgement jud = new Judgement();
        int result = jud.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2));
        System.out.println(result);

        System.out.println(jud.hasPlace(Arrays.asList(1,2,3), 1, 1));

    }
}
