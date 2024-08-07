package pet;

// 자식 클래스 - 애완 로봇
public class RobotPet extends Pet {
	
	// 생성자
	// super(): 부모 클래스의 생성자를 통해 상속받은 private 멤버의 값을 초기화함.
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// 출력 - 자기소개
	// 오버라이딩(Overriding)
	// @ -> Annotation: 자바 컴파일러에게 알려주는 메세지
	//● 메서드가 오버라이딩을 한건지 안한건지 판별해줌. (에러라면 고쳐야함)
	@Override //아래의 메서드는 오버라이딩을 한 메서드, 오버라이딩하는 메서드는 에노테이션을 붙여줄 것을 권장함.
	public void introduce() {
		System.out.println("◎ 저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎ 주인님의 이름은 " + getMasterName() + "입니다.");
	}
	
	// 메서드 추가 - 일을 하는 기능
	public void work(int w) {
		switch(w) {
		case 1: System.out.println("청소를 합니다."); break;
		case 2: System.out.println("빨래를 합니다."); break;
		case 3: System.out.println("밥을 짓습니다."); break;
		}
	}
	
}
