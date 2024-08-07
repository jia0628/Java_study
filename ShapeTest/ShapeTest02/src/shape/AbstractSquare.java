package shape;


// 자식 클래스 - Shape 클래스의 자식
// 부모 클래스 - Rectangle, Parallelogram의 부모 클래스
// 인스턴스를 안만들거라 추상클래스로 - Shape의 추상 메서드인 draw()와 toString()을 오버라이딩 하지 않음.
// - Plane2D 인터 페이스의 추상 메서드인 getArea() 오버라이딩하지 않음. ●왜? 오버라이딩 하지 않으려고 추상클래스로 만들었기 때문
public abstract class AbstractSquare extends Shape implements Plane2D {
	// 인스턴스 변수
	private int width;
	private int height;
	
	// 생성자
	public AbstractSquare(int width, int height) {
		this.width = width;
		this.height = height;
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
	
	//● Plane2D 추상메서드 오버라이딩은 하지 않지만
	// 자식들 클래스에 중복으로 들어가니까 부모에게 미리 만들어놓겠다
	@Override
	public int getArea() {
		return width*height;
	}

	
}
