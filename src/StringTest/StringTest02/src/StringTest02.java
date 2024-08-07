
//● 새 인스턴스를 만들어 참조 -> 거의 안쓰는 방법
public class StringTest02 {
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("------");
		
		// 해시코드(hashCode): String 클래스의 hashCode() 메서드는 인스턴스가 아니라 값에 대하여 비교하도록 오버라이딩 해놓았다.
		//● String클래스에서 해시코드는 인스턴스 자체가 아닌 그 안에 값을 비교한다
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("-----");
		
		// System.identityHashCode(): 실제 인스턴스의 해시코드 값을 출력
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
	}
}
