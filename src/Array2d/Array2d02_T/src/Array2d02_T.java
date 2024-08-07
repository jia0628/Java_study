
// (선생님 풀이)

// 문제) scores 배열에는 학생 5명의 국어, 수학, 영어 점수가 지정되어 있다.
// 1. 각 학생의 총점과 평균을 저장하여 학생 데이터와 함께 출력하시오.
// 2. 평균은 소수점 2째 자리로 반올림하여 출력하시오.
// 3. 각 학생의 학점과 석차를 저장하여 학생 데이터와 함께 출력하시오.
public class Array2d02_T {
	public static void main(String[] args) {
		int[][] scores = new int[][] {
				{93, 93, 92, 0, 0},  // 국어, 수학, 영어, 총점, 석차
				{85, 85, 86, 0, 0},
				{71, 71, 72, 0, 0},
				{68, 68, 67, 0, 0},
				{83, 83, 82, 0, 0},
		};

		double[] aves = new double[scores.length];
		String[] grds = new String[scores.length]; //● 학점의 배열
		
		//총점
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<3; j++) { //● 3 -> 0, 1, 2만 돌아가게 함
				scores[i][3] += scores[i][j]; //● 더해서 누적
			}
		}
		
		//석차
		//● 석차와 선택정렬때는 i는 나 자신, j는 상대방이라 생각해야함
		for(int i=0; i<scores.length; i++) {
			scores[i][4] = 1;
			for(int j=0; j<scores.length; j++) { //● 상대방도 똑같이 학생 수만큼 돌아야 하니까 scores[i].length가 아님
				if(scores[i][3] < scores[j][3]) { //● 상대방 총점보다 더 작다면
					++scores[i][4];  //● 내가 하나씩 밀린다
				}
			}
		}
		
		//평균
		for(int i=0; i<scores.length; i++) {
			aves[i] = (double)scores[i][3] / 3;
		}
		
		//학점
		for(int i=0; i<scores.length; i++) {
			switch((int)aves[i] / 10) {
			case 10: case 9: grds[i] = "A"; break;
			case 8: grds[i] = "B"; break;
			case 7: grds[i] = "C"; break;
			case 6: grds[i] = "D"; break;
			default: grds[i] = "F"; break;
			}
		}
		//타이틀 출력 따로
		String[] titles = new String[] {"Korean", "Math", "English", "Total", "Rank", "Average", "Grade"}; 
		for(int i=0; i<titles.length;i++) {
			System.out.printf("%8s | ", titles[i]);
		}
		System.out.println();
		
		//라인
		for(int i=0; i<7; i++) {
			System.out.print("-----------");
		}
		System.out.println();
		
		//출력
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%8d | ", scores[i][j]);
			}
			System.out.printf("%8.2f | %8s |\n", aves[i], grds[i]); //● 평균, 학점은 따로 붙임
		}
		
		
		
	}
}
