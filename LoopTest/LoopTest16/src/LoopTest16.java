import java.util.Arrays;
import java.util.Scanner;

// 문제) 정수 1개를 입력하여, 1부터 입력한 수까지에서
// 3의 배수를 출력하고, 3의 배수의 개수와 합,
// 4의 배수를 출력하고, 4의 배수의 개수와 합,
// 3의 배수이면서 4의 배수를 출력하고, 3의 배수이면서 4의 배수의 개수와 합을 각각 출력하시오.
// 보완점: 값의 출력 부분을 정수의 배열로 만들어 활용, tot의 배열, cnt의 배열

public class LoopTest16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수 배열의 디폴트값: 0;
		int[] cnts = new int[3]; // 개수, 0: 3의 배수, 1: 4의 배수, 2: 12의 배수
		int[] tots = new int[3]; // 합계, 0: 3의 배수, 1: 4의 배수, 2: 12의 배수
		int[] mul3, mul4, mul34;
		
		System.out.println("3의 배수, 4의 배수, 3의 배수이면서 4의 배수를 구합니다.");
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i % 3 == 0) {
				++cnts[0];
				tots[0] += i; 
				
			}
			if(i % 4 == 0) {
				++cnts[1];
				tots[1] += i;
			}
			if(i%3==0 && i%4==0) {
				++cnts[2];
				tots[2] += i;
			}
		}
		// 배열 생성
		mul3 = new int[cnts[0]];
		mul4 = new int[cnts[1]];
		mul34 = new int[cnts[2]];
		
		// 배열 에 대입
		int x = 0, y = 0, z = 0;
		for(int i=1; i<=n; i++) {
			if(i % 3 == 0) {
				mul3[x++] = i;
			}
			if(i % 4 == 0) {
				mul4[y++] =i;
			}
			if(i%3==0 && i%4==0) {
				mul34[z++] = i;
			}
		}
		
		System.out.printf("%d의 3의 배수의 개수: %d, 합계: %d\n", n, cnts[0], tots[0]);
		System.out.printf("%d의 4의 배수의 개수: %d, 합계: %d\n", n, cnts[1], tots[1]);
		System.out.printf("%d의 3의 배수이면서 4배수의 개수: %d, 합계: %d\n", n, cnts[2], tots[2]);
		
		System.out.println(n + "의 3의 배수: " + Arrays.toString(mul3)); // ● Arrays.toString 메소드
		System.out.println(n + "의 4의 배수: " + Arrays.toString(mul4));
		System.out.println(n + "의 3의 배수이면서 4의 배수: " + Arrays.toString(mul34));
		
		sc.close();
	}

}
