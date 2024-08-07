
class XY {
	// 클래스 변수, static field
	private static int count = 0;
	
	// 인스턴스 변수, non-static field
	private int x = 0;
	private int y = 0;
	private int id = 0;
	
	// 인스턴스 초기자(instance initializer), 인스턴스 블럭(instance block)
	// - 생성자에 들어가기 직전에 실행하는 것
	// - 용도: 모든 생성자에서 공통적으로 해야 할일을 명시적으로 적어둘 때 사용
	{
		id = ++count;
	}
	
	// 생성자
	// this.xxx : 모든 인스턴스 앞에 존재하고, 자신의 인스턴스 멤버를 참조할 때 사용하는 방법.
	// this() : 클래스의 생성자 안에서 다른 생성자를 호출할 때 사용(생성자 오버로딩)
	public XY() {
	}
	
	public XY(int x) {
		this.x = x;
	}
	
	public XY(int x, int y) {
		this(x);
		this.y = y;
	}
	
	// 복사 생성자
	public XY(XY d) {
		this(d.x, d.y);
	}
	
	// getter 부분
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	// setter 부분
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 출력 메서드
	public String toString() {
		return String.format("NO: %d, (%d, %d)", id, x, y);
	}
	
}

// 문제) XY 클래스의 인스턴스 4개를 종류별로 만들어 출력하시오.
// 일련번호의 id에는 자동으로 1씩 증가하도록 설계하시오.
public class XYTest01 {
	public static void main(String[] args) {
		//인스턴스
		XY p1 = new XY();
		XY p2 = new XY(20);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		// 출력
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
	}

}
