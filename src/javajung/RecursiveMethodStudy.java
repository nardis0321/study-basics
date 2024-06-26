package javajung;

/**
 * 재귀함수를 공부해보자
 */
public class RecursiveMethodStudy {

    // 팩토리얼 구현
    static int result = 1;
    public static void factorial(int n){
        if(n==1){
            return;
        }

        result = result*n--;
        factorial(n);
    }

    // 피보나치 수열 구현
    static int x = 1;
    static int y = 1;
    public static void fibonacci(int n){
        if (result == n){
            return;
        }

        result = x + y;

        x = y;
        y = result;
        System.out.print(result+" "); // 수열 출력
        fibonacci(n);
    }

    public static void main(String[] args) {
        // 팩토리얼 테스트
        System.out.print("factorial: ");
        factorial(5);
        System.out.println(result);

        // 피보나치 테스트
        System.out.print("fibonacci: 1 1 ");
        fibonacci(55);
    }
}
