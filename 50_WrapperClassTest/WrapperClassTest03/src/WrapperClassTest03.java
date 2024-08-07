import java.util.StringTokenizer;

// 문제) 학생들의 점수를 담은 문자열 str을 사용하여 학생수, 총점, 평균을 구하시오.
public class WrapperClassTest03 {
	public static void main(String[] args) {
		String str = "85/88,72|91-56,73/66,87/68,95";
		int cnt = 0;
		int tot = 0;
		double ave = 0;
		
		// 1번 방법 - split(), replaceAll() 메서드 활용
		
		// replaceAll 정규식 활용
		String s1 = str.replaceAll("[/,|-]", ",");

		// 다시 잘라서 배열 생성
		String[] scores = s1.split(",");
		
		// 학생수, 총점, 평균
		for(int i=0; i<scores.length; i++) {
			tot += Integer.parseInt(scores[i]);
		}
		
		cnt = scores.length;
		ave = (double)tot / scores.length;
		
		// 출력
		System.out.printf("총 학생수: %d\n총점: %d\n평균: %.2f\n", cnt, tot, ave);
		System.out.println("--------------");
		
		
		// 2번 방법 - StringTokenizer 클래스 사용
		str = "85/88,72|91-56,73/66,87/68,95";
		cnt = 0;
		tot = 0;
		ave = 0;
		
		StringTokenizer st = new StringTokenizer(str, "/|-,");
		System.out.println("토큰 개수" + st.countTokens());
		
		//★ 토큰의 개수를 미리 구해 넣어둬야함, 반복문을 돌면 토큰은 사라짐
		cnt = st.countTokens();
		
		while(st.hasMoreTokens()) {
			tot += Integer.parseInt(st.nextToken());
		}
		
		//● 반복문을 다 돌고나면 .countTokens()은 0이 되어 버린다
//		cnt = st.countTokens();
//		ave = (double)tot / st.countTokens();
		
		ave = (double)tot / cnt;
		
		System.out.printf("총 학생수: %d\n총점: %d\n평균: %.2f\n", cnt, tot, ave);
		
	}
}
