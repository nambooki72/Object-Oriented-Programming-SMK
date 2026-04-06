
public class MapoTofu {
	String name = "매운 마파두부";
	ChiliOil oil;
	
	void cook(ChiliOil oil) {
		this.oil = oil;//동일한 고추기름 부품 사용
		System.out.print("[" + name + "] 제작 중 ...");
		oil.sizzle();
	}
}
