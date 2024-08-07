import java.util.ArrayList;
/*
문제)
1. 리스트에 정수 배열을 score의 데이터를 저장하시오.
2. 리스트에서 60점 미만의 데이터는 삭제하시오.
3. 리스트의 2번을 제외한 총점과 평균을 구하시오.
4. 리스트의 최고점수와 최저점수를 구하시오.
5. 리스트를 출력하시오. (기본 for문, 향상된 for문)
*/
public class ArrayListTest_Teacher01 {
	public static void main(String[] args) {
		// ArrayList의 메서드를 모두 활용
		ArrayList<Integer> list = new ArrayList<>();
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		int cnt = 0;
		int tot = 0;
		double ave = 0.0;
		
		// 리스트에 배열의 데이터를 추가
		for(int i : score) {
			list.add(i);
		}
		
		// 확인
		System.out.println(list);
		
		// 60점 미만의 데이터는 삭제 - 작은 양의 데이터일 때
//		list.remove(4);
//		System.out.println(list);
//		list.remove(5);
//		System.out.println(list);
//		list.remove(5);
//		System.out.println(list);
		
		// 60점 미만의 데이터는 삭제 - 많은 양의 데이터일 때
		
		// 심각한 문제가 발생.
		// 문제점: 데이터를 삭제하면 뒤에있는 데이터가 앞으로 이동하게 되므로 삭제할 데이터를 누락할 수 있음.
		//● 앞에서부터 지우면 하나씩 땡겨지니까 이건 뒤에서부터 접근해야함
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i) < 60) {
//				list.remove(i);
//			}
//		}
//		System.out.println(list);
		
		// 해결책: 데이터를 삭제할 때 뒤에서부터 접근
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// 총점, 평균
		for(Integer i : list) {
			tot += i;
		}
		cnt = list.size();
		ave = (double)tot / list.size();
		System.out.printf("학생수: %d\n총점: %d\n평균: %.2f\n", cnt, tot, ave);
		
		// 최고 점수, 최저 점수
		//● 1번 -> 우선 max와 min 변수에 첫번째 인덱스값을 넣고 시작
		int maxScore = list.get(0);
		int minScore = list.get(0);
		
		//● 2번 -> 그 다음 인덱스값과 비교하면서 크거나 작다면 변수에 넣는다
		for(int i=0; i<list.size(); i++) {  // 또는 for(int i=1; i<list.size(); i++) {
			if(list.get(i) > maxScore) {
				maxScore = list.get(i);
			}
			if(list.get(i) < minScore) {
				minScore = list.get(i);
			}
		}
		System.out.printf("최고점수: %d\n최저 점수: %d\n", maxScore, minScore);
		System.out.println("--------------------");
		
		// 출력 1번 - 기본 for문
		System.out.println("------1. 기본 for문------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		// 출력 2번 - 향상된 for문
		System.out.println("------2. 향상된 for문------");
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println();
		
		// 출력  3번 - forEach() 메서드, 람다식
		//● 람다식 -> 왼쪽: (매개변수), 매개변수가 여러개면 () 필수 아니면 생략 & 오른쪽: {실행문}, {} 생략 가능
		System.out.println("------3. forEach() 메서드------");
		list.forEach(i -> {System.out.println(i);});
		
		// 출력 4번 -  forEach() 메서드, :: 연산자(람다식에서 사용하는 메서드 참조 연산자)
		//● 아직까지 활발하게 사용하는 편이 아니다
		System.out.println("------4. forEach() 메서드------");
		list.forEach(System.out::println);
		
		
		
	}
}
