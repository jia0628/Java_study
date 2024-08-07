package member;

// 부모 클래스
public class Member {
	// 인스턴스 변수
	private String name;
	private String no;
	private int age;
	
	// 생성자
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력 방법 1번
	@Override
	public String toString() {
		return String.format("회원이름: %s, 회원번호: %s, 회원나이: %d", name, no, age);
	}
	
	// 출력 방법 2번
	public void showInfo() {
		System.out.printf("회원이름: %s, 회원번호: %s, 회원나이: %d", name, no, age);
		//System.out.println("회원이름: " + name);
		//System.out.println("회원번호: " + no);
		//System.out.println("회원나이: " + age);
	}
	
}
