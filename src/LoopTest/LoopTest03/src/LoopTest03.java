import java.util.Scanner;

// 문제) 너비를 정수로 입력하여 정사각형을 출력하시오. 
public class LoopTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("너비 입력: ");
		int w = sc.nextInt();
		
		for(int i=1; i<=w; i++) {
			for(int j=1; j<=w; j++) {
				System.out.print("*"); // 열
			}
			System.out.println(); // 행
		}// for문 끝
		
		sc.close();
	}

}
