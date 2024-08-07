
public class Method01 {
	
	//메서드 정의
	static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int x = 10, y = 20; // 위에 a, b와 이름을 달리 해도 된다. 서로 다른 변수라
		
		int z = add(x, y); //메서드 호출(사용) 매개변수
		
		System.out.println("z = " + z);
	}
}
