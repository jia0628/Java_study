import java.util.Scanner;

// 문제) 정수 1개를 입력하여, 1부터 입력한 수까지에서
// 3의 배수를 출력하고, 3의 배수의 개수와 합,
// 4의 배수를 출력하고, 4의 배수의 개수와 합,
// 3의 배수이면서 4의 배수를 출력하고, 3의 배수이면서 4의 배수의 개수와 합을 각각 출력하시오.
// 보완점: 값의 출력 부분을 정수의 배열로 만들어 활용

public class LoopTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		// 3의 배수, 4의 배수, 3의 배수이면서4의 배수인 변수 각각 지정.
		int cnt3 = 0, tot3 = 0;
		int cnt4 = 0, tot4 = 0;
		int cnt34 = 0, tot34 = 0;
		String str3 = "", str4 = "", str34  = ""; 
		
		
		// 다 포함이 되어야해서 if~else로 하면 안된다.
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%4==0) {
				++cnt34;
				tot34 += i;
				str34 += i + " ";  // 연결의 의미
			}
			if(i%3==0) {
				++cnt3;
				tot3 += i;
				str3 += i + " ";  
			}
			if(i%4==0) {
				++cnt4;
				tot4 += i;
				str4 += i + " ";
			}
			
		} // for문 끝
		
		// 3, 6, 9, 12, 15, 18
		// 4, 8, 12, 16, 20
		
		System.out.printf("%d의 3의 배수 출력: %s\n", n, str3);
		System.out.printf("%d의 3의 배수의 개수: %d, 합계: %d\n", n, cnt3, tot3);
		
		System.out.printf("%d의 4의 배수 출력: %s\n", n, str4);
		System.out.printf("%d의 4의 배수의 개수: %d, 합계: %d\n", n, cnt4, tot4);
		
		System.out.printf("%d의 3의 배수이면서 4의 배수 출력: %s\n", n, str34);
		System.out.printf("%d의 3의 배수이면서 4의 배수의 개수: %d, 합계: %d\n", n, cnt34, tot34);
		
		sc.close();
	}

}
