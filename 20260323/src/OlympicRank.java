
public class OlympicRank {
	public static void main(String[] args) {
		int gold=3;
		int silver=10;
		
		//연산자 우선순위
		boolean isQualified = gold + 2 << 1 > silver && silver % 3 == 1;
		
		System.out.println("진출 여부:" + isQualified);
		
	}

}
