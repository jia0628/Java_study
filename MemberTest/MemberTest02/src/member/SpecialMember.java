package member;

// 자식 클래스 - 특별 혜원 클래스
// - privilege(특별 혜택)
public class SpecialMember extends Member {
	// 인스턴스 변수
	private String privilege;
	
	// 생성자 - 부모 클래스 생성자 호출
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() {
		return privilege;
	}
	
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	// 출력 방법 1번
	@Override
	public String toString() {
		return super.toString() + ", 특별 혜택: " + privilege;
	}
	
	// 출력 방법 2번
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf(", 특별 혜택: %s", privilege);
	}
	
}
