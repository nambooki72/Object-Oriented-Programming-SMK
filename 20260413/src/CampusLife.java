
public class CampusLife {
	public static void main(String[] args) {
		//1. 업 캐스팅 : 자식 개체를 부모 타입으로 관리
		//특정 학생을 일단 '동국대 학생'이라는 보편적인 범주로 참조
		DonggukStudent ds = new Student("고윤정");
		
		System.out.println("=== 1. 업 캐스팅 상태 (학습 모드) ===");
		//부모(DonggukStudent)가 정의한 본질적인 기능은 바로 사용 가능
		ds.study();
		
		//ds.giveChuru();
		//에러 발생 -> 부모 타입 변수로는 자식의 고유 기능(인터페이스 능력)을 참조할 수 없으므로
		//다운캐스팅을 아래에서 해야한다고 조교님이 설명하셧는데 복습 필요
		
		System.out.println("\n === 2. 객체 확인 및 다운 캐스팅 (집사 모드) ===");
		//2. 다운 캐스팅 : 부모 타입을 다시 자식 타입으로 변환
		//안전을 위해 instanceof로 먼저 확인
		if (ds instanceof Student) {
			//명시적 형 변환을 통해 '집사'의 능력을 복원
			Student realStudent = (Student) ds;
			realStudent.giveChuru(); //이제 고유 기능인 츄르 주기가 가능
			//자식에서 implements를 해둔 것을 donggukstudent로 올리는 것이 다운캐스팅
		}
	}
}
