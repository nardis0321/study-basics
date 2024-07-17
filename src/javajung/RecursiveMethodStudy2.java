package javajung;

import java.util.LinkedList;

public class RecursiveMethodStudy2 {

    // Reverse String
    // hello -> olleh 처럼 주어진 String을 뒤집기
    public static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
        /*
         1. 베이스 조건 : 전부 거꾸로 됐으면 끝나야 함
         2. 분해 : str의 맨 뒤 요소부터 꺼내서 없애고 붙이면 됨. 첫번째꺼 꺼내서 뒤에 붙이면? 됨.
         3. 조합 : rs(str) --> str-firstone + firstone 이러면 hel -> elh이러케
        str.substring(1, end) + str.charAt(0);
         */

    // Merge Linked Lists
    // 주어진 list1과 list2를 새 리스트를 만들지 않고 합쳐서 하나의 정렬된 리스트를 return
    public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b){
        /*
        베이스 조건 : 리스트 하나가 0이면 리턴하기
        분해 : 한 리스트에서 하나씩 빼서 다른 리스트에 끼워넣기
        조합 : a.add(위치가 문제야!, b.poll);

        위치를 FOR문 쓰는 방법밖에 생각 못하고 있음 -> 아마 더 간단히 가능! 더 생각해보자
         */
        if(b.isEmpty())
            return a;

        if(a.isEmpty())
            return b;

        if(b.peek() < a.getFirst()){
            a.addFirst(b.poll());
        } else if (a.getLast() < b.peek()){
            a.addLast(b.poll());
        } else {
            for(int i=0; i<a.size()-1; i++){
                if(a.get(i) <= b.peek() && b.peek() <= a.get(i+1)){
                    a.add(i+1, b.poll());
                    break;
                }
            }
        }
        System.out.println("a = " + a);

        return merge(a, b);
    }

    public static void main(String[] args) {
        // string test
        System.out.println("reverseString(\"hello\") = " + reverseString("hello"));

        // linked list merge test
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        merge(list1, list2);
        System.out.println("list1 = " + list1);

    }
}
