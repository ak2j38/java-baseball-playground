package BaseballFeedback;

public class BaseballFB {
    private static final int MIN = 1;
    private static final int MAX = 9;

    public static boolean setAnswer(int ballNo) {
        return ballNo >= MIN && ballNo <= MAX;
    }
}
