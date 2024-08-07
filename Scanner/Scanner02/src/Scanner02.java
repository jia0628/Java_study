import java.util.Scanner;

// 문제) 원의 반지름을 정수로 입력하여 원의 둘레와 원의 면적을 구하시오.
// 원주율은 3.141592의 상수를 사용하시오.
public class Scanner02 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;  // ● 상수는 제일 먼저, 상수 이름이 길 경우 _ 사용 ex) MAX_SCORE
		
		// 입력
		System.out.print("반지름 입력: ");
		int radius = sc.nextInt(); // ● nextInt (상수 입력 받기), nextDouble (실수), next (문자열)
		
		//계산
		double perimeter = 2 * PI * radius;
		double area = PI * radius * radius;
		
		// 출력
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);
		
		// 끝
		sc.close();
	}

}
