package shape;

// 자식 클래스 - AbstractSquare 클래스의 자식
// 평행사변형 클래스
public class Parallelogram extends AbstractSquare {
	// 생성자
	public Parallelogram(int width, int height) {
		super(width, height);
	}

	// 오버라이딩
	@Override
	public void draw() {
		for(int i=1; i<=getHeight(); i++) {
			for(int j=1; j<=getHeight()-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return String.format("Parallelogram (width: %d, height: %d)", getWidth(), getHeight());
	}
	
	
}
