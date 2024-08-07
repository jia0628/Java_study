import java.util.ArrayList;

/*
< ArrayList 클래스 >
	1. Vector 클래스와 기능, 사용법이 거의 동일
	2. Vector의 쓰레드 동기화 기능이 성능의 저하를 일으키는 요인이 됨.
		-> ArrayList에서는 Vector의 쓰레드 동기화 기능을 제거하여 성능을 향상 시킴.
		-> 실제로 Vector보다 ArrayList를 더 많이 사용함.
	3. Vector의 capacity(), element가 붙은 메서드는 없음.
	
*/

/*
문제)
1. 리스트에 정수 배열을 score의 데이터를 저장하시오.
2. 리스트에서 60점 미만의 데이터는 삭제하시오.
3. 리스트의 2번을 제외한 총점과 평균을 구하시오.
4. 리스트의 최고점수와 최저점수를 구하시오.
5. 리스트를 출력하시오. (기본 for문, 향상된 for문)
*/
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		int tot = 0;
		double ave = 0;
		int maxScore = 0;
		int minScore = 0;
		
		// 데이터 저장
		for(int i=0; i<score.length; i++) {
			list.add(score[i]);
		}
		System.out.println(list);
		
		// 60점 미만 데이터 삭제, 총점, 평균
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
			tot += list.get(i);
		}
		ave = (double)tot / list.size();
		
		System.out.println(list);
		
		
		// 최고 점수, 최저 점수
		/*
		for(int i=0; i<list.size(); i++) {
			
		}
		*/
		
		// 출력 1 - 기본 for문
		for(int i=0; i<score.length; i++) {
			System.out.println(i + " : " + score[i]);
		}
		System.out.println("총 합계: " + tot);
		System.out.println("평균: " + ave);
		
		// 출력 2 - 향상된 for문
		/*
		for(int s : score) {
			System.out.println(s);
		}
		System.out.println("총 합계: " + tot);
		System.out.println("평균: " + ave);
		*/
		
		
	}
}
