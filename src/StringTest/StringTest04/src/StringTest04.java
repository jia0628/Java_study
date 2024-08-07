
//● null
public class StringTest04 {
	public static void main(String[] args) {
		//String s1;           //● null은 아무곳도 참조하고 있지 않다. -> 에러 (null은 중요★)
		String s1 = null;  
		String s2 = "";        //● ""은 빈문자열을 참조한다.
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("-----");
		//System.out.println(s1.hashCode()); // 에러 -> NullPointerException(= 아무곳도 참조를 못하고 있다)
		System.out.println(s2.hashCode());
		System.out.println("-----");
		System.out.println(System.identityHashCode(s2));
		
		// 문자의 배열
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o'};
		System.out.println(c);
		
		String s3 = new String(c);
		System.out.println(s3);
	}
}
