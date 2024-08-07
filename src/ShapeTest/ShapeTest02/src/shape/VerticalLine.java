package shape;

// 자식 클래스 - AbstractLine의 자식 클래스, Shape의 자손 클래스
// 수직선 클래스
public class VerticalLine extends AbstractLine {
	
	// 생성자
	public VerticalLine(int length) {
		super(length);
	}

	// 오버라이딩
	@Override
	public void draw() {
		for(int i=0; i<getLength(); i++) {
			System.out.println("■");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return String.format("VerticalLine (length: %d)", getLength());
	}
}
