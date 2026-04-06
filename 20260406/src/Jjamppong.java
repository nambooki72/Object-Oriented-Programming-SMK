
public class Jjamppong {
	String name = "매운 짬뽕";
	ChiliOil oil; //고추기름 부품을 담을 공간
	
	void cook(ChiliOil oil) {
		this.oil = oil; //전달받은 고추기름 조립
		System.out.print("[" + name + "] 제작 중 ... ");
		oil.sizzle();
	}
}
