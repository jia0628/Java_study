package account;

// 부모 클래스
public class Account {
		// 인스턴스 변수
		private String name;
		private String no;
		private int balance;
		
		// 디폴트 생성자 -> ● 에러 처리 때문에 생성
		public Account() {
			
		}
		
		// 생성자
		public Account(String name, String no, int balance) {
			this.name = name;
			this.no = no;
			this.balance = balance;
		}
		
		// getter
		public String getName() {
			return name;
		}
		public String getNo() {
			return no;
		}
		public int getBalance() {
			return balance;
		}
		
		// setter
		public void setName(String name) {
			this.name = name;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		// 입금 메서드
		public void deposit(int money) {
			this.balance += money;
		}
		
		// 출금 메서드
		public void withraw(int money) {
			this.balance -= money;
		}
		
		// 출력 메서드 1번 - toString
		public String toString() {
			return String.format("계좌명의: %s, 번호: %s, 잔고: %d", name, no, balance);
		}
		
		// 출력 메서드 2번 - printAccount
		public void printAccount() {
			System.out.println("계좌 명의: " + name);
			System.out.println("계좌 번호: " + no);
			System.out.println("예금 잔고: " + balance);
		}
		
}
