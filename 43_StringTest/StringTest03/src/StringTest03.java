import java.util.Scanner;

//● equals() 메서드 ★
public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력1: ");
		String s1 = sc.next();
		System.out.print("문자열 입력2: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-----");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-----");
		
		// 1. 문자열 비교: ==
		// -> 잘못된 방법, 참조를 비교하므로, 항상 다르다고 판별한다. (각기 다른 인스턴스를 만들기 대문)
		if(s1 == s2) {
			System.out.println("같은 문자열 입니다.");
		} else {
			System.out.println("다른 문자열 입니다.");
		}
		System.out.println("-----");
		
		// 2. 문자열 비교: equals() 메서드 ★
		// -> 옳은 방법, Object의  equals() 메서드를 String 클래스에서 값을 비교하도록 오버라이딩함.
		// Object의 클래스의 equals() 메서드는 참조를 비교함.
		if(s1.equals(s2)) {
			System.out.println("두 개의 문자열은 같습니다.");
		} else {
			System.out.println("두 개의 문자열은 다릅니다."); 
		}
		System.out.println("-----");
		
		// 3. 문자열 비교: 대소문자를 구분하지 않고 비교 -> equalsIgnoreCase() ★
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("두 개의 문자열은 대소문자 구분없이 같습니다.");
		} else {
			System.out.println("두 개의 문자열은 대소문자 구분없이 다릅니다.");
		}
		
		
		
		sc.close();
	}
}
