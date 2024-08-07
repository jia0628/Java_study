package shape;

//● Shape의 자손, AbstractLine의 자식클래스 - 수직선
public class VerticalLine extends AbstractLine {
	
	// 생성자
	public VerticalLine(int length) {
		super(length);
	}
	
	// 오버라이딩 - shape의 추상 메서드 2개
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
