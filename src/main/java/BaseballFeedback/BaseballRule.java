package BaseballFeedback;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballRule {

    // 게임진행
    public void startGame() {
//        NumberGenerator generator = new NumberGenerator();
//        Referee re = new Referee();
//        boolean isGameFinished = false;
//
//        while (isGameFinished) {
//            List<Integer> computerNumbers = generator.createRandomNumbers();
//
//            isGameFinished = re.isAllMatch()
//        }

    }

    // 플레이어 숫자 입력받기
    private static List<Integer> askNumbers()  {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String playerInput = sc.nextLine();

        List<Integer> playerNumbers = new ArrayList<>();

        for (String number : playerInput.split("")) {
            playerNumbers.add(Integer.parseInt(number));
        }
        return playerNumbers;
    }


    // 게임종료 질문
    //private

    // 게임재시작
    //private

}
