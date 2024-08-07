import java.util.Scanner;

// 문제) 밑변을 입력하여, 정삼각형을 출력하시오.
// 밑변 길이 입력: 7
// < 출력 화면 설계 >
//    *
//   ***
//  *****
// *******
public class LoopTest15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");;;
			}
			for(int j=1; j<i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// for문 끝
		
		sc.close();
	}

}
