
public class DonggukFestival {
	public static void main(String[] args) {
		System.out.println("동국대학교 연등제 시즌입니다. \n");
		
		//1. 인자가 2개인 생성자 흐름 (내부적으로 this()를 통해 3개짜리 호출)
		LotusLantern lantern1 = new LotusLantern("빨간색", "연꽃 모임");
		
		//2. 인자가 3개인 생성자 호출 (직접 소원 기입)
		LotusLantern lantern2 = new LotusLantern("분홍색", "팔각 모양", "자바 중간고사 100점");
		
		//결과 확인
		lantern1.lightUp();
		lantern2.lightUp();
	}
}
