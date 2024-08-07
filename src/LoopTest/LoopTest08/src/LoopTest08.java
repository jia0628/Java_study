import java.util.Scanner;

// 문제) 밑변의 길이를 입력하여, 직각 이등변 삼각형을 출력하시오.
// 우상변이 직각인 직각 이등변 삼각형
// 밑변 길이 입력: 5
// *****
//  ****
//   ***
//    **
//     *
public class LoopTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();
		
		// 1번
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// for문 끝
		*/
		
		// 2번 - if문으로 해결
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}// for문 끝
		
		sc.close();
	}

}
