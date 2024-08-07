package test;

//import account.Account;
//import account.TimeAccount;
import account.*;

public class AccountTest05 {
	public static void main(String[] args) {
		Account a1 = new Account("송태섭", "777777", 5000);
		TimeAccount a2 = new TimeAccount("정우성", "999999", 3000, 500);
		
		//● 자식은 부모의 확장 버전
		// 부모는 자식을 담을 수 있지만, 자식은 부모를 담을 수 없다
		Account x;
		x = a1; // 같은 타입: 가능
		x = a2; // 부모의 참조변수는 자식의 인스턴스를 참조할 수 있다. -> 다형성 구현의 출발점
		
		TimeAccount y;
		//y = a1; // 자식의 참조변수는 부모의 인스턴스를 참조할 수 없다.
		y = a2; // 같은 타입: 가능
		
		
		// 출력 1번 - toString
		/*
		System.out.println(a1);
		System.out.println(a2);
		System.out.println();
		*/
		
		// 출력 2번 - 메서드 호출
		/*
		a1.printAccount();
		System.out.println();
		a2.printAccount();
		*/
	}
}
