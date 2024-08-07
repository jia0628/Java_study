package player;

/*
< 인터페이스 규칙 >
	1. 인터페이스의 메서드는 오직 추상 메서드만 존재한다. 즉, 비추상 메서드는 존재할 수 없다.
	2. 인터페이스의 추상 메서드에서는 public과 abstract를 생략할 수 있다.
	3. 인터페이스는 인스턴스를 생성할 수 없다.
	4. 인터페이스의 배열을 생성하여 다형성을 구현할 수 있다.

*/

public interface Player {
	
	/*public abstract*/ void play();
	//public void play();
	
	void stop();
	
}
