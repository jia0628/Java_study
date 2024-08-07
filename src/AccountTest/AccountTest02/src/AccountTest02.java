
/*
은행 계좌 클래스 구현
- 속성(변수): 계좌명의, 계좌번호, 예금잔고
- 기능(메서드): 입금, 출금

AccountTest01에서의 문제점
문제점1: 계좌의 정보를 변수명, 주석을 통해 알 수 있다. => 해결
문제점2: 한 사람의 계좌라면 하나로 묶어서 처리해야 하지만, 그렇지 않다. => 해결
문제점3: 아무나 변수를 통해 입금과 출금이  가능하도록 되어 있다. => 해결되지 않음.

새로운 문제점 발현
문제점1: 확실한 초기화에 대한 보장이 되지 않았다. (= 확실하게 값이 들어가있지 않다)
*/
class Account {  //● 클래스는 실체를 만들기 위한 설계도 느낌
	// 멤버 변수(속성): Account라는 클래스에 들어간 멤버들의 변수
	String name;
	String no;
	int blance;
	
	// 디폴트 생성자 - 클래스를 만들면 쓰지 않아도 생성된다.
	Account() {
		
	}
}

public class AccountTest02 {
	public static void main(String[] args) {
		//● john이라는 참조변수로 실체에 접근해서 정보를 집어넣고 출력
		//● 그 실체를 인스턴스라 부름 -> 인스턴스란 즉,객체(더 포괄적인 의미)
		// 인스턴스(instance) - 클래스를 통해서 만들어진 실체
		Account john = new Account();
		Account mary = new Account();
		
		// John의 계좌 정보
		john.name = "John";
		john.no = "123456";
		john.blance = 1000;
		
		// Mary의 계좌 정보
		mary.name = "Mary";
		mary.no = "654321";
		mary.blance = 500;
		
		// 기능 - 입금, 출금
		john.blance -= 200; // 출금
		mary.blance += 100; // 입금
		
		// John 계좌 출력
		System.out.println("★ John의 계좌");
		System.out.println("계좌 명의: " + john.name);
		System.out.println("계좌 번호: " + john.no);
		System.out.println("예금 잔고: " + john.blance);
		System.out.println();
		
		// Mary 계좌 출력
		System.out.println("♥ Mary의 계좌");
		System.out.println("계좌 명의: " + mary.name);
		System.out.println("계좌 번호: " + mary.no);
		System.out.println("예금 잔고: " + mary.blance);
		
	}

}
