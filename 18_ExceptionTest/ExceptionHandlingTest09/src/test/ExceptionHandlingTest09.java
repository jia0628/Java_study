package test;

import account.Account;
import exception.BalanceInsufficientException;
import exception.MinusDepositException;

// ★
public class ExceptionHandlingTest09 {
	public static void main(String[] args) {
		Account acc1 = new Account("유호진", "87654", 10000000);
		System.out.println(acc1);
		
		// 입금 예외 처리
		try {
			acc1.deposit(10000);  // 정상 처리
			acc1.deposit(-10000); // 예외 처리
		} catch(MinusDepositException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
		
		// 출금 예외 처리
		try {
			acc1.withdraw(500000);    // 정상 처리
			acc1.withdraw(500000000); // 예외 처리
		} catch(BalanceInsufficientException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
		
		
	}
}
