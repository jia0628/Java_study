import java.util.HashSet;
import java.util.LinkedHashSet;

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

public class LinkedHashSetTest02 {
	public static void main(String[] args) {
		
		// Person 인스턴스를 저장하는 HashSet, LinkedHashSet 생성
		HashSet<Person> set1 = new HashSet<>();
		LinkedHashSet<Person> set2 = new LinkedHashSet<>();
		
		// 데이터 추가
		set1.add(new Person("박준우", 30));
		set1.add(new Person("유호진", 32));
		set1.add(new Person("달시오크", 39));
		set1.add(new Person("패트릭쿤", 40));
		set1.add(new Person("한설희", 28));
		set1.add(new Person("에덴", 42));
		set1.add(new Person("DK", 41));
		
		set2.add(new Person("박준우", 30));
		set2.add(new Person("유호진", 32));
		set2.add(new Person("달시오크", 39));
		set2.add(new Person("패트릭쿤", 40));
		set2.add(new Person("한설희", 28));
		set2.add(new Person("에덴", 42));
		set2.add(new Person("DK", 41));
		
		set1.add(new Person("박준우", 30));
		set2.add(new Person("박준우", 30));
			
		// 데이터 확인
		System.out.println("HashSet: " + set1);
		System.out.println("크기: " + set1.size());
		System.out.println("LinkedHashSet: " + set2);
		System.out.println("크기: " + set2.size());
		
	}
}
