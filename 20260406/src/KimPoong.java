
public class KimPoong {
	public static void main(String[] args) {
		//1. 일단 고추기름 설계도로 실제 '고추기름 객체'를 하나 딱 하나 만들기(인스턴스화)
		ChiliOil mySecretOil = new ChiliOil();
		
		//2. 요리 시작
		Jjamppong jp = new Jjamppong();
		MapoTofu mt = new MapoTofu();
		
		System.out.println("김풍 작가의 '15분 요리' 시작합니다!\n");
		
		//3. 하나의 고추기름 객체를 여기저기 '조립'해서 사용함(재사용성)
		jp.cook(mySecretOil);
		mt.cook(mySecretOil);
		
		System.out.println("\n고추기름 하나로 모든 요리가 완성되었습니다!");
	}
}
