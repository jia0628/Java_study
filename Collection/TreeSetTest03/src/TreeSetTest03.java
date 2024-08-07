import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 중복되지 않은 데이터 추가
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76); set.add(92); set.add(78); set.add(67);
		System.out.println(set);                      // [58, 63, 67, 76, 78, 82, 92, 97]
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// 내림차순 정렬
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println(set2);
		
		// ##### headSet #####
		// 78점보다 작은 값을 가진 셋을 생성 (지정한 값은 포함되지 않음)
		SortedSet<Integer> set3 = set.headSet(78);
		System.out.println(set3);
		
		// 78점보다 작은 값을 가진 셋을 생성 (지정한 값은 포함함 O)
		// headSet(값): 값을 포함하지 않고, 값보다 작은 셋
		// headSet(값, true): 값을 포함함, 값보다 작은 셋
		// - 두번째 매개변수의 기본값: false
		SortedSet<Integer> set4 = set.headSet(78, true);
		System.out.println(set4);
		
		
		// ##### tailSet #####
		// 78점보다 큰 값을 가진 셋을 생성 (지정한 값은 포함함 O)
		SortedSet<Integer> set5 = set.tailSet(78);
		System.out.println(set5);
		
		// 78점보다 큰 값을 가진 셋을 생성 (지정한 값은 포함되지 않음)
		// tailSet(값): 값을 포함함, 값보다 큰 셋
		// tailSet(값, false): 값을 포함하지 않고, 값보다 큰 셋
		// - 두번째 매개변수의 기본값: true
		SortedSet<Integer> set6 = set.tailSet(78, false);
		System.out.println(set6);
		
		
	}
}
