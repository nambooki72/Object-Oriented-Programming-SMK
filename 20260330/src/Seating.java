import java.util.Scanner;

public class Seating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 2차원 배열 선언, 생성, 초기화
        // "-"는 빈자리, 이름이 적힌 곳은 이미 주인이 있는 자리입니다.
        String[][] seats = {
            {"하영", "-", "지윤"},
            {"-", "나영", "-"},
            {"채영", "-", "지현"}
        };

        System.out.println("> 실습실 현재 좌석표 <");

        // 2. 현재 좌석 상태 출력 (중첩 반복문 활용)
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "] ");
            }
            System.out.println();
        }

        // 3. 자리 선택 및 친구 등록 (인덱스 참조 및 대입)
        System.out.println("어디에 앉을래요?");

        System.out.print("몇 번째 행일까요(0~2): ");
        int row = sc.nextInt();

        System.out.print("몇 번째 열일까요(0~2): ");
        int col = sc.nextInt();

        // 4. 빈자리 확인 로직 (교안 방식 유지)
        if (seats[row][col] == "-") {
            System.out.print("자신의 이름을 입력하세요: ");
            String name = sc.next();

            seats[row][col] = name; // 해당 인덱스에 값 저장

            System.out.println(name + "님의 자리가 배정되었습니다.");
        } else {
            System.out.println("이미 주인(" + seats[row][col] + ")이 있는 자리입니다!");
        }
    }
}