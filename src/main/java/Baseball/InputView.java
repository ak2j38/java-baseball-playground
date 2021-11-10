package Baseball;

import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);
    private static final String NEW_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String END_FLAG = "1";
    private static final String INPUT_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final String WARN_THREE_NUMS = "숫자 3자리를 입력해주세요!";
    private static final String WARN_ONLY_NUMS = "숫자로만 입력해주세요!";

    // 정답을 입력받는 메소드
    // 입력받은 숫자를 리턴한다
    public String getAnswer(){
        System.out.print(INPUT_MESSAGE);
        String answer = sc.nextLine();

        if(isValidInput(answer)){
            return answer;
        }
        return null;
    }

    // 게임 종료를 입력받는 메소드
    public boolean getEndAnswer(){
        System.out.println(NEW_GAME_MESSAGE);
        if(sc.nextLine().equals(END_FLAG)){
            return true;
        }
        return false;
    }

    // 입력받은 숫자의 유효성을 검사하는 메소드
    // 숫자 3자리만을 입력받아야하며 다른 입력은 컷한다
    private boolean isValidInput(String answer){
        if(answer.length() != 3){
            System.out.println(WARN_THREE_NUMS);
            return false;
        } else if(!answer.matches("^[1-9]{3}$")){
            System.out.println(WARN_ONLY_NUMS);
            return false;
        }
        return true;
    }
}
