package fruit;

// Fruit는 하나, 그 Fruit에 대한 속성이 여러개(인스턴스)
public class Fruit implements Comparable<Fruit> {
	// 인스턴스 변수
	private String name;  // 과일 이름
	private int price;    // 과일 가격
	private int volume;   // 과일 수량
	
	// 생성자
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getVolume() {
		return volume;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// hashCode(), equals() 오버라이딩
	
	
	
	// 출력 toString
	public String toString() {
		return String.format("%s(가격: %d, 수량: %d)", name, price, volume);
	}
	
	
	// TreeSet에서 사용하는 클래스는 
	// - Comparable 인터페이스의 compareTo() 추상메서드를 반드시 오버라이딩 ★
	// - CompareTo() 메서드의 정렬기준이 되는 멤버 변수가 중복 데이터를 허용하지 않는 멤버변수가 됨.
	
	// 과일 가격을 기준으로 오름차순
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return 1;       //●● 양수라면 뒤에 있고 양수(1)을 리턴
//		else if(this.price < f.price) return -1; //●● 음수라면 앞에 있고 음수(-1)로 리턴
//		else return 0;
//		
//	}
	
	// 과일 가격을 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price > f.price) return -1;      
//		else if(this.price < f.price) return 1;
//		else return 0;
//		
//	}
	
	// 과일 수량을 기준으로 오름차순
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.volume > f.volume) return 1;       //●● this가 클때 양수
//		else if(this.volume < f.volume) return -1; //●● this가 작을때 음수
//		else return 0;
//		
//	}
	
	// 과일 수량을 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.volume > f.volume) return -1;      
//		else if(this.volume < f.volume) return 1;
//		else return 0;
//		
//	}
	
	// 과일 이름을 기준으로 오름차순
	@Override
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) > 0) return 1;      
		else if(this.name.compareTo(f.name) < 0) return -1;
		else return 0;
		
	}
	
	// 과일 이름을 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.name.compareTo(f.name) > 0) return -1;      
//		else if(this.name.compareTo(f.name) < 0) return 1;
//		else return 0;
//		
//	}
		
}
