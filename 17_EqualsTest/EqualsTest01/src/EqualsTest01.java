
class Point {
	// 인스턴스 변수
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
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
	
	//★★★★★ 중요: 클래스를 만들어 사용할 때는 반드시 Object 클래스 equals()를 값을 통해 비교하도록 오버라이딩 해야한다
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		}
		return false; // else 생략
	}
	
	// 출력 메서드
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}

public class EqualsTest01 {
	public static void main(String[] args) {
		// 두 개의 클래스를 비교
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = new Point(30, 40);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println("-------");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
	}
}
