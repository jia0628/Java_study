import java.util.Scanner;

public class ExceptionHandlingTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		
		/*
//		1. 예외 발생
		int quotient = a / b;  // 이 부분이 문제
		int remainder = a % b;
		
//		결과 <- 예외가 발생하더라도 정상적인 처리가 되어야 한다
		System.out.println("몫      : " + quotient);
		System.out.println("나머지: " + remainder);
		*/
		
//		예외 처리: try ~ catch로 해결, 함께 사용.
//		try 블럭: 예외가 발생할 수 있는 코드 적용.
//		catch 블럭: 예외가 발생했을 때의 처리 코드를 적용.
//		예외가 발생하지 않았을 때: try -> 나머지 내용 처리
//		예외가 발생했을 때: try -> catch -> 나머지 내용 처리
		int quotient = 0;
		int remainder = 0;
		
		try {
			quotient = a / b;
			remainder = a % b;
		} catch(ArithmeticException e) {
			e.printStackTrace();
//			System.err.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");  //● System.err -> 빨간색으로 표시
		}
		
		System.out.println("몫      : " + quotient);
		System.out.println("나머지: " + remainder);
		
		sc.close();
	}
}
