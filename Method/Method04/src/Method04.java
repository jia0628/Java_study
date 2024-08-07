import java.util.Scanner;

// 문제) 정수 2개를 입력하여 최대값과 최소값을 구하시오.
// calcMax, calcMin
public class Method04 {
	// 정의
	static int calcMax(int x, int y) {
		//● 큰 값을 넣을 임의의 변수 선언
		int max;
		//● if문으로 아래 min과 상황을 반대로 만들어 줌
		if(x > y) max = x; //● x가 더 크면? x에 큰 값을 넣고
		else      max = y; //● 아니라면? y에 큰 값을 넣고
		
		return max;
	}
	
	static int calcMin(int x, int y) {
		//● 작은 값을 넣을 임의의 변수 선언
		int min;
		if(x < y) min = x;
		else      min = y;
		
		return min;
	}
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("정수1 입력: ");
		int x = sc.nextInt();
		
		System.out.print("정수2 입력: ");
		int y = sc.nextInt();
		
		// 호출
		int max = calcMax(x, y);
		int min = calcMin(x, y);
		
		//출력
		System.out.printf("최대값: %d\n최소값: %d", max, min);
		
		sc.close();
	}

}
