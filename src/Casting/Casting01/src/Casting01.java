// 문제) 국어, 영어, 수학 점수를 정수로 입력하여, 총점과 평균을 계산하여 출력하시오.
// kor, eng, mat, tot, ave
// 92, 93, 93

// 문제점) int형의 총점를 사용했을 때, 평균에서 소수점이 잘리는 문제점이 발현.
// 해결책1) 총점를 double형으로 바꿔서 문제를 해결 -> 총점는 int형으로 충분하지만 평균의 계산을 위해서 double로 바꾼것 -> 메모리의 낭비가 발생 ( ● 계속 쌓이면 성능↓)
// 해결책2) 총점을 나누는 정수 3을 실수 3.0으로 바꾸어 해결 -> 정수 3으로 사용하면 될 것을 실수 3.0으로 사용하여 메모리의 낭비가 발생.
// 해결책3) 평균을 계산할 때 총점을 double 캐스팅하여 문제를 해결.

// Casting(캐스팅) - 사용하는 시점에만 강제로 데이터 타입을 변환하는 것.
// 형변환, 강제 형변환
import java.util.Scanner;

public class Casting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = (double)tot / 3;  // ● 3은 4Byte의 정수(int), 3.0은 8Byte의 실수(double)
		
		//System.out.println("총점: " + tot);
		//System.out.println("평균: " + ave);
		//System.out.printf("평균: %6.2f", ave);
		
		System.out.printf("총점: %d\n평균: %.2f", tot, ave);
		
		sc.close();
	}

}
