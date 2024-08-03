package javajung;

import java.util.*;
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

    }
}

