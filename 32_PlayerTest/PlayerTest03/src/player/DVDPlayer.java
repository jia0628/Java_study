package player;

//● ExtendedPlayer 인터페이스를 구현한다
public class DVDPlayer implements ExtendedPlayer {

	// 오버라이딩 - 추상 메서드 4개
	@Override
	public void play() {
		System.out.println("▶ DVD 플레이어 재생 ~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("▷ DVD 플레이어 중지!");
	}
	
	@Override
	public void fast() {
		System.out.println("▶▶ DVD 플레이어 2배속 보기 ~~~");
	}
	
	@Override
	public void slow() {
		System.out.println("▷▷ DVD 플레이어 느리게 보기 ~~~");
	}
	
}
