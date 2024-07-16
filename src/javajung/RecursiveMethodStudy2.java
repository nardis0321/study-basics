package javajung;

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

    public static void main(String[] args) {
        // string test
        System.out.println("reverseString(\"hello\") = " + reverseString("hello"));
    }
}
