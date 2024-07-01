package javajung;

public class ArrayQuiz {
    public static void main(String[] args) {
        int[] arr1 = new int[25];
        int[][] arr2 = new int[5][5];

        // 1차원 배열 생성
        System.out.println("1차원 배열 생성");
        for(int i=0; i<25; i++){
            arr1[i] = i;
            System.out.print(arr1[i]+" ");
        }

        // 1차원 배열 --> 2차원 배열
        System.out.println("1차원 배열 --> 2차원 배열");
        for(int i:arr1) {
            arr2[i / 5][i % 5] = i + 1;
            System.out.printf("[%d][%d]=%d%n", i/5, i%5, arr2[i/5][i%5]);
        }

        //2차원 배열 --> 1차원 배열
        System.out.println("2차원 배열 --> 1차원 배열");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = arr2[i / 5][i % 5];
            System.out.print(arr1[i]+" ");
        }

        // 중복 제거하기
        System.out.println("다음 배열의 중복 -> 0으로 바꾸기");
        int[] arr3 = {7, 8, 8, 6, 2, 4, 4, 5, 7};
        // 배열만으로 하기 -->  0으로 교환
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3.length; j++){
                if(i!=j && arr3[i] == arr3[j]){
                    arr3[j] = 0;
                }
            }
        }
        // 중복 제거된 결과 출력
        for(int i : arr3){
            System.out.print(i+" ");
        }

    }
}
