import java.util.ArrayList;
import java.util.Iterator;

class Member {
	// 인스턴스 변수
	private String no;
	private String name;
	private int age;
	
	// 생성자
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 두 개의 인스턴스가 같은지의 여부
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.no.equals(m.no) && this.name.equals(m.name) && this.age == m.age;
		}
		return false;
	}
	
	
	// toString() 출력
	@Override
	public String toString() {
		return String.format("%s(%s, %d)", no, name, age);
	}
	
}

// "박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class ArrayListTest04 {
	public static void main(String[] args) {
		// 멤버 클래스의 인스턴스를 담는 리스트를 생성
		ArrayList<Member> list = new ArrayList<>();
		
		// 데이터 추가 (순차적)
		list.add(new Member("1234", "박준우", 29)); //● -> 익명 인스턴스
		list.add(new Member("3456", "유호진", 30));
		list.add(new Member("2468", "달시오크", 36));
		list.add(new Member("6789", "패트릭쿤", 33));
		list.add(new Member("8921", "한설희", 31));
		list.add(new Member("9624", "에덴", 25));
		list.add(new Member("3478", "DK", 42));
		
		// 데이터 확인
		System.out.println(list); //● toString을 꼭 오버라이딩 해야함
		
		// 1. [7452, 에릭첸, 40]을 맨 뒤에 추가 (순차적)
		list.add(new Member("7452", "에릭첸", 40));
		System.out.println(list);
		
		
		// 2. [4927, 김현준, 41]을 박준우 다음으로 추가(비순차적)
		// 작은 양의 데이터일 때
//		list.add(1, new Member("4927", "김현준", 41)); 
		
		// 많은 양의 데이터일 때
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("박준우")) {
				list.add(i+1, new Member("4927", "김현준", 41));
			}
		}
		System.out.println(list);
		
		
		// 3. 유호진 삭제
		// 작은 양의 데이터일 때
//		list.remove(2);
		
		// 많은 양의 데이터일 때
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("유호진")) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		
		// 4. 한설희의 43으로 수정
		// 작은 양의 데이터일 때
//		list.set(4, new Member("8921", "한설희", 43));
		
		// 많은 양의 데이터일 때
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("한설희")) {
				list.get(i).setAge(43);   //● setter의 사용 부분
			}
		}
		
		System.out.println(list);
		System.out.println();
		
		// 출력 1번 - 기본 for문
		System.out.println("----출력 1번----");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// 출력 2번 - 확장 for문
		System.out.println("----출력 2번----");
		for(Member i : list) {
			System.out.println(i);
		}
		System.out.println();
		
		// 출력 3번 - forEach(), 람다식
		System.out.println("----출력 3번----");
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
		// 출력 4번 - forEach(), :: 메서드 참조 연산자
		System.out.println("----출력 4번----");
		list.forEach(System.out::println);
		System.out.println();
		
		// 출력 5번 -> set에서 씀, set은 인덱스가 없어서 for문 사용 불가
		//● Iterator(인터페이스) 뜻: 반복자
		System.out.println("----출력 5번----");
		Iterator<Member> it = list.iterator();  //● 이터레이터가 멤버를 돌아다닌다 = 리스트의 반복자가 된다
		while(it.hasNext()) { 
			System.out.println(it.next()); // .next: it을 꺼낸다
		}
		
	}
}
