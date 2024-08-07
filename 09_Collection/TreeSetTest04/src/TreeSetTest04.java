import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		String[] names = {
				"abc", "alien", "bat", "car", "Car", "disco", "dance", "dZZZZ", "dzzzz",
				"elephant", "elevator", "fan", "flower", "d", "a",
				"바디", "하늘", "나무", "김", "?", "!",
		};
		
		// 데이터 추가
		for(String s : names) {
			set.add(s);
		}
		System.out.println(set);
		
		// subSet("시작값", "끝값"): 끝값은 포함하지 않음.
		// a부터 d까지를 부분셋으로 생성 1(d는 미포함)
		SortedSet<String> set2 = set.subSet("a", "d"); // d는 포함하지 않음
		System.out.println(set2);
		
		// a부터 d까지를 부분셋으로 생성 2(d도 포함)
		SortedSet<String> set3 = set.subSet("a", "e"); // d는 포함함
//		SortedSet<String> set3 = set.subSet("a", "dzzzzzzzzzzzzzzzzzz");
		System.out.println(set3);
		
		// subSet("시작값", 시작값 포함여부, "끝값", 끝값 포함여부)
		// 시작값 포함여부의 기본값: true, 끝값 포함여부의 기본값: false
		// a부터 d까지를 부분셋으로 생성 3(d도 포함) - 또 다른 방법
		SortedSet<String> set4 = set.subSet("a", true, "d", true); //● 해석: 시작도 포함하고 끝값도 포함하라
		System.out.println(set4); //● [a, abc, alien, bat, car, d] -> 딱 d까지만 잡는다
		
		// 한글
		// ㄱ부터 ㄹ까지 부분셋을 생성 (ㄹ은 미포함) -> 잘못된 방법
		// 가부터 라까지 부분셋을 생성
		SortedSet<String> set5 = set.subSet("가", "마");
		System.out.println(set5);
		
	}
}
