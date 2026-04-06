
public class AttackSystem {
	public static void main(String[] args) {
		Student s1 = new Student("임다영", 12485007);
		
		//공격 1:외부에서 직접 수정 시도
		//s1.gpa = 4.5;
		
		//공격 2 : 잘못된 데이터 입력 시도
		s1.setGpa(9.9);
	}
}
