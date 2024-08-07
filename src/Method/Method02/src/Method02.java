import java.util.Scanner;

// 문제) 원의 반지름(실수)를 입력하여 원의 둘레와 원의 면적을 구하는 프로그램을 작성하시오.
// 원의 둘레와 원의 면적은 메서드를 생성하여 사용하시오.
// 메서드명: calcPerimeter, clacArea
public class Method02 {
	
	static final double PI = 3.141592; //● 전역 변수
	
	//● 생성부분
	static double calcPerimeter(double radius) {
		return 2 * PI * radius;
	}
	
	static double clacArea(double radius) {
		return PI * radius * radius;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 입력: ");
		double radius = sc.nextDouble();
	
		//● 호출부분
		double perimeter = calcPerimeter(radius);
		double area = clacArea(radius);
		
		System.out.printf("원의 둘레 = %.2f\n원의 면적 = %.2f", perimeter, area);
		
		sc.close();
	}

}
