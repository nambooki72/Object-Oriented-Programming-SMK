import java.util.*;

public class ExamStudyManager {
    public static void main(String[] args) {

        // 1. HashSet: 중복 없는 "핵심 키워드" 정리
        Set<String> keywords = new HashSet<>();
        keywords.add("다형성");
        keywords.add("캡슐화");
        keywords.add("다형성"); // 중복 삽입 시도 (무시됨)

        // 2. HashMap: 과목별 공부 시간 기록 (Subject -> Integer)
        Map<Subject, Integer> studyLog = new HashMap<>();
        studyLog.put(Subject.OOP, 5);        // OOP 5시간 공부
        studyLog.put(Subject.ALGORITHM, 3);

        // 3. StringBuffer: 최종 공부 리포트 생성 (가변 문자열 활용)
        StringBuffer report = new StringBuffer("--- 중간고사 공부 리포트 ---\n");

        // 4. Iterator: 공부 로그 전체 출력
        Iterator<Subject> keys = studyLog.keySet().iterator();
        while (keys.hasNext()) {
            Subject sub = keys.next();
            report.append("과목: ").append(sub)
                  .append(" | 시간: ").append(studyLog.get(sub))
                  .append("시간\n");
        }

        // 5. Math & Wrapper: 시험 운(?) 점수 계산
        int luckyScore = (int)(Math.random() * 100); // 0~99 난수 발생
        report.append("\n중간고사 시험 운세 점수: ")
              .append(luckyScore)
              .append("점");

        System.out.println(report.toString());

        // 6. StringTokenizer: 키워드 문자열 분리 실습
        String rawKeywords = "상속,다형성,추상클래스,인터페이스";
        StringTokenizer st = new StringTokenizer(rawKeywords, ",");
        System.out.println("\n[분리된 핵심 키워드 목록]");
        while (st.hasMoreTokens()) {
            System.out.println("> " + st.nextToken());
        }
    }
}

enum Subject {
    OOP, GRAPHICS, ALGORITHM, OS;
}

//getter와 setter 중요하니 복습하자
//이중 for문 삼중 for문
//기본 생성자 형태 위치 주의
//형변환도 중요하다 이건 기본이다
//extends랑 implements를 잘 기억하자 실습때 햇엇단다
//업캐스팅 다운캐스팅 일종의 형변환이다 잘 기억하자
//오버라이딩 굉장히 중요하다 조심하자 별표 50만개
//scanner 와 system.in 등은 중간고사에서는 별로 안중요하겟지만 기말에서는 중요해질듯

/* 7장에 해쉬 셋 집합, 집합이니까 중복은 무시한다
 * 순환이라는 의미의 이터레이터
 * 반복자. 순차적으로 하나씩 꺼내서 원하는 입맛에 맞게 활용하기 위한 기능
 * 0부터 99까지 난수생성 랜덤 변수 1부터 100이 아니라 0부터 99니까 1부터 100까지 하니까 +1 하자
 * 임포트도 중요 *별표가 전체를 의미, 임포트 자바 유틸 * 감점 주의하라
 * 
 * 최상위 클래스 오브젝트 매우 중요
 * 투스트링이라는 메소드가 중요
 * 오버라이딩을 해줘야지 제 입맛대로 바꿔서 재사용 가능
 * 지난번에 동국 스튜던트 실습 6주차에서 투스트링이라는 메소드 추가 오버라이딩
 * 
 * 스튜던트 매니저 실습에서 add를 이용해서 점수 바꾸는 것 정도는 알아야한다
 * 어레이리스트 최고점수 평균점수 알아내는 알고리즘, 누가 최고점수인지도 이름 string도 뽑아내보자
 * 중간고사는 실습 파일들 기반으로 이론 교안 + 실습 교안도 잘 참고해야한다
 *  */


 