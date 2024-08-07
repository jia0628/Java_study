import java.util.Scanner;

// Method08의 응용
//문제) 좌하변이 직각인 직각 이등변 삼각형을 메소드를 사용하여 출력하시오.
//기호를 입력하고 입력한 기호의 좌하변이 직각인 이등변 삼각형을 출력
//메소드명: putChar
public class Method09 {
	static void putChar(char c, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(c + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("기호 입력: ");
		//● .next(); -> 문자열  / .next().charAt(); -> 한 문자만 입력 받기
		char c = sc.next().charAt(0);
						
		System.out.print("길이 입력: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			putChar(c, i+1); //● 매개변수의 개수가 같아야 한다!!
			System.out.println();
		}
		
		
		sc.close();
	}
}
