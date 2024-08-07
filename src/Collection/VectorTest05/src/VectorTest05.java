import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		
		v1.add(10); v1.add(20); v1.add(30); v1.add(40);
		v2.add(30); v2.add(40); v2.add(50); v2.add(60);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("--------");
		
		// 백터에서 다른 백터와 같은 내용만 남기고 나머지는 삭제, retain(유지한다)
		v1.retainAll(v2);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("--------");
		
		// 데이터 추가: 10 ~ 100까지 10씩 증가하는 값 추가
		for(int i=10; i<=100; i+=10) {
			v3.add(i);
		}
		
		// 백터의 부분 리스트를 생성
		List<Integer> v4 = v3.subList(3, 8);  // 3~8번까지의 인덱스의 부분 리스트
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		
		// 백터를 Object 타입의 배열로 생성
		Object[] a = v3.toArray();
		System.out.println(Arrays.toString(a));
		
	}
}
