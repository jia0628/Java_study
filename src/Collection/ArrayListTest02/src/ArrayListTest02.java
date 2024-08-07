import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// List 인터페이스
// ArrayList 클래스는 List를 구현한 구현체 클래스

// ArrayListTest_Teacher01 -> 더 간결하게

//● Arrays 클래스 2개 -> .toString .asList
//● Collections 클래스 -> .max .min .sort .reverseOrder
//● compareTo() 메서드
public class ArrayListTest02 {
	public static void main(String[] args) {
		/*
		// 단점: List의 메서드만 사용 가능, 장점: List를 구현한 다른 클래스와의 호환(교체)가 용이하다
		//● List를 부모로 두고 뒤에 new를 다른걸로 그때그때 바꿔 낀다 (Vector, ArrayList, LinkedList, Stack..)
		List<Integer> list = new ArrayList<>(); 
		
		//● 데이터 추가 작업이 따로 필요 없음
		list = Arrays.asList(95, 88, 75, 63, 52, 77, 47, 48, 93, 91);
		*/
		
		
		// 장점: ArrayList의 메서드를 모두 활용
		ArrayList<Integer> list = new ArrayList<>();
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		// 리스트에 배열의 데이터를 추가
		for(int i : score) {
			list.add(i);
		}
	
		// 리스트 확인
		System.out.println(list);
		
		// 60점 미만의 데이터는 삭제 - 람다식
		//● 람다식 -> 왼쪽: (매개변수[이름은 아무거나]) & 오른쪽: {실행문}, {} 생략 가능
		//● removeIf() -> 조건에 의해 데이터를 삭제, ArrayList에 있는 메서드, List 인터페이스에는 없음
		list.removeIf(x -> x<60);
		System.out.println(list);
		
		// 방법 1 - 최고 점수, 최저 점수 - compareTo() 메서드, 람다식으로
		/*
		// 정렬
		list.sort((x, y) -> x.compareTo(y));  // 오른차순 정렬
//		list.sort((x, y) -> y.compareTo(x));  // 내림차순 정렬
		System.out.println(list);
		System.out.printf("최고 점수: %d\n최저 점수: %d\n", list.get(list.size()-1), list.get(0));
		*/
		
		// 방법 2 - 최고 점수, 최저 점수 - Collections 클래스
		System.out.printf("최고 점수: %d\n최저 점수: %d\n", Collections.max(list), Collections.min(list));
		
		// 오름차순 정렬
		Collections.sort(list);  
		System.out.println(list); 
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());  
		System.out.println(list);
		System.out.println("---------------");
		
		// 리스트를 배열로 저장 - Object[] 배열
		Object[] scores1 = list.toArray();
		System.out.println(Arrays.toString(scores1));
		
		// 리스트를 배열로 저장 - Integer[] 배열
		Integer[] scores2 = list.toArray(new Integer[0]);  // 리스트의 개수만큼 배열을 생성
		System.out.println(Arrays.toString(scores2));
		
		// 리스트를 배열로 저장 - Integer[] 배열
		Integer[] scores3 = list.toArray(new Integer[10]); // 리스트의 개수보다 큰 값이면 남는 공간은 null로 채워진다
		System.out.println(Arrays.toString(scores3));
		
	}
}
