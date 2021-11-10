package Baseball;

import java.util.Scanner;

public class ResultView {
    private Scanner scanner = new Scanner(System.in);
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String BALL_STRIKE = "%d볼 %d스트라이크";
    private static final String BALL = "%d볼";
    private static final String STRIKE = "%d스트라이크";
    private static final String NO_EQUALS = "낫싱";

    public void showEndMessage(){
        System.out.println(END_MESSAGE);
    }

    // 정답을 출력하는 메소드
    public String isAnswer(String input, String answer){
        int ball = 0, strike = 0;

        if(answer.charAt(0) == input.charAt(0)){
            strike++;
        }else if(answer.contains(String.valueOf(input.charAt(0)))){
            ball++;
        }
        if(answer.charAt(1) == input.charAt(1)){
            strike++;
        }else if(answer.contains(String.valueOf(input.charAt(1)))){
            ball++;
        }
        if(answer.charAt(2) == input.charAt(2)){
            strike++;
        }else if(answer.contains(String.valueOf(input.charAt(2)))){
            ball++;
        }

        if(strike > 0 && ball > 0){
            return String.format(BALL_STRIKE, ball, strike);
        } else if (strike == 0 && ball == 0){
            return NO_EQUALS;
        } else if (ball == 0){
            return String.format(STRIKE, strike);
        }
        return String.format(BALL, ball);
    }
}
