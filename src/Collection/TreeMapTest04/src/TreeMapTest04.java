import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// ★
//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class TreeMapTest04 {
	public static void main(String[] args) {
		// 키: 정수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// 데이터 추가
		map.put(87, "박준우");
		map.put(98, "유호진");
		map.put(75, "달시오크");
		map.put(95, "패트릭쿤");
		map.put(80, "한설희");
		map.put(82, "에덴");
		map.put(68, "DK");
		
		// 확인 - 키를 기준으로 오름차순 정렬
		System.out.println(map);
		
		// 특정 점수보다 작은 값을 가진 부분 맵 (특정 점수 미포함) 
		SortedMap<Integer, String> map2 = map.headMap(80);
		System.out.println("80점보다 작은 값을 가진 맵: " + map2);
		
		// 특정 점수보다 작은 값을 가진 부분 맵 (특정 점수 포함)
		SortedMap<Integer, String> map3 = map.headMap(80, true); //● true 추가, 기본값 false
		System.out.println("80점보다 작은 값을 가진 맵: " + map3);
		
		// 특정 점수보다 큰 값을 가진 부분 맵 (특정 점수 미포함)
		SortedMap<Integer, String> map4 = map.tailMap(80);
		System.out.println("80점보다 큰 값을 가진 맵: " + map4);
		
		// 특정 점수보다 큰 값을 가진 부분 맵 (특정 점수 포함)
		SortedMap<Integer, String> map5 = map.tailMap(80, true);
		System.out.println("80점보다 큰 값을 가진 맵: " + map5);
		System.out.println("-----");
		
		// 내림차순 맵으로 변경
		NavigableMap<Integer, String> map6 = map.descendingMap();
		System.out.println("내림차순 맵: " + map6);
		
		// 내림차순 키셋
		NavigableSet<Integer> set2 = map.descendingKeySet();
		System.out.println("내림차순 키셋: " + set2);
		
		// 오름차순 키셋
		Set<Integer> set3 = map.keySet();
		System.out.println("오름차순 키셋: " + set3);
	}
}
