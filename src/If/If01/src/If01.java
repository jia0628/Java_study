import java.util.Scanner;

// 문제1) 정수를 입력하여, 양수인지를 판별하시오.
// 문제2) 정수를 입력하여, 양수인지 음수인지를 판별하시오.
// 문제3) 정수를 입력하여, 양수인지 음수인지 0인지를 판별하시오.
public class If01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		// 1. 조건이 1개일 때
		/*
		if(n>0) {
			System.out.print(n + "은(는) 양수 입니다.");
		}
		*/
		
		// 2. 조건이 2개일 때
		/*
		if(n>0) {
			System.out.print(n + "은(는) 양수 입니다.");
		} else {
			System.out.print(n + "은(는) 음수 입니다.");
		}
		*/
		
		// 3. 조건이 3개일 때
		if(n>0) {
			System.out.print(n + "은(는) 양수 입니다.");
		} else if(n<0) {
			System.out.print(n + "은(는) 음수입니다.");
		} else {
			System.out.print(n + "입니다.");
		}
		
		sc.close();
	}

}
