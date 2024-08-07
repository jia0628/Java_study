package player;

//● 해석: Player인터페이스를 구현한다
public class VideoPlayer implements Player {
	// 클래스 변수
	private static int count = 0;
	
	// 인스턴스 변수
	private int id;
	
	// 생성자
	public VideoPlayer() {
		this.id = ++count;  //● 같은 멤버여도 this.를 붙일 수 있는건 인스턴스 변수(클래스 변수는 안된다)
	}
	
	// 오버라이딩
	@Override
	public void play() {
		System.out.println("■ 비디오 플레이어 재생 ###");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 플레이어 중지 ###");
	}
	
	// getter
	public static int getCount() {
		return count;
	}
	
	public int getId() {
		return id;
	}
	
	// 제조 번호 출력 메서드
	public void printInfo() {
		System.out.println("□ 제조번호: " + id);
	}
	
	
}
