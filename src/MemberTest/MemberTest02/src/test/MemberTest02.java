package test;

//import member.Member;
//import member.SpecialMember;
import member.*;

/*
문제) 아래의 작업 지시를 따라 프로그램을 작성하시오.
	1. 부모 클래스인 Member 클래스를 작성하시오.
		- 인스턴스 변수: name(회원이름), no(회원번호), age(회원나이)
		- 인스턴스 변수를 초기화하는 생성자 생성
		- 인스턴스 변수를 설정하고 변화하는 getter/setter 메서드 생성
		- 2가지 형태로 출력하는 출력 메서드 생성: toString(), showInfo()
		
	2. Member 클래스를 상속하는 자식 클래스 SpecialMember 클래스를 작성하시오.
		- 인스턴스 변수: privilege(특별혜택)
		- 인스턴스 변수를 초기화하는 생성사 생성
		- 인스턴스 변수를 설정하고 변화하는 getter/setter 메서드 생성
		- 2가지 형태의 출력 메서드는 오버라이딩하여 생성
		
	3. main 메서드에서 Member와  SpecialMember 클래스의 인스턴스를 각 2개씩 만들고,
	각 2가지의 출력 메서드를 활용하여 인스턴스의 정보를 확인하시오.
	
	4. 모든 멤버 변수는 private, 멤버 변수를 제외한 멤버는 public 접근 제어자를 사용하시오.
 */

public class MemberTest02 {
	public static void main(String[] args) {
		// 다형성 구현 1
		/*
		Member[] members = new Member[4];
		members[0] = new Member("하니", "123456", 23);
		members[1] = new Member("혜인", "789456", 21);
		members[2] = new SpecialMember("혜린", "654321", 22, "초대권 증정");
		members[3] = new SpecialMember("민지", "456123", 19, "20% 할인 쿠폰 증정");
		*/
		
		// 다형성 구현 2
		Member[] members = new Member[] {
				new Member("하니", "123456", 23),
				new Member("혜인", "789456", 21),
				new SpecialMember("혜린", "654321", 22, "초대권 증정"),
				new SpecialMember("민지", "456123", 19, "20% 할인 쿠폰 증정"),
		};
		
		// 반복문 활용 1 - 기본 for문
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].toString());
			//members[i].showInfo(); System.out.println();
		}
		System.out.println();
		
		// 반복문 활용 2 - 확장 for문(향상된 for문, for-in문)
		for(Member m : members) { //● for(타입 변수이름 : 배열이름), 변수이름은 꼭 i가 아니어도 된다.
			System.out.println(m);
		}
		
		// 다형성 구현을 하지 않고 각각 출력
		/*
		// 인스턴스 생성
		Member m1 = new Member("하니", "123456", 23);
		Member m2 = new Member("혜인","789456", 21);
		
		SpecialMember sm1 = new SpecialMember("혜린", "654321", 22, "초대권 증정");
		SpecialMember sm2 = new SpecialMember("민지", "456123", 19, "20% 할인 쿠폰 증정");
		
		// 출력
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(sm1);
		System.out.println(sm2);
		System.out.println("----------------------------------------------------------------");
		
		m1.showInfo(); System.out.println();
		m2.showInfo(); System.out.println();
		sm1.showInfo(); System.out.println();
		sm2.showInfo(); System.out.println();
		*/
		
	}
}
