import java.util.Scanner;

// 문제) 밑변의 길이를 입력하여 직각삼각형을 출력하시오.
// 밑변 길이 입력: 5
// *
// **
// ***
// ****
// *****
public class LoopTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) { // 세로(행)
			for(int j=1; j<=i; j++) { // 가로(열) -> i만큼 증가한다
				System.out.print("*");
			}
			System.out.println();
		}// for문 끝
		
		sc.close();
	}

}
