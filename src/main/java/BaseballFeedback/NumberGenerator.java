package BaseballFeedback;

import java.util.*;

public class NumberGenerator {

    public static final int BALL_SIZE = 3;
    public static final int MAX = 9;

    public List<Integer> createRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() != BALL_SIZE) {
            int number = new Random().nextInt(MAX) + 1;
            if (!numbers.contains(number)){
                numbers.add(number);
            }
        }
        return numbers;
    }
}
