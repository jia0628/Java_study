package shape;

// 자식 클래스
// 점 클래스
public class Point extends Shape {
	// 디폴트 생성자
	public Point() {
		
	}
	
	// 오버라이딩
	@Override
	public void draw() {
		System.out.println("●");
	}
	
	@Override
	public String toString() {
		return "Point";
	}
}
