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
        분해1 한 리스트에서 하나씩 빼서 다른 리스트에 끼워넣기
        조합1 a.add(위치가 문제야!, b.poll);
        문제  위치 찾는 코드가 복잡하다 ㅠㅠ 이럴 바에야 for문을 사용!

        분해2 만약 분해를 둘다 한다면?
        조합2 앞에서부터 순서대로 비교해서 제일 작은 것부터 뒤에 붙여나가기
        문제  stack overflow. b에 제일 큰 수가 남아 merge된 a가 영원히 도는 현상

        => 좀처럼 해결되지 않아 찾아보니... 자바에서는 LinkedList가 아니라 이 문제를 해결하기 위한 ListNode를 정의해서 사용해야만 재귀 가능한 문제였다.
         */
        if(b.isEmpty())
            return a;
        if(a.isEmpty())
            return b;

        if(a.peek() < b.peek()){
            a.addLast(a.poll());
        } else {
            a.addLast(b.poll());
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
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
        list2.add(3);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(5);
        merge(list1, list2);
        System.out.println("list1 = " + list1);

    }
}