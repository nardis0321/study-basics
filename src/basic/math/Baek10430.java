package basic.math;

import java.util.Scanner;

/**
 * 백준10430 나머지 https://www.acmicpc.net/problem/10430
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 *
 * ==> 모듈러 연산에 대한 공부
 */
public class Baek10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        // (A+B) %C = (A%C + B%C)%C
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
        // (A*B)%C = (A%C * B%C)%C

        // 모듈러 연산의 대표적 속성 두 가지
        // '결과 값에 n을 나눈 수를 출력하여라' 같은 문제들에 적용된다
    }
}
