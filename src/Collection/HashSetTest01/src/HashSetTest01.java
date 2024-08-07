import java.util.HashSet;
import java.util.Iterator;

/*
	Set (셋)
	- 인터페이스
	- 수학의 집합과 같은 원리의 저장 구조
	- 특징: 순서가 없음(인덱스가 없음), 중복값을 허용하지 않음.
	- 구현체 클래스: HashSet, LinkedHashSet, TreeSet
	
	- ● ArrayList, LinkedList의 장점을 다 가지고 있음
	- ● 수정/삭제가 의미 없다(그래서 Set에선 없다)
	
*/
public class HashSetTest01 {
	public static void main(String[] args) {
		// 해시셋 생성
		HashSet<Integer> set = new HashSet<>();
		
		// 데이터 추가 - 순서가 없음(입력한 순서대로 출력하지 않음), ★핵싱 기법을 사용.
		set.add(66);
		set.add(75);
		set.add(57);
		set.add(96);
		set.add(45);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복값 추가 - 허용하지 않음.
		set.add(66);
		set.add(96);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복값이 아닌 값 추가
		set.add(83);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하는 데이터 삭제 - 값을 통해 삭제
		set.remove(96);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하지 않는 데이터 삭제 - - 에러가 발생하지 않음.
		set.remove(80);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println();
		
		// 출력 1 - 향상된 for문
		System.out.println("----출력 1----");
		for(Integer i : set) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		// 출력 2 - Iterator(잇터레이터) 사용
		System.out.println("----출력 2----");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();
		
		// 출력 3 - forEach(), 람다식
		System.out.println("----출력 3----");
		set.forEach(x -> System.out.print(x + "  "));
		System.out.println();
		
		// 출력 4 - forEach(), 참조 연산자
		System.out.println("----출력 4----");
		set.forEach(System.out::println);
		System.out.println();
		
	}
}
