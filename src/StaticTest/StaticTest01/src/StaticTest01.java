
/*
클래스 메서드에서는 클래스 변수, 클래스 메서드는 사용 가능하지만, 인스턴스 변수, 인스턴스 메서드는 사용 불가
인스턴스 메서드에서는 클래스 변수, 클래스 메서드, 인스턴스 변수, 인스턴스 메서드 모두 사용 가능
 */

class Static {
	private static int s; // 클래스 변수
	private int i;        // 인스턴스 변수
	
	public static void sm1() { } // 클래스 메서드 1
	public void im1() { }        // 인스턴스 메서드 1
		
	//● 클래스 메서드에선 인스턴스 변수, 메서드가 접근 불가
	public static void sm2(int x) {   // 클래스 메서드 2
		s = x;
		//i = x; // 클래스 메서드에서는 인스턴스 변수에 접근 불가
		sm1();
		//im1(); // 클래스 메서드에서는 인스턴스 메서드에 접근 불가
	}
	
	//● 인스턴스 메서드는 다 접근 가능
	public void im2(int x) {          // 인스턴스 메서드 2
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	// getter
	public static int getS() {
		return s;
	}
	public int getI() {
		return i;
	}
	
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(30);
		
		System.out.println("s1의 i: " + s1.getI());
		System.out.println("s2의 i: " + s2.getI());
		System.out.println("s3의 i: " + s3.getI());
		
		System.out.println("Static의 s: " + Static.getS());
		
	}
}
