package shape;

//자식 클래스 - AbstractSquare 클래스의 자식
// 직사각형 클래스
public class Rectangle extends AbstractSquare {
	// 생성자
	public Rectangle(int width, int height) {
		super(width, height);
	}

	// 오버라이딩
	@Override
	public void draw() {
		for(int i=0; i<getHeight(); i++) {
			for(int j=0; j<getWidth(); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle (width: %d, height: %d)", getWidth(), getHeight());
	}

	
}
