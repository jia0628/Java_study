import java.util.Scanner;

// 문제) 정수를 입력하여 입력한 수의 약수를 출력하고, 약수의 개수와 합계를 출력하시오.
// 20
// 1 2 4 5 10 20
// 약수의 개수:6, 합계: 42
public class LoopTest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		int cnt = 0, tot = 0;
		
		System.out.print(n + "의 약수: ");
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				++cnt;
				tot += i;
				System.out.print(i + " ");
			}
		}// for문 끝
		
		System.out.printf("\n%d의 약수의 개수: %d\n%d의 약수의 합계: %d", n, cnt, n, tot);
		
		sc.close();
	}

}
