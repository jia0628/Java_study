
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// charAt(인덱스): 인덱스에 해당하는 한 문자
		System.out.println(s1.charAt(6));    // J
		
		// indexOf("문자열"): 지정한 문자열의 인덱스 -> charAt와 반대
		System.out.println(s1.indexOf("J"));    // 6
		System.out.println(s1.indexOf("Java")); // 6, 첫 시작하는 인덱스로 찍힘
		System.out.println(s1.indexOf("java")); // -1: 문자열의 인덱스로는 존재할 수 없는 값 -> 해당 문자열을 찾지 못했다
		System.out.println("---------------------");
		
		// lastIndexOf("문자열"): 문자열의 끝에서부터 찾았을 때 먼저 찾은 지정한 문자열의 인덱스
		String s2 = "Hello Java Hello Java Hello Java";
		System.out.println(s2.indexOf("Java"));     // 6, 제일 앞에 있는 Java의 인덱스 시작점을 찍어줌
		System.out.println(s2.lastIndexOf("Java")); // 28, 제일 뒤에 있는 Java의 인데스 시작점을 찍어줌
		System.out.println("---------------------");
		
		// indexOf("문자열", 찾는 시작인덱스)
		System.out.println(s2.indexOf("Java"));    // 6
		System.out.println(s2.indexOf("Java", 7)); // 17, 7번 이후로 Java를 찾으라는 뜻
		System.out.println("---------------------");
		
		// lastIndexOf("문자열", 찾는 끝인덱스)
		System.out.println(s2.lastIndexOf("Java"));      // 28
		System.out.println(s2.lastIndexOf("Java", 7));   // 6 -> 0 ~ 7 인덱스의 사이에서 마지막 문자열
		System.out.println(s2.lastIndexOf("Java", 18));  // 17 -> 0 ~18 인덱스의 사이에서 마지막 문자열
		
	}
}
