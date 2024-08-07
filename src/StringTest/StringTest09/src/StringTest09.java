
public class StringTest09 {
	public static void main(String[] args) {
		// replaceAll(): 메서드의 정규식 활용
		// replaceAll("이전 문자열", "변경할 문자열"): 이전 문자열을 변경할 문자열로 모두 다 바꿈
		// -> 정규 표현식(Regular Experssion)을 활용하여 문자열을 변경할 수 있음.
		
		// [0-9]: 0~9까지의 정수를 변경
		String s1 = "새로 나온 갤럭시 S24 울트라의 가격은 1,650,000원입니다.";
		String str = s1.replaceAll("[0-9]", "*");
		System.out.println(str);
		
		// [특수문자]: 특수문자 여러개를 한꺼번에 변경
		String s2 = "Hello! Hi? * + $ & -";
		System.out.println(s2.replaceAll("[!]", "YES")); // HelloYES Hi? * + $ & -
		System.out.println(s2); // 실제로는 바뀌지 않음
		System.out.println("---------------------");
		
		str = s2.replaceAll("[!]", "YES");  // 대입해야 실제도 바뀜
		System.out.println(str);
		System.out.println("---------------------");
		
		System.out.println(s2.replaceAll("[!]", "OK"));
		System.out.println(s2.replaceAll("[?]", "OK"));
		System.out.println(s2.replaceAll("[*]", "OK"));
		System.out.println(s2.replaceAll("[+]", "OK"));
		System.out.println(s2.replaceAll("[$]", "OK"));
		System.out.println(s2.replaceAll("[&]", "OK"));
		System.out.println(s2.replaceAll("[-]", "OK"));
		System.out.println(s2.replaceAll("[!?*+$&-]", "OK")); // 한꺼번에 가능
		System.out.println("---------------------");
		
		// \\특수문자: 특수문자 한 문자를 변경
		String s3 = "This is Notebook. [LG GRAM]";
		//System.out.println(s3.replaceAll("[[]", "*")); // 에러
		System.out.println(s3.replaceAll("\\[", "*"));   // \\뒤에 있는 기호 인식
		System.out.println(s3.replaceAll("\\]", "*"));
		System.out.println(s3.replaceAll("\\[]", "*"));  // 변경되지 않음.
		System.out.println("---------------------");
		
		// .(점): 정규식에서는 모든 문자를 의미
		// replaceAll(): 정규식[]을 사용하는 메서드
		String s4 = "Hello. Java. World.";
		System.out.println(s4.replace(".", "~"));
		System.out.println(s4.replaceAll(".", "~")); // "." -> 모든 문자열을 바꿔라, "[.]" -> .만 바꿔라
	}
}
