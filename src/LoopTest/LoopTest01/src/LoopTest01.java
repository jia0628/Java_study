import java.util.Scanner;

// 정수를 입력하여, 1부터 입력한 정수까지의 짝수를 출력하고, 짝수의 개수와 합계를 구하시오.
public class LoopTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		int cnt = 0, tot = 0;
		
		for(int i=0; i<=n ; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
				tot += i;
				++cnt;
			}
		} // for문 끝
		
		System.out.printf("\n1부터 %d까지의 짝수의 합계: %d\n", n, tot);
		System.out.printf("1부터 %d까지의 짝수의 개수: %d", n, cnt);
		
		sc.close();
	}

}
