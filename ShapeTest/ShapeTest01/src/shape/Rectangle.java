package shape;

// 자식 클래스
public class Rectangle extends Shape {
	// 인스턴스 변수
	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 추상 클래스 2개 오버라이딩
	@Override
	public void draw() {
		for(int i=0; i<height; i++) {     //● 세로
			for(int j=0; j<width; j++) {  //● 가로
				System.out.print("□");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle (width: %d, height: %d)", width, height);
	}
	
	// getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	// setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
