package BaseballFeedback;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    static Scanner sc = new Scanner(System.in);

    // 게임진행
    public void startGame() {
        NumberGenerator generator = new NumberGenerator();
        Referee re = new Referee();
        boolean isWantMoreGame = true;
        boolean isNewGame = false;
        List<Integer> computerNumbers = generator.createRandomNumbers();

        while (isWantMoreGame) {
            if (isNewGame) {
                computerNumbers = generator.createRandomNumbers();
                isNewGame = false;
            }

            String gameResult = re.compare(computerNumbers, askNumbers());
            MessagePrint.printCompareResult(gameResult);

            if (re.isAllMatch(gameResult)) {
                MessagePrint.printMoreGameMessage();
                isWantMoreGame = wantMoreGame(sc.nextLine());
                isNewGame = true;
            }
        }
    }

    private static boolean wantMoreGame(String input) {
        return input.equals("1") ? true : false;
    }

    // 플레이어 숫자 입력받기
    private static List<Integer> askNumbers()  {
        MessagePrint.printInputMessage();

        String playerInput = sc.nextLine();

        List<Integer> playerNumbers = new ArrayList<>();

        for (String number : playerInput.split("")) {
            playerNumbers.add(Integer.parseInt(number));
        }
        return playerNumbers;
    }
}
