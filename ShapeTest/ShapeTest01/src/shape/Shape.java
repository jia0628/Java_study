package shape;

// 추상 클래스 - 최상위 부모 클래스
// 도형 클래스
//● draw, toString의 구현부를 미리 정할 수 없어 추상클래스로 한다.
public abstract class Shape {
	
	// 추상 메서드
	public abstract void draw();       //● 여기선 안 그릴거다
	
	// 추상 메서드
	//● 비추상 메서드(Object)를 추상 메서드가 오버라이딩
	public abstract String toString(); //● 여기서도 특별한 자기 소개를 할 수 없다
	
	// 비추상 메서드, 일반 메서드
	public void print() {              //● 자식 클래스에 메서드를 다 넣을 필요 없이 여기서 한번만 호출하면 된다.
		System.out.println(toString()); 
		draw();
	}
}
