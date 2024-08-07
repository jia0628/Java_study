
// 문제) scores 배열에는 학생 5명의 국어, 수학, 영어 점수가 지정되어 있다.
// 1. 각 학생의 총점과 평균을 저장하여 학생 데이터와 함께 출력하시오.
// 2. 평균은 소수점 2째 자리로 반올림하여 출력하시오.
// 3. 각 학생의 학점과 석차를 저장하여 학생 데이터와 함께 출력하시오.
public class Array2d02 {
	public static void main(String[] args) {
		int[][] scores = new int[][] {
				{93, 93, 92, 0},
				{85, 85, 96, 0},
				{71, 71, 72, 0},
				{68, 68, 67, 0},
				{83, 83, 82, 0},
		};
		
		double[] ave = new double[scores.length];
		int[] tot = new int[scores.length];
		char grade;
		//String[] grd2;
		
		
		//총점
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				scores[i][3] = scores[i][0]+scores[i][1]+scores[i][2];
			}
		}
		
		//평균, 학점
		for(int i=0; i<scores.length; i++) {
			ave[i] += (double)scores[i][3] / 3;
			
			switch((int)ave[i] / 10) {
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F'; break;
			}
			//grd2[i] += grade;
		}
		
		// 석차
		for(int i=0; i<scores.length; i++) {
			tot[i] = 1;
			for(int j=0; j<scores.length; j++) {
				if(scores[i][3] < scores[j][3]) {
					++tot[i];
				}
			}
			System.out.printf("%d번  학생의 국어점수:%d  수학 점수:%d  영어 점수:%d  총점:%d  평균: %.2f  석차: %d\n", i+1, scores[i][0], scores[i][1], scores[i][2], scores[i][3], ave[i], tot[i]);
		}
		
		
	}

}
