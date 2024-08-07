
class A {}            // 부모
class B extends A {}  // 자식

public class ExceptionTest01 {
	public static void main(String[] args) {
		// 1. ArithmeticException / by zero
		// - 0으로 나누어서 발생하는 예외
//		int a = 10, b = 0, c;
//		c = a / b;
		
		// 2. ClassCastException
		// - 다운 캐스팅을 할 때 발생하는 예외
		// 업 캐스팅 (Up Casting): 자식을 부모로 캐스팅 하는 것, 항상 가능
		// 다운 캐스팅 (Down Casting): 부모를 자식으로 캐스팅 하는 것, 불가능한 경우가 대부분
//		A a = new A();
//		B b = (B)a;  // 다운 캐스팅 장면
		
		// 3. ArrayIndexOutOfBoundsException
		// - 배열의 인덱스 범위를 벗어나서 접근하는 경우 발생하는 예외
//		int[] a = new int[] {10, 20, 30};
//		for(int i=0; i<=a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		// 4. NumberFormatException
		// - 숫자를 포매팅할 때 잘못하여 발생하는 예외
//		int num = Integer.parseInt("10.5");
		
		// 5. NullPointerException
		// - 널포인터에 접근할 때 발생하는 예외
		String str = null;
		System.out.println(str.charAt(0));
		
	}
}
