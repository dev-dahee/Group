package com.group1.answer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application4 {
    /*
     * 각 자릿수 합 구하기
     * 자연수를 입력했을때
     * 그 자연수의 각 자릿수의 합을 구해보세요.
     *
     * --- 입력값 ---
     * 12345
     *
     *
     * --- 출력값 ---
     * 15
     *
     *
     * --- 입력값2 ---
     * 0
     *
     * --- 출력값2 ---
     * 오류!
     *
     *
     *
     * */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
                return;
            }

            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
        }
    }
}
