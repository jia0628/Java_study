package shape;

//● Shape의 자식,  수평선 & 수직선의 부모
public abstract class AbstractLine extends Shape { //● 그 다음 자식들에게 Shape의 메서드를 오버라이딩할 강제성을 부여.
	// 인스턴스 변수
	private int length;
	
	// 생성자
	public AbstractLine(int length) {
		this.length = length;
	}
	
	// getter
	public int getLength() {
		return length;
	}
	
	// setter
	public void setLength(int length) {
		this.length = length;
	}
}
