import java.util.Scanner;

// 문제) 정수 2개를 a, b에 입력하였을 때, 정수 a에는 항상 큰 수가, 정수 b에는 항상 작은 수가 저장되도록 프로그래밍 하시오.
public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a입력: ");
		int a = sc.nextInt();
		
		System.out.print("정수 b입력: ");
		int b = sc.nextInt();
		
		// 알고리즘
		// ● 스와핑(swapping): 두 개의 변수 값을 바꾸는 방법
		if(a<b) {         // ● a가 b보다 클 때는 쓸 필요가 없음
			int tmp = a;  // tmp: 임시 변수
			a = b;
			b = tmp;
		} 
		
		System.out.printf("a: %d\nb: %d", a, b);
		
		sc.close();
	}

}
