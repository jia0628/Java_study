import java.util.ArrayList;
import java.util.Collections;

public class WorkArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] score = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		// 데이터 추가
		for(Integer i : score) {
			list.add(i);
		}
		System.out.println(list);
		
		// 조건에 의한 삭제 -> 60점 미만은 삭제
		list.removeIf(x -> x<60);
		System.out.println(list);
		
		// 최고 점수, 최저 점수
		System.out.println("최고 점수: " + Collections.max(list));
		System.out.println("최저 점수: " + Collections.min(list));
		
	}
}
