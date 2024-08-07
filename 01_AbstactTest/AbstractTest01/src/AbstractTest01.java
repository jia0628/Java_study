
/*
추상 클래스의 특징
1. 추상 메서드가 있으면 반드시 추상 클래스가 되어야 한다.
2. 추상 메서드가 없어도 추상 클래스는 될 수 있다.
3. 추상 클래스는 인스턴스를 생성할 수 없다.
*/

// 3개의 클래스 비교

// 문제점 발현: 추상 메서드가 있으므로 추상 클래스가 되어야 함.
class P {
	//public abstract void a(); // 추상 메서드 -> 에러 발생
	public void b() { }         // 비추상 메서드
}
 
// 문제 없음: 추상 메서드가 있으므로 추상 클래스로 선언함.
abstract class O {
	public abstract void a();  // 추상 메서드
	public void b() { }        // 비추상 메서드
}

// 문제 없음: 추상 메서드가 없어도 추상 클래스로 선언이 가능함.
abstract class R {
	public void a() { }        // 비추상 메서드
	public void b() { }        // 비추상 메서드
}

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
