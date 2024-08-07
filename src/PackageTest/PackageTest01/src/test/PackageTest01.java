package test;

import calc.Calc;    // 단일형 import ★
//import calc.*;     // 주문형 import

public class PackageTest01 {
	public static void main(String[] args) {
		// 1. 완전 수식명
		//calc.Calc c1 = new calc.Calc();
		
		// 2. 단순명 ★
		Calc c1 = new Calc();
		
		System.out.println(c1.add(10, 20));
		//System.out.println(c1.subract(100, 50)); // 패키지가 다르므로 default 멤버는 사용 불가
		System.out.println(c1.multiply(5, 3));
		//System.out.println(c1.divide(10, 2));  // 같은 클래스가 아니므로 private 멤버는 사용 불가
		
		
	}
}
