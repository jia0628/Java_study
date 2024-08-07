import java.util.Scanner;

// 문제) 정수 3개를 입력하여, 최대값과 최소값을 구하시오.
// calcMax, calcMin
public class Method05 {
	// 정의 - 1번 방법
	/*
	static int calcMax(int x, int y, int z) {
		int max = x; //● 애초에 max에 x를 넣어두고 시작
		
		//● 값이 하나 더 생겨도 if문만 추가하면 된다.
		//● 하나씩 비교해야해서 if~else는 쓰면 안된다.
		if(y > max) max = y;
		if(z > max) max = z;
		
		return max;
	}
	
	static int calcMin(int x, int y, int z) {
		int min = x;
		
		if(y < min) min = y;
		if(z < min) min = z;
		
		return min;
	}
	*/
	
	// 정의 - 2번 방법
	// ... 연산자: 가변 인자(인수) 연산자
	// 전달 받은 매개변수들을 같은 타입의 1차원배열로 만들어줌.
	static int calcMax(int ...a) { 
		int max = a[0]; //● 먼저 배열의 0번 인덱스에 넣어둠
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) max = a[i]; //● a[1]과 a[0]을 비교하여 큰 걸 max값에 넣어준다.
		}
		return max;
	}
	
	// ...연산자로 min정의!
	
	
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("정수1 입력: ");
		int x = sc.nextInt();
		
		System.out.print("정수2 입력: ");
		int y = sc.nextInt();
		
		System.out.print("정수3 입력: ");
		int z = sc.nextInt();
		
		// 호출
		int max = calcMax(x, y, z);
		//int min = calcMin(x, y, z);
		
		
		// 출력
		//System.out.printf("최대값: %d\n최소값: %d\n", max, min);
		
		sc.close();
	}

}
