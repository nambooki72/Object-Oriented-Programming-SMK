
public class Fibonacci {
	public static void main(String[] args) {
		
		int f1 = 1; //첫 번째 자리 값 1로 시작
		int s2 = 1; //두 번째 자리 값 1로 시작
		int t3 = 0; // 세 번째 자리 값 0으로 시작
		
		for (int i = 1; i<= 10000; i++)
		{
			//원하는 출력 1, 1, 2, 3, 5, 8, 13
			//힌트 break와 for, while 등을 적절히 이용해서 재귀함수 없이 구현해보자!
			//문제에서 3칸으로 나눈 의도가 있다!
			//카메라 카톡 갤러리 참고
			
			if (i==4 || i==6 || i==7 || i==9 || i==10 || i==11 || i==12){
				continue;
				}
			
			if(i==1) {
				System.out.print(i + " ");
				}
		
			if(i>13) {
				break;
				}
			
			System.out.print(i + " ");
			
		}
	}

}
