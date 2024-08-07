package point;

// 클래스 Point3D는 클래스 Point2D를 확장한다.
// 클래스 Point3D는 클래스 Point2D의 모든 자산을 상속 받는다.

// 물려 받는 자산: 멤버 변수, 멤버 메서드를 포함, 초기자와 생성자는 포함하지 않음 
public class Point3D extends Point2D {  //● 자식이 부모로부터 상속을 받겠다.(주체가 자식이 된다)
	private int z;
	
	// 생성자
	// super(): 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 것
	//● 자식 생성자에서만 super사용 가능(부모 생성자와 연결되는 통로)
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// getter
	public int getZ() {
		return z;
	}
	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// 출력 toString() -> Object 메서드
	// 오버라이딩이 되고 있는 장면 -> ● 부모보다 동등하거나 약한 제어자를 사용.
	@Override
	public String toString() {
		//return String.format("x=%d, y=%d, z=%d", getX(), getY(), z);
		
		// 부모 클래스의 메서드를 호출
		//● 출력을 super.를 이용하여 부모꺼를 쓸 수 있다
		return super.toString() + ", z=" + z;
	}
	
	
	
}
