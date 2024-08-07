import java.util.Arrays;
import java.util.Collections;

/*
	< Arrays >
	- 배열을 효과적으로 다룰수 있도록 하는 다양한 메서드를 가지는 클래스
	- 포함하고 있는 메서드들은 대부분 static으로 선언됨.
	
 */
public class ArraysTest01 {
	public static void main(String[] args) {
		int[] a1 = new int[5];
		
		// 배열의 내용 확인
		System.out.println(Arrays.toString(a1)); //● for문을 돌리지 않아도 잠깐 배열을 확인할 수 있다
		
		// 배열의 특정값 채움
//		Arrays.fill(a1, (int)(Math.random()*10+1));        // [6, 6, 6, 6, 6]
		Arrays.fill(a1, 5);
		System.out.println(Arrays.toString(a1));
		
		// 배열을 특정값을 람다식을 이용하여 다양하게 채움
		// 1~10 사이의 값으로 채움
		Arrays.setAll(a1, i -> (int)(Math.random()*10+1)); // [7, 8, 6, 4, 9]
		System.out.println(Arrays.toString(a1));
		System.out.println("-------");
		
		// 배열 복사
		// .copyOf(원본, 개수): 원본의 개수만큼 복사한 새로운 배열을 생성  
		// 0번 인덱스부터 개수만큼 복사
		int[] a2 = Arrays.copyOf(a1, a1.length);           // [7, 8, 6, 4, 9]
		System.out.println(Arrays.toString(a2));
		
		// 배열 복사
		// .copyOfRange(원본, 시작인덱스, 끝인덱스+1): 원본에서 시작 인덱스부터 끝 인덱스 이전까지의 범위를 복사한 새로운 배열을 생성
		// 범위를 맘대로 지정
		int[] a3 = Arrays.copyOfRange(a1, 1, 4);          // [8, 6, 4]
		System.out.println(Arrays.toString(a3));
		System.out.println("-------");
		
		// 배열 정렬 -> 전체 정렬, 오름차순
		Arrays.sort(a1); 
		System.out.println(Arrays.toString(a1));
		
		// 배열 정렬 -> 범위 정렬
		// .sort(원본, 시작인덱스, 끝인덱스+1): 원본에서 시작 인덱스부터 끝 인덱스 이전까지의 범위를 정렬
		Arrays.sort(a2, 1, 4);                            // [7, 4, 6, 8, 9]
		System.out.println(Arrays.toString(a2));
		
		// 배열 정렬
		// 기본 타입의 int형에는 적용이 안됨 -> Integer[]로 사용해야 함
		Integer[] arr = new Integer[] {50, 10, 30, 40, 20};
//		Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(arr, (a, b) -> b - a);
		System.out.println(Arrays.toString(arr));
		System.out.println("-------");
		
		// 오름차순 정렬
		Arrays.sort(arr, (a, b) -> a - b);
		System.out.println(Arrays.toString(arr));
		
		// .binarySearch(배열, 찾는값): 배열에서 찾는 값의 인덱스를 리턴,
		// - 오름차순으로 정렬되어 있을 때만 가능
		int idx = Arrays.binarySearch(arr, 20);
		System.out.println(idx);  // 1
		
		
		Integer[] arr2 = Arrays.copyOf(arr, arr.length);
		Integer[] arr3 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr3, (a, b) -> b - a);
		Integer[] arr4 = new Integer[] {10, 20, 30, 40, 55};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		// 배열의 값을 비교
		// .equals(배열1, 배열2): 배열1과 배열2의 각각의 인덱스에 해당하는 요소의 값이 모두 같을 때 true로 판정
		System.out.println(Arrays.equals(arr, arr2));  // true
		System.out.println(Arrays.equals(arr, arr3));  // false -> 값은 같아도 순서가 다르면 false
		System.out.println(Arrays.equals(arr, arr4));  // false
		
	}
}
