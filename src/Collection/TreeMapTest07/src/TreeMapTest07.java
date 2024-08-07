import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Member implements Comparable<Member> {
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
	
	// toString()
	@Override
	public String toString() {
		return String.format("%s (%s,%d)", id, name, age);
	}
	
	// age 오름차순 정렬
	// this와 매개변수를 비교할 때 this가 클때 양수, 작을때 음수, 같을때  0 -> 오름차순
	// 반대로하면 내림차순 정렬
	@Override
	public int compareTo(Member m) {
		if(this.age > m.age) return 1;       
		else if(this.age < m.age) return -1; 
		else return 0;
	}
	
}

/*
	문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
	1. Member를 키, 전화번호를 값으로 하는 TreeMap인 map을 완성하시오.
	2. 데이터를 7개 추가하여 TreeMap의 특징을 확인하시오.
	3. 키와 값의 중복을 확인하시오.
	4. 키에 해당하는 데이터를 삭제하시오.
	5. 4가지 출력 방법으로 출력하시오.
 */

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class TreeMapTest07 {
	public static void main(String[] args) {
		// 키: Member, 값: 전화번호
		TreeMap<Member, String> map = new TreeMap<>();
		
		// 데이터 추가
		map.put(new Member("111", "박준우", 30), "010-1111-1111");
		map.put(new Member("222", "유호진", 38), "010-2222-2222");
		map.put(new Member("333", "달시오크", 41), "010-3333-3333");
		map.put(new Member("444", "패트릭쿤", 43), "010-4444-4444");
		map.put(new Member("555", "한설희", 32), "010-5555-5555");
		map.put(new Member("666", "에덴", 39), "010-6666-6666");
		map.put(new Member("777", "DK", 42), "010-7777-7777");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		
		// 키의 중복 - compareTo()에서 비교한 멤버를 기준을 같은 키의 중복을 허용하지 않음
		// 키는 변경하지 않고, 값을 수정함
		map.put(new Member("111", "박준우", 30), "010-0000-0000");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		System.out.println();
		
		// 값의 중복 -> 허용 (추가)
		map.put(new Member("888", "에릭첸", 50), "010-7777-7777");
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		System.out.println();
		
		// 키의 삭제 - compareTo()에서 비교한 멤버 변수를 기준으로 같은 키의 삭제를 허용함. 
		System.out.println("----한설희 데이터 삭제----");
		map.remove(new Member("555", "한설희", 32));
		System.out.println(map);
		System.out.println("회원 수: " + map.size());
		System.out.println();
		
		// 출력 1
		System.out.println("----출력1----");
		Set<Member> key1 = map.keySet();
		Iterator<Member> it = key1.iterator();
		while(it.hasNext()) {
			Member member1 = it.next();
			String tel1 = map.get(member1);
			System.out.println(member1 + " : " + tel1);
		}
		System.out.println();
		
		// 출력 2
		System.out.println("----출력2----");
		Set<Map.Entry<Member, String>> key2 = map.entrySet();
		Iterator<Map.Entry<Member, String>> it2 = key2.iterator();
		while(it2.hasNext()) {
			Map.Entry<Member, String> entry = it2.next();
			Member member2 = entry.getKey();
			String tel2 = entry.getValue();
			System.out.println(member2 + " : " + tel2);
		}
		System.out.println();
		
		// 출력 3
		System.out.println("----출력3----");
		Set<Map.Entry<Member, String>> key3 = map.entrySet();
		for(Map.Entry<Member, String> entry : key3) {
			Member member3 = entry.getKey();
			String tel3 = entry.getValue();
			System.out.println(member3 + " : " + tel3);
		}
		System.out.println();
		
		// 출력 4
		System.out.println("----출력4----");
		map.forEach((x, y) -> {System.out.println(x + " : " + y);});
		System.out.println();
		
	}
}
