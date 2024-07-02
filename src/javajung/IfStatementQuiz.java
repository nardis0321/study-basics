package javajung;

public class IfStatementQuiz {
    /**
     *  세 개의 정수를 받아서 중간 값 반환하는 메소드 mid 작성하기
     */
    int mid(int a, int b, int c){
        int[] arr = new int[3];

        // a와 b를 비교해서 줄 세우기
        if(a<b){    // a와 b를 비교해서 arr 앞부터 채우기
            arr[0] = a;
            arr[1] = b;
        } else {
            arr[0] = b;
            arr[1] = a;
        }

        // c를 a 그리고 b와 비교해서 끼워넣기
        if(c<arr[0]){   // 이전 비교에서 작은 수가 저장된 arr[0]와 c를 비교하기
            arr[2] = arr[1];
            arr[1] = arr[0];
            arr[0] = c;
        } else if(c<arr[1]){    // 이전 비교에서 큰 수가 저장된 arr[1]과 c를 비교하기
            arr[2] = arr[1];
            arr[1] = c;
        } else {
            arr[2] = c;
        }

        // 최종 중간값 return
        return arr[1];
    }
}