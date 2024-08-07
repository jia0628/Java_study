import java.util.Scanner;

// 문제) 밑변의 길이를 입력하여, 직각삼각형을 출력하시오.
// 좌상변이 직각삼각형
// 밑변 길이 입력: 5
// *****
// ****
// ***
// **
// *
public class LoopTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {  // 세로
			for(int j=n; j>=i; j--) { // 가로
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// for문 끝
		*/
		/*
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		sc.close();
	}

}
