import java.util.Scanner;

// 문제) 국어, 영어, 수학 점수를 입력하여, 총점, 평균, 학점을 계산하시오.
// 학점 부분을 switch문으로 작성하시오.
// 정수(국어, 영어, 수학), 총점  평균(실수), 학점(문자)
public class Switch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = (double)tot / 3;
		
		char grade;
		
		switch((int)(ave/10)) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("총점: %d\n평균: %.2f\n학점: %s", tot, ave, grade);
		
		sc.close();
	}

}
