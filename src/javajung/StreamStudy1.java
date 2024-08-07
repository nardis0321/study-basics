package javajung;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.*;

// 14-8. 불합격(150점 미만)한 학생의 수를 남/녀로 구별하여 출력
// 14-9. 반별 총점을 학년 별로 나누어 출력

class Student {
    String name;
    boolean isMale; // 성별
    int hak; // 학년
    int ban; // 반
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHak() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ?
                "남" : "여", hak, ban, score);
    }

    // groupingBy()에서 사용
    enum Level {HIGH, MID, LOW} //성적을상,중,하세단계로분류
}

class Exercise14_8 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("나자바", true, 1, 1, 300),
                new Student("김지미", false, 1, 1, 250),
                new Student("김자바", true, 1, 1, 200),
                new Student("이지미", false, 1, 2, 150),
                new Student("남자바", true, 1, 2, 100),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("이자바", true, 1, 3, 200),
                new Student("나자바", true, 2, 1, 300),
                new Student("김지미", false, 2, 1, 250),
                new Student("김자바", true, 2, 1, 200),
                new Student("이지미", false, 2, 2, 150),
                new Student("남자바", true, 2, 2, 100),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
                new Student("이자바", true, 2, 3, 200)
        };

        // 불합격(150점 미만)한 학생의 수를 남/녀로 구별하여 출력 -------
        Map<Boolean, Map<Boolean, Long>> failedStuBySex =
                Arrays.stream(stuArr)
                        .collect(
                                partitioningBy(
                                        javajung.Student::isMale,
                                        partitioningBy(stu -> stu.getScore() < 150, counting())
                                )
                        );
        // -----------------------------------------------------
        // 남자 true 여자 false
        //      불합격true 합격 false
        //       fianl value long : 명수
        long failedMaleStuNum = failedStuBySex.get(true).get(true);
        long failedFemaleStuNum = failedStuBySex.get(false).get(true);
        System.out.println("불합격[남자]:" + failedMaleStuNum + "명");
        System.out.println("불합격[여자]:" + failedFemaleStuNum + "명");


        // 반별 총점을 학년별로 나누어 출력--------------------------------
        Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan =
        Arrays.stream(stuArr)
                .collect(
                    groupingBy(
                            Student::getHak,
                            groupingBy(
                                    Student::getBan,
                                    summingLong(Student::getScore)
                            )
                    )
                );
        //------------------------------------------------------------

        for(Object e : totalScoreByHakAndBan.entrySet()){
            System.out.println(e);
        }


    }
}

