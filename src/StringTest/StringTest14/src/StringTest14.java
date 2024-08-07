
// ★
public class StringTest14 {
	public static void main(String[] args) {
		String s1 = "";   // 빈 문자열로 초기화 -> 에러는 아니지만, 문제가 발생할 가능성이 높다
		String s2 = null; // 널로 초기화 -> 아무것도 참조하지 않음 -> 에러를 발생시킴
		String s3;        // 초기화가 되지 않음
		
		// 방법 1 - 연산자 활용
		if(s1 == "") System.out.println("빈 문자열입니다.");
		
		// 방법 2 - 메서드 활용 -> 추천
		// isEmpty(): 빈 문자열인지 여부를 판별하는 메서드
		if(s1.isEmpty()) System.out.println("빈 문자열입니다."); // s1 == ""과 같음
		
		
		// 방법 1 - null은 참조를 비교해야 하므로, 연산자를 통해 비교해야함
		if(s2 == null) System.out.println("널 문자열입니다.");
		
		
		// < 에러들 >
		
		// null은 값으로 비교할 수 없음
		// if(s2.equals(null)) System.out.println("널 문자열입니다."); // NullPointerException
		
		// null은 값으로 비교할 수 없음
		//if(s2.compareTo(null) == 0) System.out.println("빈 문자열입니다."); //NullPointerException
		
		//System.out.println(s3);  // 에러, 초기화되지 않은 문자열
		
	}
}
