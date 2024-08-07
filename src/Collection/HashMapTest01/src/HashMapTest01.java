import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map (맵)
	- 인터페이스
	- 데이터는 키(Key)와 값(Value)의 쌍으로 구성됨.
	- 맵은 순서가 없음.
		-> 키는 중복이 없음 x.
		-> 값은 중복이 있음 o.
	- 구현체 클래스: HashMap, LinkedHashMap, TreeMap
*/

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class HashMapTest01 {
	public static void main(String[] args) {
		// 학생 데이터, 키: 학번(Integer), 값: 이름(String)
		HashMap<Integer, String> map = new HashMap<>();
		
		// 데이터 추가 -> 맵은 순서가 없음 (입력한 순서대로 출력하지는 않음)
		map.put(111111, "박준우");
		map.put(222222, "유호진");
		map.put(333333, "달시오크");
		map.put(444444, "패트릭쿤");
		map.put(555555, "한설희");
		map.put(666666, "에덴");
		map.put(777777, "DK");
		System.out.println(map);
		
		// 중복 키를 입력 -> 허용하지 않음 -> 키에 해당하는 값이 변경
		//● Map에서 수정하는 방법 (키에 대한 값을 수정)
		map.put(444444, "에릭첸");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 중복 값을 입력 -> 허용함
		map.put(888888, "DK");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터를 삭제
		// 1. 키만으로 데이터를 삭제 -> 키를 삭제하면 데이터가 삭제됨.
		map.remove(555555);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 2. 키와 값을 모두 만족할 때 삭제
		map.remove(333333, "달시");    // 키만 만족하면 삭제 불가
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		map.remove(333333, "달시오크"); // 키와 값을 모두 만족하여 삭제
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("------");
		
		
		// 출력 - 키를 통해서 값을 찾는다.
		// 출력 1 - KeySet(), Iterator를 사용
		System.out.println("----출력1----");
		Set<Integer> keys = map.keySet(); // 1. 키의 셋을 생성 (키가 Integer이니까)
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer no = it.next();    // 2. 키를 찾음
			String name = map.get(no); // 3. 맵에서 키에 해당하는 값을 찾음
			System.out.printf("%d(%s)\n", no, name);
		}
		System.out.println();
		
		
		// 출력 2 - entrySet(), Map.Entry, Iterator 사용
		// Map.Entry: 키와 값을 함께 저장하는 인터페이스
		System.out.println("----출력2----");
		Set<Map.Entry<Integer, String>> entrySet1 = map.entrySet();  //● 처음부터 키와 값을 한꺼번에 저장하는 셋을 생성
		Iterator<Map.Entry<Integer, String>> it2 = entrySet1.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, String> entry = it2.next();  //● entry에 키와 값이 다 저장되어 있음 (Map.Entry를 통해 키와 값을 찾으러 돌아다님)
			Integer no = entry.getKey();                    //● entry를 통해 키 찾기
			String name = entry.getValue();                 //● entry를 통해 값 찾기
			System.out.printf("%d(%s)\n", no, name);
		}
		System.out.println();
		
		
		// 출력 3 - entrySet(), Map.Entry, 향상된 for문 (Iterator는 필요 없음)
		//● 확장 for문 자체가 Iterator의 기능을 내장하고 있음
		System.out.println("----출력3----");
		Set<Map.Entry<Integer, String>> entrySet2 = map.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet2) {  //● Map.Entry를 통해 키와 값을 찾으러 돌아다님 -> 돌아다니는 애 이름: entry
			Integer no = entry.getKey();
			String name = entry.getValue();
			System.out.printf("%d(%s)\n", no, name);
		}
		
		
	}
}
