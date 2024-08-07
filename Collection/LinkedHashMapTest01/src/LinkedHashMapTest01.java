import java.util.LinkedHashMap;

class Member {
	private String id;
	private String name;
	private int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getId( ) {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// HashMap에서 중복키를 이용하지 않으면, hashCode(), equals() 메서드를 오버라이딩 해야한다.
	@Override
	public int hashCode() {
		// 아이디, 이름, 나이가 모두 같을 때
//		return (id+name+age).hashCode();
		// 아이만 같을 때
		return (id).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			// 아이디, 이름, 나이가 모두 같을 때
//			return this.id.equals(m.id) && this.name.equals(m.name) && this.age == m.age;
			// 아이디만 같을 때
			return this.id.equals(m.id);
		}
		return false;
	}
	
	// toString()
	@Override
	public String toString() {
		return String.format("%s(%s, %d)", id, name, age);
	}
	
}

public class LinkedHashMapTest01 {
	public static void main(String[] args) {
		// 키: 회원, 값: 전화번호
		LinkedHashMap<Member, String> map = new LinkedHashMap<>();
				
		// 데이터 추가
		map.put(new Member("12345", "박준우", 33), "010-1111-1111");
		map.put(new Member("46897", "유호진", 35), "010-2222-2222");
		map.put(new Member("65432", "달시오크", 40), "010-3333-3333");
		map.put(new Member("31264", "패트릭쿤", 39), "010-4444-4444");
		map.put(new Member("79542", "한설희", 31), "010-5555-5555");
		map.put(new Member("95642", "에덴", 42), "010-6666-6666");
		map.put(new Member("52345", "DK", 43), "010-7777-7777");
		
		// 확인 - 입력한 순서대로 출력함.
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		
		
		
	}
}
