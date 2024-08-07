import java.util.Scanner;

// 문제) 밑변의 길이를 입력하여, 직각 이등변 삼각형을 출력하시오.
// 우하변이 직각인 직각 이등변 삼각형
// 밑변 높이 입력: 5
//     *
//    **
//   ***
//  ****
// *****
public class LoopTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();
		
		/*
		for(int i=1; i<=n; i++) {  // 세로
			
			for(int j=1; j<=n-i; j++) {   // ● 공백 따로
				System.out.print(" ");
			}
			for(int j=1; j<=i ; j++) {    // ● 별표 따로(같은 라인 for문이라 k를 쓰지 않고 그대로 j 사용)
				System.out.print("*");
			}
			
			System.out.println();
		}// for문 끝
		*/
		
		// 다시 !
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				if(i+j >= 6) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}// for문 끝
		sc.close();
	}

}
