package wearable;

/*
문제) 아래의 작업 지시 사항을 준수하여 프로그래밍을 완성하시오.
	1. Wearable, Color 인터페이스를 구현하시오.
	2. 인스턴스 변수 color를 추가하시오.
	3. 인스턴스 변수를 초기화하는 생성자를 추가하시오.
	4. Color에서 따라 인스턴스의 색상을 리턴하는 toString() 메서드를 추가하시오.
*/

// 다중 구현
public class WearableRobot implements Color, Wearable {
	// 인스턴스 변수
	//● Color 인스턴스에서 int로 받았다.
	private int color;
		
	// 생성자
	public WearableRobot(int color) {
		this.color = color;
	}
	
	// 오버라이딩 - 추상메서드 3개
	@Override
	public void changeColor(int color) {
		this.color = color;
	}
	
	@Override
	public void putOn() {
		System.out.println("♬" + toString() + "장착!");
	}
	
	@Override
	public void putOff() {
		System.out.println("♬" + toString() + "해제 ~~");
	}
	
	// 출력 메서드 (약간의 응용)
	//● return을 하니까 break가 필요 없다.
	public String toString() {
		switch(color) {
		case RED: return "빨강 로봇";
		case GREEN: return "초록 로봇";
		case BLUE: return "파랑 로봇";
		case YELLOW: return "노랑 로봇";
		case BLACK: return "검정 로봇";
		default: return "깡통 로봇";
		}
	}
	
	
}
