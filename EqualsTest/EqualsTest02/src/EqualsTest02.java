
// 문제) 아래의 작업 지시 사항을 준수하여 프로그래밍하시오.
// 1. Member 클래스를 완성하시오.
// 2. Member 클래스의 인스턴스 3개를 작성하여 비교하시오.

class Member {
	// 인스턴스 변수
	private String name;
	private int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			//return this.name == m.name && this.age == m.age;  // name은 문자열이라 ==로 사용하면 안된다
			return this.name.equals(m.name)&& this.age == m.age;
		}
		return false;
	}
}

public class EqualsTest02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Member m1 = new Member("이지아", 25);
		Member m2 = new Member("이지아", 25);
		Member m3 = new Member("박수빈", 25);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m2.equals(m3));
		
	}
}
