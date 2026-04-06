
public class LotusLantern {
	public String color; //연등 색상
	public String shape; //연등 모양
	public String wish; //적힌 소원
	
	//기본 색상과 모양만 정하는 생성기
	public LotusLantern(String color, String shape) {
		//this()는 반드시 첫 줄에 와야 함
		this(color, shape, "연애하게 해주세요");
	}
	
	//모든 정보를 저장하는 생성자 (실제 초기화 담당)
	public LotusLantern(String color, String shape, String wish) {
		//this.필드명 = 매개변수명 으로 구분
		this.color = color;
		this.shape = shape;
		this.wish = wish;
	}
	
	public void lightUp() {
		System.out.printf("[%s %s 연등]이 빛납니다 반짝반짝~ 소원: \"%s\" %n", color, shape, wish);
	}
}
