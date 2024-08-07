import java.util.Scanner;

// Method07, Method09 참고
public class Method09_1 {
	static void putChar(char c, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("기호 입력: ");
		char c = sc.next().charAt(0);
		
		System.out.print("길이 입력: ");
		int n = sc.nextInt();
		
		//호출
		putChar(c, n);
		
	}

}
