import java.util.Scanner;

// 문제) 국어, 영어, 수학 점수를 정수로 입력하여, 총점, 평균, 평균에 대한 학점을 출력하시오.
// 학점은 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 미만은 F로 설정하시오.
// 국어, 영어, 수학, 총점은 정수형 변수, 평균은 실수형 변수, 학점은 문자형 변수를 사용하시오.
// 평균은 소수점 2째자리까지 반올림하여 출력하시오.
public class If03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = (double)tot / 3;
		char grade;  // ● 학점을 넣을 변수 지정
		
		if(ave >= 90) {
			grade = 'A';
		} else if(ave >= 80) {
			grade = 'B';
		} else if(ave >= 70) {
			grade = 'C';
		} else if(ave >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("총점: %d\n평균: %.2f\n학점: %s\n", tot, ave, grade);
		
		sc.close();
	}

}
