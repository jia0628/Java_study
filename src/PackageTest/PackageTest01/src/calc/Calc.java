package calc;

/*
< package의 명명법>
- 패키지명은 모두 소문자로 한다.(클래스명과 충동을 방지하기 위한 목적)
- 패키지명은 도메인 주소를 역으로 할 것을 권장한다.(유일한 패키지명을 만드는 방법이 됨), 안드로이드 또는 스프링 프로젝트에서는 필수로 정함
- ex) captain6.co.kr -> kr.co.captain6

< package 사용 목적 >
- 서로 관련이 있는 파일(클래스)을 모아 서 사용하는 목적
- 권한을 가진 사용자가 사용할 수 있도록 접근을 제한하는 목적

< package안의 클래스의 접근 제한 >
- public 에세스: 클래스 앞에 public을 쓰는 경우, 모든 곳에서 사용 가능한 클래스
- package(default) 에세스: 클래스 앞에 public을 쓰지 않는 경우, 같은 패키지 내에서만 사용 가능

< 클래스 안에 멤버에 대한 접근 제한, access modifier >
- private: 같은 클래스 안의 멤버에서만 사용 가능
- default: 같은 패키지 내에서만 사용 가능, 멤버(변수, 메서드) 앞에 아무것도 쓰지 않은 경우
- protected: 상속을 받은 클래스에서는 사용 가능, 같은 패키지 안에서도 사용 가능 => ● 패키지가 달라도 상속을 받았다면 사용 가능
- public: 모든 곳에서 사용 가능

< 접근 제어자의 사용 범위 >
- public > protected > default > private

 */

// 모든 곳에서 사용 가능한 클래스
//● class에서 public을 떼버리면 package에세스가 된다.
public class Calc {
	//● 보통 public class로 지정하고 안에 멤버들의 제어를 준다.
	
	// public 접근 제어 -> 모든 곳에서 사용 가능한 메서드
	public int add(int x, int y) {
		return x + y;
	}
	
	// default 접근 제어 -> 같은 패키지 안에서만 사용 가능한 메서드
	int subract(int x, int y) {
		return x - y;
	}
	
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	// private 접근 제어 -> 같은 클래스 안에서만 사용 가능한 메서드
	private int divide(int x, int y) {
		return x / y;
	}
	
}
