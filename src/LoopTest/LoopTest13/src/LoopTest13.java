import java.util.Scanner;

// 문제) 정수를 입력하여 입력한 수의 팩토리얼을 구하시오.
// 정수 입력: 5
// < 출력 화면 설계 >
// 5! = 1 * 2 * 3 * 4 * 5 = 120
public class LoopTest13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt(); 
		int fact = 1;
		
		System.out.print(n + "! = ");
		for(int i=1; i<=n; i++) {
			fact *= i;
			if(i < n) {  // ● 1, 2, 3, 4일 때만 *을 붙임.
				System.out.print(i + " * ");
			} else {  // ● 아니면 값만 입력.
				System.out.print(i);
			}
		}// for문 끝
		
		System.out.println(" = " + fact);
		
		sc.close();
	}

}
