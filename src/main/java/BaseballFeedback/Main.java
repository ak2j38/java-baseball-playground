package BaseballFeedback;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Set<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);

    }
}
