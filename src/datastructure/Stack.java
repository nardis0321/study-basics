package datastructure;

import java.util.ArrayList;

public class Stack {
    /**
     * stack의 조건: FILO
     * size isEmpty
     * peak push pop
     * search(value) set(index, value)
     * 구현해보기
     */
    private ArrayList<Object> stackList;
    private int top;

    public Stack(){
        stackList = new ArrayList<>();
        top = -1;
    }

    // size isEmpty
    public int size(){
        return stackList.size();
    }

    public boolean isEmpty(){
        return top == -1;
    }

    // peak push pop
    public Object peak(){
        if(top<0){
            return null;
        }
        return stackList.get(top);
    }

    public void push(Object obj){
        stackList.add(obj);
        top += 1;
    }

    public Object pop(){
        if(top<0){
            return null;
        }

        Object obj = stackList.get(top);
        stackList.remove(top);
        top -= 1;
        return obj;
    }

    // search(value) set(index, value)
    public int search(Object obj){
        for(int i=0; i<stackList.size(); i++){
            if(stackList.get(i) == obj){
                return i;
            }
        }
        return -1;
    }

    public void set(int index, Object value){
        for(int i = index; i<stackList.size(); i++){
            Object temp = stackList.get(i);
            stackList.set(i, value);
            value = temp;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("st.peak() = " + st.peak());
        System.out.println("st.pop() = " + st.pop());
        System.out.println("st.pop() = " + st.pop());

        System.out.println("st.search(1) = " + st.search(1));
        st.set(1, 3);
        System.out.println("st.search(3) = " + st.search(3));

        /**
         * Insertion Deletion : O(1)연산
         * Access, Search : O(n) 연산
         * 선입후출의 꺼내기만 주로 하는 경우 유리하다
         */
    }

}
