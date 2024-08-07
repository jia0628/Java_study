
/*
 try ~ catch ~ finally
 - try: 예외가 발생할 수 있는 코드를 적음
 - catch: 예외가 발생했을 때 처리 코드를 적음
 - finally: 예외의 발생 유무와 상관없이 항상 실행되는 코드를 적음

1. try ~ catch: 필수 블럭
2. finally: 선택 블럭
3. 나머지 처리

 - 예외가 발생하지 않았을 때: try -> finally -> 나머지 처리
 - 예외가 발생했을 때: try -> catch -> finally -> 나머지 처리
*/

// 문제) 학생 배열의 총점과 평균을 구하는 프로그램에서 예외가 발생되는 부분을 찾아서,
// 예외를 처리하여 정상적으로 실행되도록 구현하시오.   
public class ExceptionHandlingTest02 {
	public static void main(String[] args) {
		int[] scores = {95, 88, 75, 66, 82};
		int tot = 0;
		double ave = 0.0;
		
		/*
		for(int i=0; i<=scores.length; i++) {
			System.out.println(i+1 + "번 학생 점수: " + scores[i]);
			tot += scores[i];
		}
		ave = (double)tot / scores.length;
		*/
		
		try {
			for(int i=0; i<=scores.length; i++) {
				System.out.println(i+1 + "번 학생 점수: " + scores[i]);
				tot += scores[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage() + "번 인덱스는 없습니다.");
		} finally {
//			결과 <- 예외발생 상관 없이 항상 출력하도록 예외 처리
			ave = (double)tot / scores.length;
			System.out.println("총점: " + tot);
			System.out.println("평균: " + ave);
		}
		
	}
}
