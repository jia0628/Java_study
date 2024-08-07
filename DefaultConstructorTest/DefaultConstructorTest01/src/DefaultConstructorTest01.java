import java.lang.Object;  //● 생략된 Object의 import부분
//● 상속의 주체가 자식이다
//● 형제 관계가 없다
//● 다중상속은 없다

// 부모 클래스
class A extends Object{ //● calss A의 원래 모습
	private int a;
	
	public A() {
		//● 부모 클래스도 super로 그 위에 최상위 Object 클래스의 생성자를 호출한다.
		super();
		a = 50;
	}
	
	public int getA() {
		return a;
	}
	
}
// 자식 클래스
class B extends A {
	//● 디폴트 생성자의 원래 모습(super가 생략되어 있다. 즉 당연하게 부모 생성자를 호출한다.)
	public B() {
		super();
	}
}

public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
	}
}
