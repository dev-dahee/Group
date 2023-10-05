package com.group1.answer;

import java.util.Scanner;

public class Application3 {
    /*
     * Application2 와 연계 됩니다.
     *
     * 팩토리얼을 다음과 같이 나오도록 작성하세요.
     * 역시 양의 정수만 가능하고 다른 숫자형이 나오면
     * 종료하도록 합니다.(또는 다시 시작해도 좋겠죠)
     * --- 입력값 ---
     * 6
     *
     *
     * --- 출력값 ---
     * 1 * 2 * 3 * 4 * 5 * 6 = 720
     *
     *
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
            for (int i = 1; i < num; i++) {
                System.out.print(i + " * ");
            }
            System.out.print(num + " = ");
            System.out.println(fact);
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
        }
    }
}
