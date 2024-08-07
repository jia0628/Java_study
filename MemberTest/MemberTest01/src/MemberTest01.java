
// 문제) 회원 클래스를 만들고, 인스턴스 3개를생성하여 멤버변수의 값을 출력하시오.
// 접근 제어자를 사용하시오.
// 클래스: Member
// 멤버변수: 이름(name), 회원번호(no), 나이(age)
// 생성자, getter/setter, 멤버 출력 메소드

class Member {
	// 멤버변수
	//● 기본 원칙: 멤버변수는 외부로부터 감춘다. (예외가 있긴 있음)
	private String name;
	private String no;
	private int age;
	
	// 생성자 부분
	//● 인스턴스를 만들자마자 확실한 초기화
	public Member(String name, String no, int age) {
		//● 멤버변수 = 매개변수;
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// setter 부분 - 값을 획득
	//● 값을 넣는거라 리턴값이 필요없다.
	public void setName(String name) { //● set멤버변수명(매개변수값 )
		this.name = name;              //● 매개변수의 값을 받아서 멤버변수로 넘김
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter 부분 - 값을 리턴(리턴하는거니까 매개변수가 필요없다)
	public String getName() { //● 매개변수 값에서
		return name;          //● 리턴은 멤버변수 값로
	}
	public String getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	
	// 멤버 출력 메서드 정의 1번
	//● 값을 넣기만 하는거라 리턴값이 필요없다.
	public void printMember() {  //● 매개변수 없이 정의, 메소드명은 임의로 지(print, show, put...)
		System.out.println("※ 회원 클래스 정보 ※ ");
		//● 같은 클래스 안에서는 +멤버변수를 끌고온다.
		System.out.printf("회원명: %s / 번호: %s / 나이: %d\n", name, no, age);
		System.out.println();
		System.out.println("---------------");
		System.out.println();
	}
	
	// 멤버 출력 메서드 정의 2번
	public String toString() {
		//return "회원명: " + name + ", 번호: " + no + ", 나이: " + age;
		return String.format("회원명: %s,  번호: %s,  나이: %d", name, no, age);
	}
	
	
	
}

public class MemberTest01 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Member member1 = new Member("하니", "001", 20);
		Member member2 = new Member("혜인", "002", 19);
		Member member3 = new Member("민지", "003", 21);
		
		// 출력
		/*
		System.out.println("※ 회원 클래스 정보 ※ ");
		System.out.println("회원 이름: " + member1.getName());
		System.out.println("회원 번호: " + member1.getNo());
		System.out.println("회원 나이: " + member1.getAge());
		System.out.println();
		
		System.out.println("회원 이름: " + member2.getName());
		System.out.println("회원 번호: " + member2.getNo());
		System.out.println("회원 나이: " + member2.getAge());
		System.out.println();
		
		System.out.println("회원 이름: " + member3.getName());
		System.out.println("회원 번호: " + member3.getNo());
		System.out.println("회원 나이: " + member3.getAge());
		*/
		
		// 멤버 출력 메소드 호출 1번
		//● 참조변수이름.메소드명();
		/*
		member1.printMember();
		member2.printMember();
		member3.printMember();
		*/
		
		// 멤버 출력 메소드 호출 2번
		System.out.println(member1.toString()); //● .toString을 생략할 수 있지만 쓰는게 좋음
		System.out.println(member2);
		System.out.println(member3);
	}

}
