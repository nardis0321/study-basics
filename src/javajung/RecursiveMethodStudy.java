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

    public static void main(String[] args) {
        // 팩토리얼 테스트
        System.out.println("factorial: ");
        factorial(5);
        System.out.println(result);
    }
}
