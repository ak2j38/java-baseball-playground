package BaseballFeedback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computerNumbers = generator.createRandomNumbers();

        Referee re = new Referee();

        String result = "";
        while (!result.equals("3스트라이크")) {
            result = re.compare(computerNumbers, askNumbers());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers()  {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String playerInput = sc.nextLine();

        List<Integer> playerNumbers = new ArrayList<>();

        for (String number : playerInput.split("")) {
            playerNumbers.add(Integer.parseInt(number));
        }
        return playerNumbers;
    }
}
