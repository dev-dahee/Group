package com.group1.answer;

import java.util.Scanner;

public class Application2 {
    /*
     * 팩토리얼 계산.
     *
     * 사용자로부터 문자열을 입력 받아
     * 그 수의 팩토리얼을 계산하는 프로그램을 작성
     *
     * 1이상의 정수만 나오도록 하고,
     * 0이하의 정수나 실수는 오류가 출력되도록 하세요.
     * --- 입력값 ---
     * 5
     *
     * --- 출력값 ---
     * 120
     *
     *
     * --- 참고사항 ---
     * 팩토리얼은 다음과 같습니다.
     * "1부터 자기자신까지 모든 정수를 곱한 값"
     *
     * --- 예시 ---
     * 5 -> 5 * 4 * 3 * 2 * 1 = 120
     * 3 -> 3 * 2 * 1 = 6
     * 1 -> 1 = 1
     * 1.3 -> X
     * -2 -> X
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();

        try {
            int num = Integer.parseInt(numStr);
            if (num < 1) {
                System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
                return;
            }
            int fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            System.out.println(fact);
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
        }
    }
}
