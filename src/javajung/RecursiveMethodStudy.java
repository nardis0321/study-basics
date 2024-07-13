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

    /*
    100(num)부터 1까지 더하기
       문제를 정의하기 : return 100 + ... + 1 (100부터 1까지 모두 더한 결과)
       베이스 조건 : 1에서 멈추기
       1 => return 1
       2 => return 2+1
    */
    public static int sumNumbers(int num){
        if(num == 1)
            return 1;
        return num + sumNumbers(num-1);
        //
    }

    /*
    binary search
        start - 시작 인덱스
        end - 마지막 인덱스
        array - 오름차순으로 정렬된 수가 들어있는 배열
        num - 찾아야할 값
        return : num의 index
    */
    public static int binary_search(int start, int end, int[] array, int num){
        // 베이스 : start == end일 시, 해당 index를 반환 => array[mid] == num 으로 통합
        int mid = (end + start)/2;  // 이분탐색을 위한 중간값 계산

        if(array[mid] == num) { // index를 찾은 경우, 해당 index를 반환
            return mid;
        }

        if (array[mid] < num){   // 찾은 값이 더 작은 값
            if(mid+1 > end) // 끝까지 찾았지만 없는 경우
                return -1;
            return binary_search(mid+1, end, array, num);   // mid보다 큰 값 찾기
        } else {                 // 찾은 값이 더 큰 값
            if(mid-1 < start) // 끝까지 찾았지만 없는 경우
                return -1;
            return binary_search(start, mid-1, array, num); // mid보다 작은 값 찾기
        }
    }
    // 문제를 정의하듯 코딩하기
    // 테스트 케이스로 stack overflow 발생 찾음 --> 원인 규명 : mid값 계산 로직 변경
    // 테스트 케이스로 stack.. --> mid값 미포함 로직으로 변경

    public static void main(String[] args) {
        // 팩토리얼 테스트
        System.out.print("factorial: ");
        int result = factorial(5);
        System.out.println(result);

        // 피보나치 테스트
        System.out.print("fibonacci: ");
        result = fibonacci(5);
        System.out.println("fibonacci(5) = " + result);

        // 더하기 테스트
        System.out.println("sum test: ");
        System.out.println("sumNumbers(5) = " + sumNumbers(5));
        System.out.println("sumNumbers(10) = " + sumNumbers(10));
        System.out.println("sumNumbers(100) = " + sumNumbers(100));

        // 바이너리 테스트
        System.out.println("Binary Search: ");
        int[] array = {1,2,3};
        result = binary_search(0, array.length-1, array, 2);
        System.out.println("test1 "+result);

        array = new int[]{1, 2, 3, 4, 5, 6};
        result = binary_search(0, array.length-1, array, 5);
        System.out.println("test2 "+result);

        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        result = binary_search(0, array.length-1, array, 9);
        System.out.println("test3 "+result);

        result = binary_search(0, array.length-1, array, 2);
        System.out.println("test4 "+result);

        result = binary_search(0, array.length-1, array, 16);
        System.out.println("test5 "+result);

        result = binary_search(0, array.length-1, array, 0);
        System.out.println("test6 "+result);
    }
}