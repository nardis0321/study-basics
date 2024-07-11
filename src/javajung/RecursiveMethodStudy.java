package javajung;

/**
 * 재귀함수를 공부해보자
 */
public class RecursiveMethodStudy {

    // 팩토리얼 구현
    // 팩토리얼 : 1부터 n까지 곱하기
    public static int factorial(int n){
        if(n <= 1)
            return 1;
        return n*factorial(n-1);
    }

    // 피보나치 수열
    // fibo(n)은 n번째 피보나치 수를 돌려준다
    // fibo(n-1)은 n-1번째, fibo(n-2)는 n-2번째이고 두 개를 더하면 fibo(n)
    public static int fibonacci(int n){
        if (n < 3)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        // 팩토리얼 테스트
        System.out.print("factorial: ");
        int result = factorial(5);
        System.out.println(result);

        // 피보나치 테스트
        System.out.print("fibonacci: ");
        result = fibonacci(5);
        System.out.println("fibonacci(5) = " + result);

    }
}
