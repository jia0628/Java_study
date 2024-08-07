/*
< Wrapper Class >
- Byte, Short, Integer(★), Long, Float, Double(★), Character, Boolean 8개의 클래스를 통칭
- 8개의 클래스 기본 데이터타입 8가지에 대응되는 클래스

Wrapper Class의 사용 목적
1. 8가지의 기본 데이터타입을 객체의 세상에서도 사용하기 위함.
2. 문자열의 데이터를 원래의 기본 데이터타입으로 바꿔서 사용하기 위함.

 */

// 박싱(Boxing): 기본형의 데이터를 객체형의 데이터로 만드는 것
// 언박싱(UnBoxing): 객체형의 데이터를 기본형의 데이터로 만드는 것
// 오토박싱(Auto-Boxing): 기본형의 데이터를 객체형의 데이터로 만들 때 바로 대입하여 만드는 것
// 오토언박싱(Auto-UnBoxing): 객체형의 데이터를 기본형의 데이터로 만들 때 바로 대입하여 만드는 것

public class WrapperClassTest01 {
	public static void main(String[] args) {
		// ## 박싱, 언박싱 방법 1
		int i = 10;                   // 기본형
		Integer ii = new Integer(i);  // 객체형, ● 박싱(Boxing) -> 객체형이 기본형을 감싼 모양, 자바 lang패키지에 있어서 import할 필요가 X
		
		int i2 = ii.intValue();       //● 언박싱(UnBoxing) -> 다시 뜯어놓는것
		System.out.println(i2);       
		System.out.println("-------");
		
		// ## 박싱, 언박싱 방법 2 (추천)
		int j = 10;         // 기본형
		Integer jj = j;     // 객체형, ● 오토박싱(Auto-Boxing) = 자동박싱
		
		int j2 = jj + 10;   //● 오토언박싱(Auto-UnBoxing) = 자동 언박싱
		System.out.println(j2);
		System.out.println("-------");
		
		
		// ## 박싱, 언박싱 -> 문자열
		String s1 = "10";            //● 정수 10이 문자열 형태로 박싱이 되어 있음
		System.out.println(s1 + 20); // 1010
		//System.out.println(s1 - 10); // 에러
		
		int a = Integer.parseInt(s1) + 20;  //● 10을 언박싱하여 20과 더하는 장면
		System.out.println(a);              // 30
		
		String s2 = "3.5";            //● 실수 3.5가 문자열 형태로 박싱이 되어 있음
		System.out.println(s2 + 4.3); // 3.54.3
		
		double b = Double.parseDouble(s2) + 4.3; //● 3.5를 언박싱
		System.out.println(b);                   // 7.8
		
//		String s3 = "1,000";                //● ,가 있으므로 이건 숫자가 아니고 문자열, 박싱 불가
//		int c = Integer.parseInt(s3) + 500; // 에러 발생, java.lang.NumberFormatException
//		System.out.println(c);
		
		String s4 = "100";
		double d = Double.parseDouble(s4) + 5.5; // 정수 -> 실수로 변경하는 과정은 문제가 없다
		System.out.println(d);                   // 105.5
		
//		String s5 = "5.5";
//		int e = Integer.parseInt(s5) + 3; // 에러 발생, java.lang.NumberFormatException
//		System.out.println(e);            // 실수 -> 정수로 변경하는 것은 불가능하다
		
//		double s6 = 3.5;
//		int f = Integer.parseInt(s6) + 16; // 에러, js와 달리 캐스팅하는 용도로는 사용 불가
		System.out.println("-------");
		
		
		
		
		
	}
}
