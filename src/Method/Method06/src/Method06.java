import java.util.Scanner;

public class Method06 {
	// 정의 - 2번 방법
	static int calcMax(int[] a) { 
		int max = a[0]; 
		
		//기본 for문
		/*
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) max = a[i]; 
		}
		*/
		
		//확장 for문
		for(int i : a) {
			if(i > max) max = i;
		}
		 
		return max;
	}
	
	
	static int calcMin(int[] a) { 
		int min = a[0]; 
		
		//기본 for문
		/*
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) min = a[i]; 
		}
		*/
		
		//확장 for문
		for(int i : a) {
			if(i < min) min = i;
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
			// 변수 선언
			Scanner sc = new Scanner(System.in);
			
			System.out.print("사용할 정수의 개수를 입력하시오.");
			int n = sc.nextInt();
			
			// 배열 개수 결정
			int[] a = new int[n];
			
			// 입력 (배열이니까 반복문으로)
			for(int i=0; i<a.length; i++) {
				System.out.print(i+1 + "번째 정수 입력: ");
				a[i] = sc.nextInt();
			}
			
			// 호출
			int max = calcMax(a);
			int min = calcMin(a);
			
			
			// 출력
			System.out.printf("최대값: %d\n최소값: %d\n", max, min);
				
			sc.close();
	}

}
