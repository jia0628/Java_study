import java.util.Scanner;

// 문제) x와 y승을 구하는 프로그램을 작성하시오.
// 메소드명: calcPower
// < 입력 화면 설계 >
// x값 입력(실수): 3.0
// y값 입력(정수): 3
// < 출력 화면 설계 >
// 3.0의 3승은 27.0입니다.
public class Method03 {
	
	// 정의
	//● 리턴값의 power가 double형
	static double calcPower(double x, int y) {
		//● LoopTest13 참고
		double power = 1;
		for(int i=0; i<y; i++) {  //● 입력받은 y만큼 곱하기에 횟수가 y번이 된다.
			power *= x;
		}
		return power;
	}

	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("x값 입력(실수): ");
		double x = sc.nextDouble();
		System.out.print("y값 입력(정수): ");
		int y = sc.nextInt();
		
		// 호출
		double power = calcPower(x, y);
		
		// 출력
		System.out.printf("%.5f의 %d승은 %.5f입니다.", x, y, power);
		
		sc.close();
	}

}
