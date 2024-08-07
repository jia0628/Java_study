import java.util.Scanner;

// 문제) 너비와 높이를 각각 입력하여, 평행사변형을 출력하시오.
// 너비 입력: 7
// 높이 입력: 4
// < 출력 화면 설계 >
//    *******
//   *******
//  *******
// *******

public class LoopTest14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("너비 입력: ");
		int w = sc.nextInt();
		
		System.out.print("높이 입력: ");
		int h = sc.nextInt();
		
		/*
		for(int i=1; i<=h; i++) {      // 세로 -> 높이
			for(int j=1; j<=w+3; j++) {   // 가로 -> 너비
				if(i+j >= 5 && i+j <=11) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}// for문 끝
		*/
		
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
