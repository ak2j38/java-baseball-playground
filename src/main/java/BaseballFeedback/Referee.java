package BaseballFeedback;

import java.util.List;

public class Referee {
    final static int BALL_SIZE = 3;
    final static String GAME_END_CONDITION = "3스트라이크";

    public String compare(List<Integer> computer, List<Integer> player) {
        // 볼의 개수를 먼저 구한 뒤(몇개의 숫자가 같은 뒤 알아낸뒤)
        Judgement jud = new Judgement();
        int correctCount = jud.correctCount(computer, player);
        int strikeCount = 0;
        // 스트라이크의 갯수를 구해 뺀다 -> 볼의 갯수
        for (int i=0; i<player.size(); i++) {
            if (jud.hasPlace(computer, i, player.get(i))) {
                strikeCount++;
            }
        }

        correctCount -= strikeCount;
        if (correctCount ==0 && strikeCount == 0) {
            return String.format("낫싱");
        } else if (strikeCount == 0) {
            return String.format("%d볼", correctCount);
        } else if (correctCount == 0) {
            return String.format("%d스트라이크", strikeCount);
        }
        return String.format("%d볼 %d스트라이크", correctCount, strikeCount);
    }

    public boolean isAllMatch(String gameResult) {
        return gameResult.equals(GAME_END_CONDITION);
    }

}
