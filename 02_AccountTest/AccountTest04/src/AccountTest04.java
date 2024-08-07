
class Account {
	//● 멤버 변수 = 클래스 변수 + 인스턴스 변수
	
	// 클래스 변수, ★static field(정적 필드) -> ● 독립적임, 값을 유지하면서 공유된다.
	// - 클래스에서 딱 1개만 만들어지고, 모든 인스턴스에서 공유하는 변수
	private static int count = 0;
	
	// 인스턴스 변수, ★non-static field(미정적 필드)
	// - 인스턴스를 생성할때 모든 인스턴스마다 만들어지는 변수
	private String name; 
	private String no;
	private int balance;
	private int id;
	
	// 매개변수를 받는 생성자 - 생성자 오버로딩
	public Account(String name, String no, int balance) { 
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.id = ++count;
	}
	
	// 클래스 메서드, static 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}
	
	// 인스턴스 메서드, non-static 메서드(미정적 메서드)
	// setter 메서드
	public void setName(String name) { 
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter 메서드
	public String getName() { 
		return name; 
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}
	
	// 입금 메서드
	public void deposit(int money) {
		this.balance += money;
	}
	// 출금 메서드
	public void withraw(int money) {
		this.balance -= money;
	}
	
}
// 문제) 각 계좌별로 1부터 1씩 자동으로 증가하는 식별번호를 부여하시오.
// 식별번호는 Account 클래스의 멤버로 구성하시오.
public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "987654", 3000);
		
		System.out.println("♠ John의 계좌");
		System.out.println("식별번호: " + john.getId());
		System.out.println("계좌명의: " + john.getName());
		System.out.println("계좌번호: " + john.getNo());
		System.out.println("예금잔고: " + john.getBalance());
		System.out.println();
		
		System.out.println("★ Mary의 계좌");
		System.out.println("식별번호: " + mary.getId());
		System.out.println("계좌명의: " + mary.getName());
		System.out.println("계좌번호: " + mary.getNo());
		System.out.println("예금잔고: " + mary.getBalance());
		System.out.println();
		
		System.out.println("◆ Tomy의 계좌");
		System.out.println("식별번호: " + tomy.getId());
		System.out.println("계좌명의: " + tomy.getName());
		System.out.println("계좌번호: " + tomy.getNo());
		System.out.println("예금잔고: " + tomy.getBalance());
		System.out.println();
		
		// static 멤버를 사용하는 방법
		//● 클래스명.메서드명(); -> 이름: static way
		//System.out.println("♧ 지금까지 발급된 계좌의 개수: " + tomy.getCount());
		System.out.println("♧ 지금까지 발급된 계좌의 개수: " + Account.getCount());
		
	}
}
