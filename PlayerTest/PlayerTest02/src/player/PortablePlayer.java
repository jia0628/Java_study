package player;

// 다중 구현
public class PortablePlayer implements Player, Skinnable { //● Player와 Skinnable의 인터페이스를 구현한다 (=다중 구현을 한다)

	// 오버라이딩
	@Override
	public void play() {
		System.out.println("◆ 포터블 플레이어 재생 ~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◆ 포터블 플레이어 중지 ###");
	}
	
	// 구현하고 있는 클래스이므로 Skinnable.RED에서 Skinnable을 생략할 수 있다.
	@Override
	public void changeSkin(int skin) {
		
		System.out.print("스킨을 ");
		switch(skin) {
		//● 인터페이스명.상수명 -> 인터페이스명. 생략 가능(Skinnable 클래스를 구현하고 있기 때문에)
		case RED: System.out.print("빨강"); break;
		case GREEN:	System.out.print("초록"); break;
		case BLUE: System.out.print("파랑"); break;
		case BLACK: System.out.print("검정"); break;
		case LEOPARD: System.out.print("표범무늬"); break;
		default: System.out.print("흰색"); break;
		}
		System.out.println("으로 변경하였습니다.");
	}
	
	
}

