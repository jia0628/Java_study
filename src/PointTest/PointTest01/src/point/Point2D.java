package point;

public class Point2D {
	// 인스턴스 변수
	private int x;
	private int y;
	
	// 생성자
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 출력 toString() -> Object 메서드
	//● 오버라이딩 장면
	//● Object로 부터 toString메서드를 상속 받고 있기 때문에 public이 필요
	@Override
	public String toString() { 
		return String.format("x=%d, y=%d", x, y);
	}
	
	
}
