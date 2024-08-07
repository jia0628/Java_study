
public class WrapperClassTest02 {
	public static void main(String[] args) {
		// 기본형, 객체형의 사용과 비교
		Integer ii = new Integer(100); // 객체형
		String s = "100";              // 문자열, 객체형
		
		int i1 = ii.intValue();          // 언박싱,         객체 -> 정수
		int i2 = ii;                     // 오토언박싱(추천), 객체 -> 정수
		int i3 = Integer.parseInt(s);    // 문자열 -> 정수, valueOf()보다는 parseInt()를 더 많이 사용함.
		Integer i4 = Integer.valueOf(s); // 문자열 -> 객체
		
		// parseInt() 활용법
		// 1번 - 2진수, 8진수, 16진수와 10진수의 변환에 사용
		System.out.println(Integer.parseInt("100", 2));  // 2진수 100의 10진수 값 -> 4
		System.out.println(Integer.parseInt("100", 8));  // 8진수 100의 10진수 값 -> 64
		System.out.println(Integer.parseInt("100", 16)); // 16진수 100의 10진수 값 -> 256
		System.out.println(Integer.parseInt("ff", 16));  // 16진수 ff의 10진수 값 -> 255
		
		// 2번 - 10진수를 2진수, 8진수, 16진수의 변환에 사용
		// 47(18) : 00101111(2)
		System.out.println(Integer.toBinaryString(47)); // 101111, 10진수 -> 2진수
		System.out.println(Integer.toOctalString(47));  // 57, 10진수 -> 8진수
		System.out.println(Integer.toHexString(47));    // 2f, 10진수 -> 16진수
		System.out.println(Integer.toHexString(255));   // ff, 10진수 -> 16진수
	}
}
