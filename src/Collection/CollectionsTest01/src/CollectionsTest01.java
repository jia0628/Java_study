import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	< Collections >
	- 모든 컬렉션에 공통으로 사용할 수 있는 메서드를 가지고 있는 클래스
	- 거의 대부분의 메서드는 static으로 구현되어 있음.
	
 */
public class CollectionsTest01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 데이터 추가
//		list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		Collections.addAll(list, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(list);
		
		// 오른쪽으로 2칸씩 이동
		Collections.rotate(list, 2);  // [90, 100, 10, 20, 30, 40, 50, 60, 70, 80]
		System.out.println(list);
		
		// 인덱스를 통한 데이터의 교환
		Collections.swap(list, 2, 5); // [90, 100, 40, 20, 30, 10, 50, 60, 70, 80]
		System.out.println(list);
		
		// 값을 섞어서 임의의 자리에 넣음
		Collections.shuffle(list);    // [20, 70, 90, 50, 30, 40, 80, 100, 60, 10]
		System.out.println(list);
		
		// 오름차순 정렬
		Collections.sort(list);       // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		System.out.println(list);
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder()); // [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]
		System.out.println(list);
		
		// 역순으로 나타냄
		Collections.reverse(list);    // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		System.out.println(list);
		
		// 최대값, 최소값
		System.out.println("최대값: " + Collections.max(list));   // 최대값: 100
		System.out.println("최소값: " + Collections.min(list));   // 최소값: 10
		
		// 모든 데이터를 특정 데이터로 채움
		Collections.fill(list, 7);          // [7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
		System.out.println(list);
		
		// 이전 데이터를 특정 데이터로 모두 채움
		Collections.replaceAll(list, 7, 1); // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
		System.out.println(list);
		
		// 리스트 모든 데이터 제거
		list.clear();
		System.out.println(list);
		
		// 리스트 데이터 추가
		Collections.addAll(list, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 1, 2, 3, 4, 5);
		System.out.println(list2);
		
		// 리스트에 다른 리스트의 내용을 복사
		// copy(원본 데이터, 복사본 데이터): 원본에 복사본을 복사본의 개수만큼 복사
		// 원본의 개수가 복사본보다 개수보다 크거나 같아야 한다
		Collections.copy(list, list2);
		System.out.println(list);
		System.out.println(list2);
		System.out.println("------");
		
		// nCopies(개수, 값): 값을 개수만큼 가지는 리스트를 생성
		List<Integer> list3 = Collections.nCopies(7, 50);
		System.out.println(list3);
		
	}
}
