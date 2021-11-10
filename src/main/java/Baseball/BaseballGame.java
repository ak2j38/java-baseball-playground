package Baseball;

import java.util.Set;
import java.util.TreeSet;

public class BaseballGame {
    private InputView inputView;
    private ResultView resultView;
    private String computerAnswer;
    private static final String THREE_STRIKE = "3스트라이크";

    public BaseballGame(){
        init();
    }

    private void init(){
        inputView = new InputView();
        resultView = new ResultView();
    }

    // 게임을 시작하는 메소드
    public void startGame(){
        // 컴퓨터 정답 생성
        if(computerAnswer == null){
            computerAnswer = setComputerAnswer();
        }

        // 정답체크
        String result = "";
        while(!result.equals(THREE_STRIKE)){
            result = resultView.isAnswer(inputView.getAnswer(), computerAnswer);
            System.out.println(result);
        }

        // 축하문구 프린트
        resultView.showEndMessage();

        // 새로운게임
        if(inputView.getEndAnswer()){
            computerAnswer = null;
            startGame();
        }
    }

    // 컴퓨터의 정답을 생성하는 메소드
    private String setComputerAnswer(){
        String answer = "";
        Set<Integer> nums = new TreeSet<>();
        while(nums.size() != 3){
            nums.add((int)(Math.random() * (9 - 1 + 1)) + 1);
        }
        for(int num : nums){
            answer += String.valueOf(num);
        }
        return answer;
    }
}
