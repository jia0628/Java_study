
//import java.lang.Object;

// 기본(부모) 클래스
class Base /*extends Object*/ {
	// 인스턴스 변수
	protected int x;
	
	// 생성자 -> 생성자 오버로딩 
	public Base() {
		this.x = x;
	}
	
	
	public Base(int x) {
		this.x = x;
	}
	
	// 출력 메서드
	public void print() {
		System.out.println("Base's x = " + x);
	}
}

// 파생(자식) 클래스
class Derived extends Base {
	//● 인스턴스 변수 -> 부모꺼와 다른 x
	private int x;
	
	
//	public Derived() {
//		super();
//	}
	
	//● 생성자 -> super.로 protected인 부모 멤버변수에 접근한다.
	public Derived(int x1, int x2) {
		//super(x1);
		super.x = x1;
		this.x = x2;
	}
	
	// 오버라이딩
	@Override
	public void print() {
		super.print(); //● 부모꺼의 print를 한번 찍고 자신을 찍는다.
		System.out.println("Derived's x = " + x);
	}
	
}

public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();
		
		Derived b = new Derived(20, 30);
		b.print();
		System.out.println();
		
	}

}
