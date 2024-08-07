
class Member {
	String id;
	String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[" + id + "]" + name;
	}
	
}

public class ExceptionHandlingTest07 {
	public static void main(String[] args) {
		Member[] members = new Member[4];
		String[] ids = {"1111", "2222", "3333"};
		String[] names = {"박준우", "유호진", "한설화"};
		
		// ArrayIndexOutOfBoundsException 발생
		try {
			for(int i=0; i<members.length; i++) {
				members[i] = new Member(ids[i], names[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "번은 없습니다.");
		} 
		
		// NullPointerException 발생
		try {
			for(int i=0; i<members.length; i++) {
				System.out.println(members[i].toString());
			}
		} catch(NullPointerException e) {
			System.err.println(e.getMessage() + "은 출력할 수 없습니다.");
		}
		
		// 마지막 처리
		System.out.println("정상적으로 프로그램이 종료되었습니다");
		
	}
}
