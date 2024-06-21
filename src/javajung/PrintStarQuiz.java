package javajung;

public class PrintStarQuiz {
    public static void main(String[] args) {
        System.out.println("no1");
        /**
         * *****
         * *****
         * *****
         * *****
         * *****
         */
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("no2");
        /**
         * *
         *  *
         *   *
         *    *
         *     *
         */
        for(int i=0; i<5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.println("no3");
        /**
         *     *
         *    *
         *   *
         *  *
         * *
         */
        for(int i=0; i<5; i++) {
            for(int j=4; j>i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.println("no4");
        /**
         * *   *
         *  * *
         *   *
         *  * *
         * *   *
         */
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i==j || i+j==4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("no5");
        /**
         * *
         * **
         * ***
         * ****
         * *****
         */
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("no6");
        /**
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i>j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("no7");
        /**
         * *****
         * ******
         * *******
         * ********
         * *********
         */
        int index = 5;
        for(int i=0; i<5; i++) {
            for(int j=0; j<index; j++) {
                System.out.print("*");
            }
            index += 1;
            System.out.println();
        }

        System.out.println("no8");
        /**
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         */
        index = 5;
        int index2 = 4;
        for(int i=0; i<5; i++) {
            for(int j=0; j<index; j++) {
                if(index2>j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            index++;
            index2--;
            System.out.println();
        }

        System.out.println("no9");
        /**
         * *   *
         * ** **
         * *****
         * ** **
         * *   *
         */
        int max = 5;
        for(int i=0; i<max; i++) {
            for(int j=0; j<max; j++) {
                if(i<=j && i+j>=4) {
                    System.out.print("*");
                } else if(i>=j && i+j<=4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("no10");
        /**
         * *****
         *  ***
         *   *
         *  ***
         * *****
         */
        max = 5;
        for(int i=0; i<max; i++) {
            for(int j=0; j<max; j++) {
                if(i<=j && i+j<=4) {
                    System.out.print("*");
                } else if(i>=j && i+j>=4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}