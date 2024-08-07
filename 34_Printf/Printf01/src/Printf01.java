
public class Printf01 {
	public static void main(String[] args) {
		/*
		System.out.print("출력하고, 줄바꿈 없음");
		System.out.println("출력하고, 줄바꿈함");
		System.out.println("줄바꿈");
		*/
		
		// printf(형식문자를 사용한 형식 지정, 변수 또는 상수): f(format, 형식), 데이터 타입의 따른 형식을 지정하여 출력하는 메소드
		// 서식문자(형식문자): 데이터타입에 따라 다른 형식의 문자를 지정함. %다음에 데이터타입에 따른 문자를 사용함.
		// 정수: %d, decimal
		// 실수: %f, float
		// 문자: %c, character
		// 문자열: %s, string
		int a = 34567, b = 11111;
		
		// 1. 정수 출력 포맷
		System.out.printf("%d\n", a);
		System.out.printf("%d\n", b);
		System.out.printf("%d %d\n", a, b);
		System.out.printf("%7d\n",a);     // 오른쪽 맞춤
		System.out.printf("%-7dA\n", a);  // 왼쪽 맞춤
		
		// 2. 실수 출력 포맷
		double c = 3.141592, d = 3.14;
		// ● 소수점 자리수 지정은 %.지정할 소수점 자리수f
		System.out.printf("%f\n", c);
		System.out.printf("%f\n", d);     // 3.140000 -> 기본 소수점 6째 자리까지 출력
		System.out.printf("%.4f\n", c);   // 3.1416
		System.out.printf("%.2f\n", d);   // 3.14
		System.out.printf("%6.2f", c);    // 전체 자리: 6자리, 소수점 이하: 2자리
		System.out.printf("%-6.2fA\n", c);
		
		// 3. 문자 출력 포맷
		char e = 'A' + 1;
		System.out.printf("%c\n", e);
		System.out.printf("%5c\n", e);
		System.out.printf("%-5c*\n", e);
		System.out.printf("%d\n", (int)e);  // 캐스팅
		
		// 4. 문자열 출력 포맷
		String s = "hello";
		System.out.printf("%s\n", s);
		System.out.printf("%10s\n", s);
		System.out.printf("%-10s*\n", s);
		
		// 5. 8진수(octal), 16진수(hexadecimal)
		int x = 9, y = 15;
		System.out.printf("%d, %o, %x\n", x, x, x);
		System.out.printf("%d, %o, %x\n", y, y, y);
		
		// 6. printf() 메소드에서 특별한 문자를 출력하는 방법
		// 표식 문자: \n: 줄바꿈, \t: tab, \b: backspace, \a: alram ...
		
		// "Hello" 출력
		a = 7;
		System.out.printf("%d\"Hello\"\n", a);  // ● \앞의 문자는 한번 출력
		// 'Hello' 출력
		System.out.printf("%d\'Hello\'\n", a);
		// c:\temp 출력 -> c:\\temp
		System.out.printf("%d, c:\\temp\n", a);
	}

}
