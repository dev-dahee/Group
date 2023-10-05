package com.group1.answer;

import java.util.Scanner;

public class Application1 {
    /*
     * 문자열 뒤집기
     *
     * 사용자로 부터 문자열을 입력 받아
     * 그 문자열을 뒤집는 프로그램을 작성하세요.
     *
     * --- 입력값 ---
     * Hello, World
     *
     *
     * --- 출력값 ---
     * dlroW, olleH
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();

        f1(inputStr);
        System.out.println(f2(inputStr));
    }

    public static void f1(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - i - 1));
        }
        System.out.println();
    }

    public static String f2(String str) {
        String result = ""; // StringBuilder가 성능이 좀 더 좋다. 연산량이 많은 경우. StringBuffer도 괜찮지만 멀티스레드 떄문에 StringBuilder 추천.
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(str.length() - i - 1);
        }
        return result;
    }
}
