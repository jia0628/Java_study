import java.util.Vector;

/*
< List 계열의 특징 >
	1. 순서가 없고, 중복 데이터를 허용
	2. 가변적인(동적인) 배열 구조
	3. Vector, ArrayList, LinkedList, Stack, Queue
	
- raw type: 구체화되지 않은 타입, 날 것의 타입
- generic type: 구체화된 타입, 일반화된 타입
		
 */
public class VectorTest01 {
	public static void main(String[] args) {
		// Raw Type Vector
		// 구체화되지 않아서 문제가 발생할 소지가 큼 -> 권장하지 않는 방법.
		Vector v1 = new Vector();
		
		v1.add(10);
		v1.add(3.5);
		v1.add("Hello");
		v1.add(true);
		v1.add('A');
		
		// 백터의 확인
		System.out.println(v1);
		
		
		// ★ Generic Type Vector
		// 구체화된 백터, 일반화된 백터
		// 정수만을 저장하는 백터
		//Vector<Integer> v2 = new Vector<>(); // new 다음에 나오는 데이터 타입은 생략 가능
		Vector<Integer> v2 = new Vector<Integer>();
		
		v2.add(10);  //● 데이터 추가는 add()
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(50);
		
//		v2.add(3.5);  // 에러들
//		v2.add("Hello");
//		v2.add("10");
//		v2.add('A');
		
		// 데이터 출력
		System.out.println(v2.get(0)); //● 데이터를 꺼낼땐 get()
		System.out.println(v2.get(1));
		System.out.println(v2.get(2));
		System.out.println(v2.get(3));
		//System.out.println(v2.get(5)); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("-----------");
		
		System.out.println("벡터의 크기: " + v2.size()); //● 데이터의 갯수는 .size()
		
		// 반복문 1번 - 기본 for문
		int tot = 0;
		for(int i=0; i<v2.size(); i++) {
			tot += v2.get(i);  //● 또는 v2.get(i).intValue();
			System.out.println(i + " : " + v2.get(i));
		}
		System.out.println("총 합계: " + tot);
		System.out.println("-----------");
		
		// 반복문 2번 - 확장 for문
		tot = 0;
		for(Integer i : v2) {  //● 또는 for(int i : v2) {
			tot += i;          //● 또는 i.intValue();
			System.out.println(i);
		}
		System.out.println("총 합계: " + tot);
		
		System.out.println("백터 확인: " + v2.toString());
		
	}
}
