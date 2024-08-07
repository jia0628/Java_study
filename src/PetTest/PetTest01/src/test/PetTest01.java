package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("앙꼬", "이지아");
		happy.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("알투디투", "정대만");
		r2d2.introduce();
		System.out.println();
	
		// 부모 클래스의 참조변수는 자식 클래스의 인스턴스를 참조할 수 있다.
		Pet c3po = r2d2;
		// 동적 바인딩(Dynamic Binding) - 실체가 되는 자식의 메서드를 출력한다.
		c3po.introduce();
		
		
		// 자식 클래스의 참조변수는 부모 클래스의 인스턴스를 참조할 수 없다.
		//RobotPet mary = happy;
		
	}
}
