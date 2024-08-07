package animal;

// 동물 클래스
// 추상 클래스 <- 부모 클래스
public abstract class Animal { // 추상 메서드를 가진 클래스도 반드시 추상이어야 한다.
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메서드 1 (abstract method)
	//● { } 구현부를 없애고 abstract을 붙인다.
	public abstract void bark(); 
	
	// 추상 메서드 2
	// 비추상 메서드를 추상 메서드로 오버라이딩 할 수 있다.
	public abstract String toString();
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 소개(출력) 메서드
	// 상속받은 자식 클래스에서 사용할 목적으로 만든 메서드
	public void introduce() {
		//● 자식 클래스에서 상속받을거고 메서드를 오버라이딩 했을거고 그걸 미리 끌고 온 장면.
		System.out.println(toString());
		bark();
	}
	
}
