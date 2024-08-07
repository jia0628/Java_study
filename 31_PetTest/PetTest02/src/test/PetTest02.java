package test;

import pet.Pet;
import pet.RobotPet;

/*
문제) 아래의 작업 지시 사항에 따라 다형성을 구현하는 프로그램을 완성하시오.
 	1. Pet, RobotPet 클래스의 인스턴스를 각 2개씩 담을 수 있는 배열을 만들어서 다형성을 구현하시오. (2가지 방법)
 	2. 배열에 있는 인스턴스를 반복문을 사용하여 출력하시오. (2가지 방법)
 */

public class PetTest02 {
	public static void main(String[] args) {
		// 다형성 구현 1
		/*
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("앙꼬", "이지아");
		pets[1] = new Pet("꼬꼬", "이수아");
		pets[2] = new RobotPet("티티", "배수지");
		pets[3] = new RobotPet("푸푸", "강하늘");
		*/
		
		// 다형성 구현 2
		Pet[] pets = new Pet[] {
				new Pet("앙꼬", "이지아"),
				new Pet("꼬꼬", "이수아"),
				new RobotPet("티티", "배수지"),
				new RobotPet("푸푸", "강하늘"),
		};
		
		// 출력 1 - 기본 for문
		// 완전한 다형성의 구현을 하는 방법
		// instanceof 연산자를 활용하여 자식 클래스에 추가된 기능도 구현이 가능 
		for(int i=0; i<pets.length; i++) {
			pets[i].introduce();
			// 해석: pets[i]가 RobotPet의 인스턴스라면? pets[i]가 RobotPet을 참조한다면?
			if(pets[i] instanceof RobotPet) { //● instanceof 연산자 해석: pets[i]가 RobotPet의 인스턴스이니?
				((RobotPet)pets[i]).work(2);  //● true -> pet형의 배열이기 때문에 RobotPet로 캐스팅 후 일을 시킨다.
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		// 출력2 - 향상된 for문
		
		for(Pet p : pets) {
			p.introduce();
			if(p instanceof RobotPet) {
				((RobotPet) p).work(1);
			}
			System.out.println();
		}
		
		
	}
}
