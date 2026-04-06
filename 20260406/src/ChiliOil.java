//인스턴스화가 참 중요하다~
//getter와 setter : 캡슐화를 통해서 보안을 용이하게 하고 중요한 정보를 숨긴다
//실습 2번에서 캡슐화가 게터 세터를 설명한다
//this 문법은 이해 못햇을 거라고 하면서 설명
//
public class ChiliOil {
	public String flavor = "매운맛";
	public int spiciness = 10; //맵기 정도
	
	public void sizzle() {
		System.out.println("(고추기름 향 보글보글)");
	}
}
