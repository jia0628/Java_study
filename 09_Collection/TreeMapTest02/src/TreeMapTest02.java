import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
	문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
	1. 키는 학생이름, 값은 학생의 점수를 저장하는 TreeMap인 map을 완성하시오.
	2. 학생 데이터를 7개 추가하여 TreeMap의 특징을 확인하시오.
	3. 키의 중복과 값의 중복을 확인하시오.
	4. 키를 통해 데이터를 삭제하는 방법 2가지를 구현하시오.
	5. map의 모든 데이터를 3가지 방법으로 출력하시오.
	
 */

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class TreeMapTest02 {
	public static void main(String[] args) {
		// 키: 학생이름(String), 값: 학생점수(Integer)
		TreeMap<String, Integer> map = new TreeMap<>();
		
		// 데이터 추가
		map.put("박준우", 95);
		map.put("유호진", 87);
		map.put("달시오크", 100);
		map.put("패트릭쿤", 92);
		map.put("한설희", 85);
		map.put("에덴", 79);
		map.put("DK", 80);
		System.out.println(map);
		System.out.println("총 학생수 : " + map.size());
		System.out.println();
		
		// 키의 중복 - 키에 대한 값 수정
		map.put("박준우", 100);
		System.out.println("박준우 점수 수정 -> " + map);
		System.out.println("학생수 : " + map.size());
		System.out.println();
		
		// 값의 중복
		map.put("김현준", 85);
		System.out.println("김현준 추가 -> " + map);
		System.out.println("학생수 : " + map.size());
		System.out.println();
		
		// 데이터 삭제 1 - 키만으로 삭제
		map.remove("DK");
		System.out.println("DK 삭제 -> " + map);
		System.out.println("학생수: " + map.size());
		System.out.println();
		
		// 데이터 삭제 2 - 키와 값을 모두 확인하여 삭제
		// 키는 같고, 값이 다르면 삭제 불가
//		map.remove("달시오크", 50);
//		System.out.println("달시오크 삭제 -> " + map);
//		System.out.println("학생수: " + map.size());
		
		// 키와 값이 모두 같다면 삭제
		map.remove("달시오크", 100);
		System.out.println("달시오크 삭제 -> " + map);
		System.out.println("학생수: " + map.size());
		
		
		// 출력 1번
		System.out.println("----출력 1----");
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Integer score = map.get(name);
			System.out.printf("%s (%d점)\n", name, score);
		}
		System.out.println();
		
		// 출력 2번
		System.out.println("----출력 2----");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();
			String name2 = entry.getKey();
			Integer score2 = entry.getValue();
			System.out.printf("%s (%d점)\n", name2, score2);
		}
		System.out.println();
		
		// 출력 3번
		System.out.println("----출력 3----");
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		for(Map.Entry<String, Integer> entry : set2) {
			String name3 = entry.getKey();
			Integer score3 = entry.getValue();
			System.out.printf("%s (%d점)\n", name3, score3);
		}
		System.out.println();
		
	}
}
