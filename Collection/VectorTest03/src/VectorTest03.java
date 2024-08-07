import java.util.Vector;

// Vector 클래스는 List 인터페이스를 구현하고 있는 관계

public class VectorTest03 {
	@SuppressWarnings("unchecked") 
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		// 데이터 추가 1번
		v1.add(10); v1.add(20); v1.add(30);
		v2.add(40); v2.add(50); v2.add(60);
		v3.add(10); v3.add(20); v3.add(30);
		
		// 데이터 추가 2번 - 나중에 더 자세히
		/*
		v1 = Arrays.asList(10, 20, 30);
		v2 = Arrays.asList(40, 50, 60);
		v3 = Arrays.asList(30, 40, 50);
		*/
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("-------");
		
		// 백터에 다른 백터의 내용을 추가 1번 - 순차적으로
		v1.addAll(v2);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("---------");
		
		// 백터에 다른 백터의 내용을 추가 2번 - 중간에, 비순차적으로
		v3.addAll(1, v2);
		System.out.println("v3: " + v3);
		System.out.println("v2: " + v2);
		
		// 백터에서 데이터의 존재 여부 확인 (1개만)
		System.out.println(v1.contains(50));
		System.out.println(v1.contains(90));
		System.out.println("-------");
		
		// 백터에서 데이터의 존재 여부 확인(다른 백터의 모든 데이터)
		Vector<Integer> v4 = new Vector<>();
		v4.add(80); v4.add(90);
		System.out.println(v1.containsAll(v2));
		System.out.println(v1.containsAll(v4));
		
		// 백터의 복제
		Vector<Integer> v5 = (Vector<Integer>)v1.clone();
		System.out.println("v1: " + v1);
		System.out.println("v5: " + v5);
		
		
	}
}
