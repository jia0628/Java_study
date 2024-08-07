
public class StringTest05 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";  // 17글자, 배열: ~16번째

		// length() : 문자열의 길이
		System.out.println("글자수: " + s1.length());  // 17
		
		// charAt(인덱스): 인덱스에 해당하는 한 문자
		System.out.println(s1.charAt(6));             // 6번째 인덱스: J, 인덱스에 해당하는 문자를 구함.
		
		// concat(): 두 개의 문자열을 연결, + 연산자와 같은 역할
		System.out.println(s1.concat("korea"));       // 문자열 + 문자열 (실제로 바뀐건 아님)
		System.out.println(s1);
		System.out.println("---------------------");
		
		s1 = s1.concat("korea"); // 대입해서 합치면 실제로도 바뀜
		System.out.println(s1);
		System.out.println("---------------------");
		
		String s2 = "Hi! ";
		System.out.println(s2 + s1); // 출력할때만 합쳐져서 나옴
		System.out.println(s2);      // Hi! Hello Java World!korea

		s2 += s1;                    // 대입하면 실제 s2가 바뀜
		System.out.println(s2);     
	}
}
