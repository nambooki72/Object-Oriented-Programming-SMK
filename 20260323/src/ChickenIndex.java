
public class ChickenIndex {
	public static void main(String[] args) {
		//1. 필드 구성
		int goldPrice = 226340;
		double goldWeight = 500.5;
		int chickenPrice = 25000;
		
		//2. 금메달 가치산출
		double GoldValue = goldWeight * goldPrice;
		
		//3. 치킨 수 계산
		double chickenCountDouble = GoldValue / chickenPrice;
		
		//4. 명시적 형 변환
		int finalChickenCount = (int) chickenCountDouble;
		
		//5. 결과 출력
		System.out.printf("금메달을 팔면 치킨 [%d]마리를 주문할 수 있습니다. \n", finalChickenCount);
		
	}

}
