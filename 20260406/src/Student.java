
public class Student {
	//1. 필드는 외부에서 직접 수정이 불가능하도록 private으로 선언
	private String name;
	private int studentID;
	public double gpa; //학점 (0.0~4.5)
	
	//2. 생성자
	public Student(String name, int studentID)
	{
		this.name = name;
		this.studentID = studentID;
	}
	
	//3. getter : 외부에서 안전하게 읽기만 가능
	public String getName() { return name; }
	public int getStudentID() { return studentID; }
	public double getGpa() { return gpa; }
	
	//4. setter : 데이터 검증 로직 포함
	public void setGpa(double gpa) {
		//0.0 미만익나 4.5 초과하는 학점은 저장을 거부함
		if (gpa < 0.0 || gpa > 4.5)
		{
			System.err.println("잘못된 학점 입력입니다. (입력값: " + gpa + ")");
			return; //메소드 종료 (값 저장 안됨)
		}
		this.gpa = gpa; //유효한 경우에만 필드에 저장
	}
}
