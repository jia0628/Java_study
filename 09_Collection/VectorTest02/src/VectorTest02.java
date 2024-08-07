import java.util.Vector;

// Vector의 다양한 메서드 활용

public class VectorTest02 {
	public static void main(String[] args) {
		// 정수를 저장하는 백터 설정 Integer
		Vector<Integer> v = new Vector<Integer>();
		
		// 데이터 추가하는 방법 1 - 각각 삽입
		// .add(값): 백터의 맨 뒤에 삽입, 순차적으로 삽입
		/*
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		*/
		
		// 데이터 추가하는 방법 2 - 배열 활용
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i<a.length; i++) {
			v.add(a[i]);
		}
		
		// 백터 확인
		System.out.println(v); //● 배열 상태, toString() 생략
		
		// 데이터 출력하는 방법 1 - 인덱스 활용
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println("--------");
		
		// 데이터 출력하는 방법 2 - 반복문 활용
		System.out.println("백터 크기: " + v.size());
		for(int i=0; i<v.size(); i++) {
			System.out.println(i + " : " + v.get(i));
		}
		System.out.println("--------");
		System.out.println(v);
		
		// 데이터 삭제 (1개만) - 2번 인덱스값 삭제
		v.remove(2);
		System.out.println(v);
		
		// 데이터 삽입 (중간) - 2번 인덱스값 30을 다시 삽입
		// .add(인덱스번호, 값): 해당 인덱스에 값을 삽입, 비순차적으로 삽입
		v.add(2, 30);  
		System.out.println(v);
		
		// 데이터 변경 - 2번 인덱스 값 30을 60으로 변경
		v.set(2, 60);
		System.out.println(v);
		
		// 첫번째 값 출력
		System.out.println(v.get(0));           // 권장
		//System.out.println(v.firstElement()); // 백터에만 존재
		
		// 마지막 값 출력
		System.out.println(v.get(v.size()-1)); // 권장
		//System.out.println(v.lastElement()); // 백터에만 존재
		
		// 인덱스에 해당하는 값 출력 - 2번 인덱스 값
		System.out.println(v.get(2));         // 권장
		//System.out.println(v.elementAt(2)); // 백터에만 존재
		
		
		// 데이터 추가(순차적)
		v.add(60);
		System.out.println(v);
		// 값에 해당하는 인덱스 출력 (1) -> 앞에서부터 찾은 인덱스를 출력
		System.out.println(v.indexOf(60));
		
		// 값에 해당하는 인덱스 출력 (2) -> 뒤에서부터 찾은 인덱스를 출력
		System.out.println(v.lastIndexOf(60));
		
		// 값에 해당하는 인덱스 출력 - 해당 값이 없을 때
		System.out.println(v.indexOf(90));    // -1, 배열의 인덱스로는 존재할 수 없는 값
		
		// 값에 해당하는 인덱스 출력 - 중간에서 찾은 인덱스
		System.out.println(v.indexOf(60, 3)); // 3번 인덱스부터 찾은 60
		System.out.println("---------");
		
		System.out.println(v);
		// 중간(비순차적)에서 데이터 추가
		v.add(3, 70);               // 권장
		//v.insertElementAt(70, 3); // 백터에만 존재
		System.out.println(v);
		
		System.out.println("백터의 크기: " + v.size());
		// 백터 사이즈 변경
		v.setSize(5);
		System.out.println(v);
		System.out.println("백터의 크기: " + v.size());
		
		// 백터의 모든 데이터를 삭제
		v.clear();      // 권장
		//v.removeAll(v);
		//v.removeAllElements();
		System.out.println(v);
		System.out.println("백터의 크기: " + v.size());
		
	}
}
