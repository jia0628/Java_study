package wearable;

public class WearableComputer implements Wearable {
	// 인스턴스 변수 생성
	private String name;
	
	// 생성자
	public WearableComputer(String name) {
		this.name = name;
	}
	
	// 오버라이딩 - 추상 메서드 2개
	@Override
	public void putOn() {
		System.out.println("♡" + name + " ON!!");
	}
	
	@Override
	public void putOff() {
		System.out.println("♡" + name + " OFF~~");
	}
	
}
