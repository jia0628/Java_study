import java.util.HashSet;

class Person {
	// 인스턴스 변수
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// ★ 클래스를 Set에서 사용하다면 Object 클래스의 hashCode(), equals() 메서드를 오버라이딩 해야함
	// Person의 인스턴스는 name과 age가 같을 때 같은 해시코드를 발급받도록 한다.
	@Override
	public int hashCode() {
		return (name+age).hashCode(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {  
			Person p = (Person)obj;
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}

	// toSting() 메서드 오버라이딩
	@Override
	public String toString() {
		return String.format("%s(%d)", name, age);
	}
	
}

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class HashSetTest03 {
	public static void main(String[] args) {
		
		// Person 인스턴스를 저장하는 HashSet 생성
		HashSet<Person> set = new HashSet<>();
		
		// 데이터 추가
		/*
		set.add(new Person("박준우", 30));
		set.add(new Person("유호진", 32));
		set.add(new Person("달시오크", 39));
		set.add(new Person("패트릭쿤", 40));
		set.add(new Person("한설희", 28));
		set.add(new Person("에덴", 42));
		set.add(new Person("DK", 41));
		*/
		
		// 데이터 추가 - 중복되지 않은 데이터
		Person[] persons = new Person[] {
				new Person("박준우", 30), new Person("유호진", 32), new Person("달시오크", 39),
				new Person("패트릭쿤", 40), new Person("한설희", 28), new Person("에덴", 42),
				new Person("DK", 41),
		};
		for(Person p : persons) {
			set.add(p);
		}
		
		// 데이터 확인
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복데이터 추가 - 이름만 중복 -> 허용함 (새로운 데이터라고 인식)
		set.add(new Person("박준우", 45));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복데이터 추가 - 나이만 중복-> 허용함 (새로운 데이터라고 인식)
		set.add(new Person("김현준", 30));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		//★ 중복데이터 추가 - 이름과 나이 모두 중복
		// 문제점: 멤버변수의 값이 모두 같음에도 다른 데이터로 인식하여 데이터를 추가함.
		// 해결책: 클래스에서 hashCode()메서드와 equals()메서드를 오버라이딩하여 문제를 해결함.
		set.add(new Person("유호진", 32));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// ##########################################################################
		
		// 중복데이터 한번더 추가 - 이름만 중복 -> 허용
		set.add(new Person("에덴", 25));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복데이터 한번더 추가 - 나이만 중복 -> 허용
		set.add(new Person("도기문", 28));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복데이터 한번더 추가 - 이름과 나이가 모두 중복 -> 허용하지 않도록 만듦
		set.add(new Person("패트릭쿤", 40));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
	}
}
