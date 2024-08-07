import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		// 콘솔로부터 값을 입력하는 클래스
		Scanner sc = new Scanner(System.in); // ● 입력 스트림
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		
		System.out.println("a = " + a); // ● 출력 스트림
		
		sc.close();
	}

}
