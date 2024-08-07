import java.util.Scanner;
// 문제1) 정수를 입력하여 짝수인지 홀수인지를 판별하시오.
// 문제2) 정수를 입력하여 3의 배수인지, 4의배수인지, 3의 배수이면서 4의 배수인지, 3의 배수도 4의 배수도 아닌지를 판별하시오.
public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		// 1. 2가지 경우
		/*
		if(n%2 == 0) {
			System.out.print(n + "은(는) 짝수입니다.");
		} else {
			System.out.print(n + "은(는) 홀수입니다.");
		}
		*/
		
		// 2. 4가지의 경우
		if(n%3==0 && n%4==0) {
			System.out.print(n + "은 3의 배수이면서 4의 배수입니다");
		} else if(n%4 == 0) {
			System.out.print(n + "은 4의 배수입니다");
		} else if(n%3 == 0) {
			System.out.print(n + "은 3의 배수입니다");
		} else {
			System.out.print(n + "은 3의 배수도 4의 배수도 아닙니다");
		}
		
		sc.close();
	}

}
