
public class StringTest15 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);      // false -> 참조를 비교하기 때문에 같지 않음
		System.out.println(s1.equals(s2)); // true -> 값을 비교함
		System.out.println("-------------");
		
		// String클래스의 hashCode() 메서드는 값을 비교하도록 오버라이딩함
		// 인스턴스는 다르지만, 같은 해시코드가 나옴.
		System.out.println(s1.hashCode()); // 64578
		System.out.println(s2.hashCode()); // 64578
		System.out.println("-------------");
		
		// identityHashCode() 메서드는 인스턴스의 원래 해시코드를 출력
		// 인스턴스가 다르면, 원래의 해시코드를 다르게 출력함
		System.out.println(System.identityHashCode(s1)); // 1829164700
		System.out.println(System.identityHashCode(s2)); // 2018699554
		System.out.println("-------------");
		
		// intern(): 값이 같은 인스턴스가 각각 존재할 때, 하나의 인스턴스를 참조하도록 하는 메서드 (많이 안씀)
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println(s1.hashCode()); // 64578
		System.out.println(s2.hashCode()); // 64578
		System.out.println(System.identityHashCode(s1)); // 1311053135
		System.out.println(System.identityHashCode(s2)); // 1311053135
		
	}
}
