import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		// 키:영어과일명, 값: 가격
		TreeMap<String, Integer> map = new TreeMap<>();
		
		// 데이터 추가
		map.put("grape", 3000);
		map.put("pineapple", 4500);
		map.put("cherry", 4700);
		map.put("apple", 3300);
		map.put("blueberry", 2800);
		map.put("strawberry", 6300);
		map.put("watermelon", 15000);
		map.put("g", 8800);
		
		// 확인 - key를 기준으로 오름차순 정렬
		System.out.println(map);
		
		// b부터 g앞까지 (b부터 f까지) 부분맵 (g 미포함)
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// b부터 g앞까지 (b부터 f까지) 부분맵 (g 포함)
		SortedMap<String, Integer> map3 = map.subMap("b", true, "g", true);
		System.out.println(map3);
		
		// 특정 키의 포함 여부
		// watermelon이 있는지의 여부
		System.out.println(map.containsKey("watermelon")); // true
		// mango가 있는지의 여부
		System.out.println(map.containsKey("mango"));      // false
		
		// 특정 값의 포함 여부
		// 15000원짜리 과일이 있는지의 여부
		System.out.println(map.containsValue(15000));   // true
		// 7000원짜리 과일이 있는지의 여부
		System.out.println(map.containsValue(7000));    // false
		System.out.println();
		
		// 출력 1 - forEach
		System.out.println("----출력1----");
		map.forEach((k, v) -> System.out.printf("%s (%d)\n", k, v));
		System.out.println();
		
		// 출력 2 -
		// pollFirstEntry(): 데이터를 처음부터 꺼내고, 삭제한다
		// pollLastEntry(): 데이터를 마지막부터 꺼내고, 삭제한다
		System.out.println("----출력2----");
		while(!map.isEmpty()) {
//			System.out.println(map.pollFirstEntry());
			System.out.println(map.pollLastEntry());
		}
		System.out.println(map);                   // {}
		System.out.println("크기: " + map.size());  // 크기: 0
		
		
	}
}
