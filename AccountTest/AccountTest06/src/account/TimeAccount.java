package account;

// 자식 클래스
public class TimeAccount extends Account {
		// 인스턴스 변수
		private int timeBalance;
		
		/*
		public TimeAccount() {
			super();
		}
		*/
		
		// 생성자
		// super( ): 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 방법,
		// 부모 클래스의 private 멤버의 초기화를 자식 클래스의 생성자에게 위임하는 방법.
		public TimeAccount(String name, String no, int balance, int timeBalance) {
			super(name, no, balance);
			this.timeBalance = timeBalance;
		}
		
		// getter
		public int getTimeBalance() {
			return timeBalance;
		}
		
		// setter
		public void setTimeBalance(int timeBalance) {
			this.timeBalance = timeBalance;
		}
		
		// 정기 예금 해약 메서드
		public void cancel() {
			deposit(timeBalance);
			timeBalance = 0;
		}
		
		// 출력 메서드 1번
		@Override
		public String toString() {
			return super.toString() + ", 정기예금잔고: " + timeBalance;
		}
		
		// 출력 메서드 2번
		@Override
		public void printAccount() {
			super.printAccount();
			System.out.println("정기예금 잔고: " + timeBalance);
		}
		
}
