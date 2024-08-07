
/*
은행 계좌 클래스
- 속성(멤버변수): 계좌명의, 계좌번호, 예금잔고

AccountTest02의 문제점
문제점1: 확실한 초기화에 대한 보장이 되지 않았다. (= 확실하게 값이 들어가있지 않다) => 해결(생성자)
문제점2: 아무나 변수를 통해 입금과 출금이 가능하도록 되어 있다. => 

< ★ 멤버 접근 제어자(한정자), access modifier >
- private : 같은 클래스의 멤버만 사용이 가능
- default: 같은 패키지 내에서만 사용이 가능, 접근 제어자를 쓰지 않은 상태
- protected : 상속을 받은 자식 클래스에서 사용이 가능
- public : 어디에서나 사용이 가능

< 클래스 멤버 >
- 속성 -> 멤버 변수: name, no, balance
- 기능 -> 멤버 메서드: getter/setter, deposit, withdraw
- 생성자 -> 

★ class 적는 순서: 멤버변수 -> 생성자 -> getter/setter -> 기타 메서드들
*/

class Account {
	//● private - 접근 제한자
	private String name; //● 멤버변수
	private String no;
	private int balance;
	
	// ★ 실수 많은 지점
	// 디폴트(기본) 생성자 - 매개변수가 없는 생성자             
	// 1. 클래스를 만들면 무조건 생성된다.
	// 2. 다른 생성자를 만들면 디폴트 생성자는 사라진다.
	public Account() {
		
	}
	
	// 생성자 오버로딩 - 디폴트 생성자와 생성자가 둘다 있을 시.
	// ★★★★★중요
	// 생성자(constructor)
	// 생성자의 특징: 클래스명과 동일, 리턴타입이 없음(때문에 메서드가 아님)
	// 생성자의 목정: 멤버 변수의 확실한 초기화의 보장
	// 생성자의 호출 시기: 인스턴스를 생성할 때만 호출 (= new Account)
	public Account(String name, String no, int balance) { //● 매개변수
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// ● public의 setter, getter 메서드 -> 외부에서 멤버변수로 접근하는걸 다른 통로를 만들어 주겠다.
	// accessor - getter/setter 메소드를 한꺼번에 부를때 
	// setter 메서드 - set멤버변수명을 가진 메서드들, 값을 설정하는 역할
	public void setName(String name) { //● set멤버변수명(매개변수) -> 매개변수의 값을 받아서 멤버변수로 넘김
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter 메서드 - get멤버변수명을 가진 메서드들, 값을 획득(리턴)하는 역할
	public String getName() { //● 매개변수에서
		return name;     //● 리턴은 멤버변수로
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
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

public class AccountTest03 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		
		Account tomy = new Account(); 
		
		// john.Account("John", "123456", 1000); -> 에러, 생성자는 인스턴스를 생성할 때만 호출
		
		// 기능 - 입금, 출금
		// 멤버변수는 접근 불가능
		//john.balance -= 200;
		//mary.balance += 100;
		
		// 멤버 메서드를 통해서 접근 가능
		john.withraw(200);
		mary.deposit(100);
		
		System.out.println("★ John의 계좌");
		System.out.println("계좌 명의: " + john.getName());
		System.out.println("계좌 번호: " + john.getNo());
		System.out.println("예금 잔고: " + john.getBalance());
		System.out.println();
		
		System.out.println("♥ Mary의 계좌");
		System.out.println("계좌 명의: " + mary.getName());
		System.out.println("계좌 번호: " + mary.getNo());
		System.out.println("예금 잔고: " + mary.getBalance());
		
	}

}
