import java.util.Map;
import java.util.TreeMap;

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class TreeMapTest03 {
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
		
		// 가장 작은 정수, 가장 큰 정수
		System.out.println("가장 작은 정수: " + map.firstKey());
		System.out.println("가장 큰 정수:" + map.lastKey());
		System.out.println("-----");
		
		// 가장 작은 정수와 이름
		Map.Entry<Integer, String> entry = map.firstEntry();
		//System.out.printf("가장 작은 정수와 학생 이름: %d(%s)\n", map.firstEntry().getKey(), map.firstEntry().getValue());
		System.out.printf("가장 작은 정수와 학생 이름: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 가장 큰 정수와 이름
		System.out.printf("가장 큰 정수와 학생 이름: %d(%s)\n", map.lastEntry().getKey(), map.lastEntry().getValue());
		System.out.println("-----");
		
		// 특정 점수 바로 아래 점수, 특정 점수 바로 위의 점수 (특정 점수는 포함하지 않음)
		// 95점
		System.out.println("95점 바로 아래 점수: " + map.lowerKey(95));
		System.out.println("95점 바로 위의 점수: " + map.higherKey(95));
		System.out.println("-----");
		
		// 특정 점수 바로 아래 점수와 이름 (특정 점수는 포함하지 않음)
		// 95점
		System.out.printf("95점 바로 아래 점수와 이름: %d(%s)\n", map.lowerEntry(95).getKey(), map.lowerEntry(95).getValue());
		
		// 특정 점수 바로 위의 점수와 이름 (특정 점수는 포함하지 않음)
		// 95점
		System.out.printf("95점 바로 위의 점수와 이름: %d(%s)\n", map.higherEntry(95).getKey(), map.higherEntry(95).getValue());
		System.out.println("-----");
		
		// 특정 점수이거나 바로 아래 점수, 특정 점수이거나 바로 위의 점수 (특정 점수 포함)
		// 95점
		System.out.printf("95점 이거나 바로 아래 점수: %d\n", map.floorKey(94));
		System.out.printf("95점 이거나 바로 위의 점수: %d\n", map.ceilingKey(95));
		System.out.println("-----");
		
		// 특정 점수이거나 바로 아래 점수와 이름 (특정 점수 포함)
		// 95점
		System.out.printf("95점이거나 바로 아래 점수와 이름: %d(%s)\n", map.floorEntry(95).getKey(), map.floorEntry(95).getValue());
		
		// 특정 점수이거나 바로 위이 점수와 이름 (특정 점수 포함)
		System.out.printf("95점이거나 바로 위의 점수와 이름: %d(%s)\n", map.ceilingEntry(96).getKey(), map.ceilingEntry(96).getValue());
		
	}
}
