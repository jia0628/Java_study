
public class Array02 {
	public static void main(String[] args) {
		// 3번 - 배열 선언하고, 바로 초기화
		int[] a = new int[] {65, 78, 85, 96, 68}; // ● 선언하고 바로 초기화할땐 [] 안에 숫자 안쓴다.
		//int[] a = {65, 78, 85, 96, 68}; // 선언하고, 바로 초기화 -> new int[] 생략 가능
		
		// 가능한 방법
		//int[] a;
		a = new int[] {65, 78, 85, 96, 68};
		
		// 안되는 방법 (에러) -> 분리하면 new int[]를 써주어야 한다.
		//int[] a;
		//a = {65, 78, 85, 96, 68};
		
		
		// 문제)학생 정수 배열 a의 총점과 평균을 구하시오. 평균은 소수점 2째자리로 반올림하여 출력하시오.
		int tot = 0;
		double ave = 0;
		
		for(int i=0; i<a.length; i++) {
			tot += a[i];
		}
		ave = (double)tot / a.length;
		
		System.out.printf("총점: %d\n평균: %.2f", tot, ave);
		
	}

}
