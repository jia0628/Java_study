package test;

//import account.Account;
//import account.TimeAccount;
import account.*;

/*
문제) 아래의 작업 지시 사항에 따라 다형성을 구현하시오.
	1. Account, TimeAccount 클래스의 인스턴스를 각 2개씩 담을 수 있는 배열을 생성하여 다형성을 구현하시오. (2가지 방법)
	2. 반복문을 사용하여 배열에 있는 인스턴스의 정보를 출력하시오. (2가지 방법)
 */

public class AccountTest06 {
	public static void main(String[] args) {
		// 다형성 구현 1
		/*
		Account[] accounts = new Account[4];
		accounts[0] = new Account("하니", "1234", 1000);
		accounts[1] = new Account("민지", "5678", 500);
		accounts[2] = new TimeAccount("수지", "2345", 3000, 200);
		accounts[3] = new TimeAccount("혜린", "3456", 200, 100);
		*/
		
		// 다형성 구현 2
		Account[] accounts = new Account[] {
				new Account("하니", "1234", 1000),
				new Account("민지", "5678", 500),
				new TimeAccount("수지", "2345", 3000, 200),
				new TimeAccount("혜린", "3456", 200, 100),
		};
		
		// 출력 1 - 기본 for문
		for(int i=0; i<accounts.length; i++) {
			System.out.println(accounts[i]);
			//accounts[i].printAccount(); System.out.println();
		}
		System.out.println("---------------------------------------------------");
		
		// 출력 2 - 확장 for문, for-in문
		for(Account a : accounts) {
			System.out.println(a);
			//a.printAccount(); System.out.println();
		}
		
		
	}
}
