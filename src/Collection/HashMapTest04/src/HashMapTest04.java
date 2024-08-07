import java.util.HashMap;

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
/*
	< HashMap과 Hashtable의 관계 >
	1. 기본 사용법은 완전 동일
	2. Hashtable: 멀티 쓰레드를 지원하고, 쓰레드의 동기화를 지원함. 문제점: 쓰레드의 동기화를 사용하지 않을 때는 성능의 저하가 발생
	   HashMap  : 멀티 쓰레드와 쓰레드의 동기화를 제거하여 성능 향상시킴. 일번적인 경우는 HashMap을 사용.
	   
	< HashMap과 LinkedHashMap의 관계 >
	1. 기본 사용법은 완전 동일
	2. HashMap       : 순서가 없음(입력한대로 출력되지 않음)
	   LinkedHashMap : 순서가 있음(입력한대로 출력됨)

 */

public class HashMapTest04 {
	public static void main(String[] args) {
		// 키: 회원, 값: 전화번호
		HashMap<Member, String> map = new HashMap<>();
		
		// 데이터 추가
		map.put(new Member("12345", "박준우", 33), "010-1111-1111");
		map.put(new Member("46897", "유호진", 35), "010-2222-2222");
		map.put(new Member("65432", "달시오크", 40), "010-3333-3333");
		map.put(new Member("31264", "패트릭쿤", 39), "010-4444-4444");
		map.put(new Member("79542", "한설희", 31), "010-5555-5555");
		map.put(new Member("95642", "에덴", 42), "010-6666-6666");
		map.put(new Member("52345", "DK", 43), "010-7777-7777");
		
		// 확인
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		// 중복 키 - 아이디가 동일 -> 추가
		System.out.println("-중복1 : 아이디가 동일");
		map.put(new Member("79542", "김현준", 41), "010-1234-1234");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		// 중복 키 - 이름이 동일 -> 추가
		System.out.println("-중복2 : 이름이 동일");
		map.put(new Member("34569", "유호진", 45), "010-2468-6575");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		// 중복 키 - 나이가 동일 -> 추가
		System.out.println("-중복3 : 나이가 동일");
		map.put(new Member("34567", "에리치엔", 33), "010-9874-5876");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		// 중복 키 - 아이디, 이름, 나이가 모두 동일
		System.out.println("-중복4 : 아이디, 이름, 나이가 모두 동일");
		map.put(new Member("12345", "박준우", 33), "010-1111-1111");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
				
	}
}
