package BaseballFeedback;

import java.util.*;

public class NumberGenerator {

    public static final int BALL_SIZE = 3;
    public static final int MAX = 9;

    public Set<Integer> createRandomNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() != BALL_SIZE) {
            numbers.add(new Random().nextInt(MAX) + 1);
        }
        return numbers;
    }
}
