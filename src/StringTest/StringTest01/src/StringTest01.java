
//● 문자열을 직접적으로 참조
public class StringTest01 {
	public static void main(String[] args) {
		//● s1, s3, s4 다 같은 ABC를 참조한다
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		String s4 = "DEF";
		
		s4 = s1; // s4에 s1을 대입? -> 참조를 대입했다
		// 버려지는 s4의 데이터 "DEF"는 JVM이 Garbage Collector가 Garbage Collection하여
		// 낭비되는 메모리 공간을 회수하여 재활용 할 수 있게 한다.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("------");
		
		// 해시코드(hashCode): 각 인스턴스가 가지는 고유한 아이디값
		//● Object클래스의 hashCode() 메서드를 String클래스가 오버라이딩
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("------");
		
		// System.identityHashCode(): 실제 인스턴스의 해시코드 값을 출력
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}
}
