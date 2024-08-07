import java.util.Scanner;
// 소수(Prime Number)
// - 1과 자신으로만 나누어 떨어지는 수, 1과 자신만을 약수로 가지는 수, 1과 자신 이외에는 나누어 떨어지는 수가 없는 수
// - 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 ...


// 문제) 정수를 입력하여, 입력한 수까지의 소수를 출력하고, 개수와 합계를 구하시오.
public class LoopTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, tot = 0;
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.print(n + "까지의 소수: ");
		for(int i=2; i<=n; i++) {  // ● 각각의 수가 소수인지 판별
			for(int j=2; j<=i; j++) {  
				if(i == j) {
					System.out.print(i + " ");
					++cnt;
					tot += i;
				}
				if(i % j == 0) {
					break;
				}
			}
		}// for문 끝
		
		System.out.printf("\n%d까지의 소수의 개수: %d, 합계: %d", n, cnt, tot);
		
		sc.close();
	}

}
