import java.util.Scanner;

// Method07의 응용
public class Method08 {
	
	static void putStar(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			putStar(i+1);
			System.out.println();
		}
		
		sc.close();
	}

}
