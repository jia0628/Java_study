
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// replace("이전(원래) 문자열", "변경할 문자열"): 이전 문자열을 변경할 문자열로 모두 다 바꿈
		System.out.println(s1.replace("!", "??")); // Hello Java World?? -> !를 ??로 변경(실제로 바뀐건 아님, 출력할때만 잠시)
		System.out.println(s1);
		System.out.println("---------------------");
		
		s1 = s1.replace("!", "??"); // 대입해서 바꾸면 실제로도 바뀜
		System.out.println(s1);
		System.out.println("---------------------");
		
		// replace("이전(원래) 문자열", "변경할 문자열"): 일치하는 모든 문자열을 변경
		// - 정규식을 적용할 수 없음
		String s2 = "Hello Java Hello Java Hello Java";
		s2 = s2.replace("Java", "Oracle");
		System.out.println(s2); // Hello Oracle Hello Oracle Hello Oracle
		System.out.println("---------------------");
		
		// replaceFirst("이전(원래) 문자열", "변경할 문자열"): 이전 문자열에서 첫번째 문자열만 변경할 문자열로 바꿈
		// - 정규식을 사용할 수 있음.
		String s3 = "Hello Java Hello Java Hello Java";
		s3 = s3.replaceFirst("Java", "Oracle");
		System.out.println(s3);
		System.out.println("---------------------");
		
		// replaceAll("이전(원래) 문자열", "변경할 문자열"): 이전 문자열을 변경할 문자열로 모두 다 바꿈
		// -> 정규 표현식(Regular Experssion)을 활용하여 문자열을 변경할 수 있음.
		String s4 = "Hello Java Hello Java Hello Java";
		s4 = s4.replaceAll("Java", "Oracle");
		System.out.println(s4);
		System.out.println("---------------------");
		
		// [0-9]: 0~9까지의 정수
		String s5 = "새로 나온 갤럭시 S24 울트라의 가격은 1,650,000원입니다.";
		String str = s5.replaceAll("[0-9]", "*");
		System.out.println(str);
	}
}
