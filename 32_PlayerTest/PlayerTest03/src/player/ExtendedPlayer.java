package player;

//● 인터페이스끼리는 상속받는다
public interface ExtendedPlayer extends Player {

	// 추상 메서드
	void fast();  // 빠르게 보기
	
	void slow();  // 느리게 보기
}
