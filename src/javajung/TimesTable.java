package javajung;

/**
 * 자바의 정석 4-12 구구단 문제
 * 2*1= 2    3*1= 3    4*1= 4
 * 2*2= 4    3*2= 6    4*2= 8
 * 2*3= 6    3*3= 9    4*3=12
 *
 * 5*1= 5    6*1= 6    7*1= 7
 * 5*2=10    6*2=12    7*2=14
 * 5*3=15    6*3=18    7*3=21
 *
 * 8*1= 8    9*1= 9
 * 8*2=16    9*2=18
 * 8*3=24    9*3=27
 */
public class TimesTable {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=2; j<5; j++){
                if((j + i/3*3) > 9)
                    break;

                System.out.printf("%d*%d=%2d    ", j + i/3*3, i%3 + 1, (j + i/3*3)*(i%3 + 1));
            }
            System.out.println();
            if (i%3-2 == 0) System.out.println();
        }
    }
}
