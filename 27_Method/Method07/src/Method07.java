import java.util.Scanner;

// 문제) 좌하변이 직각인 직각 이등변 삼각형을 메소드를 사용하여 출력하시오.
// 별표를 출력하는 부분을 메소드로 작성
// 메소드명: putStar
public class Method07 {
	// 정의
	static void putStar(int n) { // ● 리턴값이 없다면 void
		for(int i=1; i<=n; i++) { // 세로
			for(int j=1; j<=i; j++) {  // 가로
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("밑변 입력: ");
		int n = sc.nextInt();
		
		// 호출
		putStar(n);
		
		sc.close();
	}

}
