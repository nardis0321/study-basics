package javajung;

import java.util.Vector;

/**
 * Thread Quiz
 * 벡터는 동기화 된 콜렉션인데 왜 에러가 발생할까? 에러를 수정해보자!
 */
public class VectorTest {
    private static Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        while (true) {
                for (int i = 0; i < 10; i++) {
                    vector.add(i);
                }
            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (vector){
                        for (int i = 0; i < vector.size(); i++) {
                            try {
                                Thread.sleep(1000);
                            } catch(Exception e){}
                            vector.remove(i);
                        }
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (vector) {
                        for (int i = 0; i < vector.size(); i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            System.out.println((vector.get(i)));
                        }
                    }
                }
            });
            /**
             *  size()와 get() 사이 sleep() 시에 remove() 들어오지 않도록
             *  vector 객체에 대해 동기화를 걸어서 묶어주었다
             */
            removeThread.start();
            printThread.start();

            while (Thread.activeCount() > 20) ; // 활동중인 스레드 개수가 20이 넘지 않도록 잡아주는 역할
        }
    }
}