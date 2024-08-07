package shape;

// 최상위 부모 클래스 - 추상 클래스
// 도형 클래스
public abstract class Shape {

	// 추상 메서드
	public abstract void draw();
	
	public abstract String toString();
	
	// 비추상 메서드
	public void print() {
		System.out.println(toString());
		draw();
	}
}
