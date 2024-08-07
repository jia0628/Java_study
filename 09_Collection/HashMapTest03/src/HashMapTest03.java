import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
	
	// toString()
	@Override
	public String toString() {
		return String.format("%s(%s, %d)", id, name, age);
	}
	
}

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class HashMapTest03 {
	public static void main(String[] args) {
		// 키: 전화번호, 값: 회원
		HashMap<String, Member> map = new HashMap<>();
		
		// 데이터 추가
		map.put("010-1111-1111", new Member("12345", "박준우", 33));
		map.put("010-2222-2222", new Member("46897", "유호진", 35));
		map.put("010-3333-3333", new Member("65432", "달시오크", 40));
		map.put("010-4444-4444", new Member("31264", "패트릭쿤", 39));
		map.put("010-5555-5555", new Member("79542", "한설희", 31));
		map.put("010-6666-6666", new Member("95642", "에덴", 42));
		map.put("010-7777-7777", new Member("52345", "DK", 43));
		
		// 존재하지 않는 데이터 추가 -> null을 리턴
		System.out.println(map.put("010-8888-8888", new Member("13456", "이라엘", 32)));
		System.out.println(map);
		System.out.println("회원수 : " + map.size());
		
		// 존재하는 데이터 추가 -> 값을 수정 -> 이전 값을 리턴
		System.out.println(map.put("010-3333-3333", new Member("13456", "에릭지엔", 35)));
		System.out.println(map);
		System.out.println("회원수 : " + map.size());
		
		// 중복 키를 허용하지 않음 -> 값을 수정
		// 010-5555-5555 키를 가진 회원의 회원번호를 11111, 나이를 39로 수정
		
		// 데이터의 값의 추가와 수정
		// 키가 없을 때는 null, 키가 있을 때는 키에 대한 값을 리턴
		Member m = map.get("010-5555-5555");
		if(m == null) {
			System.out.println("입력한 전화번호는 없는 데이터입니다.");
		} else {
			String name = m.getName();
			map.put("010-5555-5555", new Member("11111", name, 39));
		}
		System.out.println(map);
		System.out.println("회원수 : " + map.size());
		
		// 데이터의 삭제
		// 010-8888-8888 키에 대한 데이터를 삭제
		if(map.remove("010-8888-8888") == null) {
			System.out.println("입력한 전화번호는 없는 데이터입니다.");
		} else {
			System.out.println("입력한 전화번호에 해당하는 데이터가 삭제되었습니다.");
		}
		
		// 출력 1
		System.out.println("----출력1----");
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String tel = it.next();  // 키 - 전화번호
			Member member1 = map.get(tel); // 멤버 - 회원
			System.out.println(tel + " : " + member1);
		}
		System.out.println("회원수 : " + map.size());
		System.out.println("------");
		
		// 출력 2
		System.out.println("----출력2----");
		Set<Map.Entry<String, Member>> entry = map.entrySet();
		Iterator<Map.Entry<String, Member>> it2 = entry.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Member> mapEntry = it2.next();
			String tel = mapEntry.getKey();
			Member member2 = mapEntry.getValue();
			System.out.printf("%s : %s)\n", tel, member2);
		}
		System.out.println();
		
		// 출력 3
		System.out.println("----출력3----");
		Set<Map.Entry<String, Member>> entry2 = map.entrySet();
		for(Map.Entry<String, Member> member : entry2) {
			String tel = member.getKey();
			Member member3 = member.getValue();
			System.out.printf("%s : %s\n", tel, member3);
		}
		
		// 출력 4 - forEacg(), 람다식
		System.out.println("----출력4----");
		map.forEach((k, v) -> System.out.printf("%s : %s\n", k, v));
	}
}
