
public class Running {
	public static void main(String[] args) {
		//1. 초기식
		int stamina = 100;
		
		do {
			//2. 조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문
			System.out.println("뛰는 중 (남은 체력 : " + stamina + ")");
			
			//3. 조건식의 결과를 변경하는 명령문
			stamina -= 20; //한바퀴 돌때마다 체력 20 소모
						
		} while (stamina >0); //while(조건식)
		
		System.out.println("체력이 바닥났습니다.");
		
	}

}
//실행 후 초기식의 값을 0으로 바꾼 후 재실행하기
//int stamina = 0;