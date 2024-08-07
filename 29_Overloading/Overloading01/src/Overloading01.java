
/*
< 메서드 오버로딩(Method Overloading) >
- 메서드 중복 정의
- 메서드의 이름은 같지만, 매개변수의 개수 또는 타입을 다르게 정의하는 것
- 주의) 매개변수의 이름과 리턴타입은 오버로딩에 포함되지 않음. -> ex) int a나 int x나 상관없음.

● (오버로딩 조건)
1. 함수의 이름이 같아야 한다.
2. 매개변수의 수가 달라야 한다.
3. 매개변수의 수가 같으면 자료형이 달라야한다.
4. 단, 리턴타입은 해당이 안된다.
*/
public class Overloading01 {
	
	static double add(double a, double b) {
		return a + b;
	}
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a) {
		return ++a;
	}
	static int add() {
		return 10;
	}
	
	/*
	● 에러 -> static int add(int a, int b)와 중복 정의
	매개변수가 처음에 찾아갈땐 리턴타입을 보지 않음, 돌아올때를 생각해야함.
	(매개변수의 타입과 개수가 중요.)
	*/
	/*
	static double add(int x, int y) {
		return (double)(x + y);
	}
	*/
	public static void main(String[] args) {
		
		
		//● 같은 개수, 타입의 메서드로 찾아가서 출력
		System.out.println(add(10, 20)); 
		System.out.println(add(3.5, 4.7));
		System.out.println(add(10));
		System.out.println(add());
		
	}

}
