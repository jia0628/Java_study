
// ★ StringBuffer가 무엇인지
public class StringBufferTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(System.identityHashCode(s1)); // 1829164700
		System.out.println("-------------");
		
		
		//s1 = s1.concat("DEF");
		s1 += "DEF";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(System.identityHashCode(s1)); // 2018699554
		System.out.println("-------------");
		
		// String 클래스의 문제점: String 클래스는 값을 추가하거나, 삭제할 때 인스턴스를 변경한다.
		// String 클래스는 값을 추가하기 전의 해시코드와 값을 추가한 후의 해시코드가 다르다.
		// String 클래스의 특성: immutable한 특성, 변할 수 없는 특성 (매번 인스턴스를 새롭게 만든다)
		
		// String 클래스의 보완: StringBuffer 클래스를 사용하면,
		// 문자열의 값을 추가 또는 삭제 시에 기존의 인스턴스를 증가, 감소하게 되어 인스턴스를 변경하지 않아도 된다.
		// StringBuffer 클래스의 특성: mutable한 특성, 변할 수 있는 특성 (자신의 값을 그대로 늘리고 줄인다)
		
		//● StringBuffer 클래스: 문자열 클래스를 더 보완하기 위해 사용, 문자열을 추가&삭제할 때 사용
		//● StringBuffer 클래스 -> 더 보완하는 클래스지 문자열 클래스는 아니다
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 1311053135
		
		// sb += "DEF"; // 에러, 배열이 아니라서 안된다
		sb.append("DEF");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 1311053135
		
		
	}
}
