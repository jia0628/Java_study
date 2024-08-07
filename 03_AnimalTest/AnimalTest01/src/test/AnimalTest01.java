package test;

//import animal.Animal;
//import animal.Cat;
//import animal.Dog;

import animal.*;

/*
문제) 아래의 작업 지시 사항을 준수하여 추상 클래스의 다형성 구현을 프로그램하시오.
	1. 클래스의 배열을 생성하고, 자식 인스턴스 각 2개를 생성하여 담으시오. (2가지 방법)
	2. 반복문을 사용하여, 배열안의 인스턴스의 정보를 출력하시오. (2가지 방법)
 */

public class AnimalTest01 {
	public static void main(String[] args) {
		//Animal a = new Animal("동물"); // -> Animal이 추상 클래스라 인스턴스를 생성하는게 불가
		
		// 다형성 구현 1
		/*
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("앙꼬", "포메라니안");
		animals[1] = new Dog("꼬꼬", "말티즈");
		animals[2] = new Cat("냥이", 5);
		animals[3] = new Cat("옹이", 3);
		*/
		
		// 다형성 구현 2
		Animal[] animals = new Animal[] {
				new Dog("앙꼬", "포메라니안"),
				new Dog("꼬꼬", "말티즈"),
				new Cat("냥이", 5),
				new Cat("옹이", 3),
		};
		
		// 출력 1 - 기본 for문
		for(int i=0; i<animals.length; i++) {
			animals[i].introduce();  //● Animal에 출력 메서드 확인
		}
		System.out.println("---------------------------------");
		
		// 출력 2 - 확장 for문, 향상된 for문
		for(Animal a : animals) {
			a.introduce();
		}
		
	}
}
