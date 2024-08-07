package player;

//● 해석: Player인터페이스를 구현한다
public class CDPlayer implements Player { //● implements -> 구현한다
	
	// 오버라이딩
	@Override
	public void play() {  //● 접근 제한자가 public이라는 거 잊지 말고 메서드 오버라이딩 하기
		System.out.println("◎ CD 플레이어 재생 ~~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◎ CD 플레이어 중지!");
	}
	
	// CD 플레이어 청소 메서드
	public void clean() {
		System.out.println("● CD 플레이어 헤드를 청소합니다.");
	}
	
	
}
