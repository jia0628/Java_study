import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 중복되지 않은 데이터 추가
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76); set.add(92); set.add(78); set.add(67);
		System.out.println(set);                      // [58, 63, 67, 76, 78, 82, 92, 97]
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// ### TreeSet에 존재하는 메서드 활용 ###
		System.out.println("최저 점수: " + set.first()); // 최저 점수: 58
		System.out.println("최고 점수: " + set.last());  // 최고 점수: 97
		
		// 지정한 정수는 포함하지 않고 찾음
		System.out.println("92점 바로 아래의 점수: " + set.lower(92));  // 92점 바로 아래의 점수: 82
		System.out.println("95점 바로 위의 점수: " + set.higher(95));  // 95점 바로 위의 점수: 97
		
		// 지정한 정수를 포함하여 찾음
		System.out.println("78점이거나 바로 아래 점수: " + set.floor(78));    // 78점이거나 바로 아래 점수: 78
		System.out.println("78점이거나 바로 위의 정수: " + set.ceiling(78));  // 78점이거나 바로 위의 정수: 78
		
		// 출력 1
		System.out.println("----출력 1----");
		for(Integer i : set) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		// 출력 2
		System.out.println("----출력 2----");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();
		
		// 출력 3
		// pollFirst(): 앞에서 데이터를 꺼내고, 데이터를 삭제
		// pollLast(): 뒤에서 데이터를 꺼내고, 데이터를 삭제
		System.out.println("----출력 3----");
		while(!set.isEmpty()) {
//			System.out.print(set.pollFirst() + "  ");  //● 오름차순
			System.out.print(set.pollLast() + "  ");   //● 내림차순
		}
		System.out.println();
		
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
	}
}
