package javajung;

public class PrintNumberQuiz {
    public static void main(String[] args) {
        System.out.println("------no.1~7------");
        /**
         *   no 1  2  3  4  5 6 7
         * i
         * 1    9  2  3  1  1 2 1
         * 2    8  4  4  3  4 3 1
         * 3    7  6  5  5  9 1 1
         * 4    6  8  6  7 16 2 2
         * 5    5 10  7  9 25 3 2
         * 6    4 12  8 11 36 1 2
         * 7    3 14  9 13 49 2 3
         * 8    2 16 10 15 64 3 3
         * 9    1 18 11 17 81 1 3
         */
        for(int i=1; i<=9; i++) {
            System.out.printf("%d %d %2d %2d %2d %2d %d %d%n",
                    i, 10-i, 2*i, i+2, 2*i-1, i*i, i%3+1, (i+2)/3);
        }

        System.out.println("------no8------");
        /**
         * 1
         * 22
         * 333
         * 4444
         * 55555
         * 666666
         * 7777777
         * 88888888
         * 999999999
         */
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=i; j++) {
                System.out.printf("%d", i);
            }
            System.out.println();
        }

        System.out.println("------no9------");
        /**
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         * 1234567
         * 12345678
         * 123456789
         */
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=i; j++) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }
}
