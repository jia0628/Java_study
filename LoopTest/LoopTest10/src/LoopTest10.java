import java.util.Scanner;

// 완전수(Perfect Number) 구하기
// 완전수: 자신을 제외한 약수의 합이 자신과 같아지는 수
// 6, 28, 496, 8128, 33550336 ...
// 1 + 2 + 3 = 6
// 1 + 2 + 4 + 7 + 14 = 28

// 문제) 정수를 입력하여, 입력한 수까지 중에서의 완전수를 출력하고, 합과 개수를 출력하시오.
public class LoopTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, cnt = 0, tot = 0;
		
		System.out.print("정수 입력: ");
		int n =sc.nextInt();
	
		
		for(int i=2; i<=n; i++) {  // ● i는 나 자신 -> ex) 5가 완전수인가? 10이 완전수인가?
			sum = 0;
			for(int j=1; j<=i/2; j++) {  // ● j는 몇번 돌릴건가 -> 약수
				if(i % j == 0) {
					sum += j;
				}
			}
			if(i == sum) {
				System.out.print(i + " ");
				++cnt;
				tot += i;
			}
		}// for문 끝
		
		System.out.printf("\n%d까지의 완전수 개수: %d, 합계: %d\n", n, cnt, tot);
		
		sc.close();
	}

}
