package javajung;

import java.util.*;
import java.util.stream.Stream;
// 자바에서는 메서드는 객체 안에 있어야 한다
// 람다는 간결한 메서드

// 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스
@FunctionalInterface    // 단 하나의 추상 메서드만 가질 수 있도록 컴파일러가 체크
interface MaxFunction{ public abstract int max(int a, int b);}
interface PrintValFuntion{ public abstract void printVal(String name, int i);}
interface SquareFunction{ public abstract int square(int i);}
interface RollDiceFunction{ public abstract int rollDice();}
interface SumArrFunction{ public abstract int sumArr(int[] arr);}
interface EmptyArrFunction{ public abstract int[] emptyArr();}

public class LambdaStudy1 {
    public static void main(String[] args) {
        MaxFunction f1 = (a, b) -> a > b? a:b;
        f1 = (a, b) -> Math.max(a, b);
        f1 = Math::max;
        f1.max(3, 6);

        PrintValFuntion f2 = (name, i) -> System.out.println(name+"="+i);
        f2.printVal("루이스 해밀턴",44);

        SquareFunction f3 = x -> x*x;
        f3.square(3);

        RollDiceFunction f4 = ()-> (int) (Math.random()*6);
        f4.rollDice();

        SumArrFunction f5 = (arr) -> {
            int sum = 0;
            for(int i : arr)
                sum += i;
            return sum;
        };
        f5 = arr -> Arrays.stream(arr).sum();
        f5.sumArr(new int[]{2, 2, 2});

        EmptyArrFunction f6 = () -> new int[]{};
        f6.emptyArr();

        //14-4 배열의 문자열 길이 모두 더하기
        String[] strArr = {"aaa", "bb", "c", "Dddd"};
        Arrays.stream(strArr).map(String::length).forEach(System.out::println); // 3 2 1 4
        Arrays.stream(strArr).mapToInt(String::length).forEach(System.out::println); // 3 2 1 4
        Arrays.stream(strArr).mapToInt(String::length).sum(); //10
        // map만 한 결과는 Stream이고 IntStream이 아니어서 sum 불가

        Arrays.stream(strArr).map(String::length).count();  // 4
        Arrays.stream(strArr).mapToInt(String::length).count(); // 4
        Arrays.stream(strArr).count(); //4

        Stream<String> strStream = Stream.of(strArr);
//        strStream.mapToInt(s -> s.length()).sum();    스트림은 일회용
        strStream.mapToInt(String::length).sum();
        Stream<String> strStream2 = Stream.of(strArr);
        strStream2.mapToInt(s -> s.length()).sum(); // 다시 생성해야 다시 사용 가능하다!!

        //14-5 가장 긴 문자열의 길이
        OptionalInt maxLengthOfStrArr = Arrays.stream(strArr).mapToInt(String::length).max();
        System.out.println(maxLengthOfStrArr.getAsInt());

        // sort 사용하기
        Optional<Integer> theLongest = Arrays.stream(strArr).map(String::length).sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("theLongest.get() = " + theLongest.get());
        // mapToInt 후 sorted(Comparator.reverseOrder())가 안 되는 이유?
        // Expected 0 arguments but found 1 -- mapToInt의 sorted()에는 argument를 쓸 수 없다
        // map과 mapToInt의 차이! 반환타입? map의 반환타입은 Stream<R>, mapToInt의 반환타입은 IntStream
        // Stream<R>은 Comparator로 sort할 수 있고 IntStream은 Comparator로 sort 할 수 없는 이유 : 객체타입 스트림은 참조형, 원시타입 스트림은 기본형!

        // 또 다른 방법
        Stream<String> strStream3 = Stream.of(strArr);
        strStream3.mapToInt(String::length).sorted().limit(1).forEach(System.out::println);

        // 가장 긴 문자열 자체를 출력하기
        System.out.println("Arrays.stream(strArr).max(Comparator.comparingInt(String::length)).get() = "
                + Arrays.stream(strArr).max(Comparator.comparingInt(String::length)).get());
        Arrays.stream(strArr).sorted(Comparator.comparingInt(String::length).reversed()).limit(1).forEach(System.out::println);

        // 14-6. 임의의 로또 번호 정렬 출력
        new Random().ints(1, 46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);

    }
}

