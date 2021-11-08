package StringCalc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        Queue<String> operators = new LinkedList<>();
        Queue<Integer> operands = new LinkedList<>();

        System.out.println("사칙연산 문자열을 입력하세요 : ");
        String input = sc.nextLine();
        String[] split = input.split(" ");

        for(String str : split){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                operators.add(str);
                continue;
            }
            operands.add(Integer.parseInt(str));
        }

        // calc
        int sum = operands.poll();
        for(String operator : operators){
            int operand = operands.poll();
            sum = calc(sum, operand, operator);
        }

        // output
        System.out.println("결과는 " + sum + " 입니다.");
    }

    public static int calc(int operand1, int operand2, String operator){
        if(operator.equals("+")) return operand1 + operand2;
        if(operator.equals("-")) return operand1 - operand2;
        if(operator.equals("*")) return operand1 * operand2;
        return operand1 / operand2;
    }
}
