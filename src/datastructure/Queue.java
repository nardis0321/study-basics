package datastructure;

public class Queue {
    /**
     * FIFO
     */
    private Object[] queueArray;
    private int head;
    private int tail;
    private int size;

    Queue() {
        queueArray = new Object[2];
        head = 0;
        tail = 1;
        size = 0;
    }

    // 배열 길이 조절
    public void resize(int newSize){
        Object[] newArray = new Object[newSize];
        for(int i =0; i< size+1; i++){
            newArray[i] = queueArray[(head+i) %queueArray.length];
        }
        queueArray = newArray;
        head = 0;
        tail = size;
    }

    // offer poll peek
    public boolean offer(Object o){
        if((tail+1)% queueArray.length == head){    // 배열이 꽉 찬 경우
            resize(queueArray.length*2);    // 2배 공간 확보
        }
        try{
            int last = (tail+1)%queueArray.length;  // 매번 자리 이동하지 않도록 순환 시키기
            queueArray[last] = o;
            tail = last;
            size++;
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public Object poll(){
        if(size == 0){
            return null;
        }
        head = (head+1)%queueArray.length;  // 헤드 다음 항목이 항상 첫번째로 들어간 요소
        Object o = queueArray[head];
        queueArray[head] = null;
        size--;
        if(size == queueArray.length/4) // 배열 길이의 1/4개로 줄어들면
            resize(queueArray.length/2);    // 1/2로 축소
        return o;
    }

    public Object peek(){
        if(size == 0){
            return null;
        }
        return queueArray[head+1];
    }

    /*
    public void test(){
        Arrays.stream(queueArray).forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.test();
        System.out.println("q.peek() = " + q.peek());
        q.poll();
        System.out.println("q.peek() = " + q.peek());
        q.test();
        q.offer(5);
        q.offer(6);
        q.test();
        System.out.println("q.peek() = " + q.peek());
        q.poll();
        q.poll();
        System.out.println("q.peek() = " + q.peek());
        q.test();
        q.offer(7);
        q.offer(8);
        q.test();
        q.offer(9);
        q.poll();
        q.poll();
        System.out.println("q.peek() = " + q.peek());
        q.test();
        q.offer(10);
        q.offer(10);
        q.offer(10);
        q.offer(10);
        q.offer(10);
        q.test();
    }
*/
}
