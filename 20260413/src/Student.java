//나의 본질은 동국대생이고, 집사 능력은 추가로 장착함
class Student extends DonggukStudent implements CatCare {
	Student(String name) { super(name); } //부모 생성자
	
	@Override
	void study() { System.out.println("공부 중...");} //본질 수행
	
	@Override
	public void giveChuru() { System.out.println("팔정도에 누워 있는 동국이에게 츄르를 줍니다.");}
	//추가 능력이지만 필수로 구현되어야 할 츄르 주기 메소드
}
