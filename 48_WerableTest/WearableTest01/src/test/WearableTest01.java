package test;

import wearable.*;
/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하는 프로그램을 완성하시오.
	1. WearableComputer와 WearableRobot의 인스턴스 각 2개씩 담는 배열을 생성하시오. (2가지 방법)
	2. 반복문을 사용하여 각 인스턴스의 정보를 출력하시오. (2가지 방법)
	3. WearableRobot인 경우는 색상을 바꾸는 기능을 함께 사용하시오.
*/

public class WearableTest01 {
	public static void main(String[] args) {
		// 다형성 구현 1
		//● Computer와 Robot이 둘다 구현하고 있는 Wearable로 배열을 만든다.
		Wearable[] wearables = new Wearable[4];
		wearables[0] = new WearableComputer("낑깡");
		wearables[1] = new WearableComputer("통통");
		wearables[2] = new WearableRobot(Color.RED);
		wearables[3] = new WearableRobot(Color.GREEN);
		
		// 다형성 구현 2
		/*
		Wearable[] wearables = new Wearable[] {
				new WearableComputer("낑깡"),
				new WearableComputer("통통"),
				new WearableRobot(Color.RED),
				new WearableRobot(Color.GREEN),
		};
		*/
		
		// 출력 1 - 기본 for문
		for(int i=0; i<wearables.length; i++) {
			// if(wearables[i] instanceof WearableRobot) {
			if(wearables[i] instanceof Color) {  //● 또 다른 방법 -> WearableRobot은 Color와 Wearable 둘 다 구현하고 있다.
				((WearableRobot)wearables[i]).changeColor(Color.YELLOW);
			}
			wearables[i].putOn();
			wearables[i].putOff();
			System.out.println();
		}
		System.out.println("-----------------------");
		
		// 출력 2 - 확장 for문, for-in문
		/*
		for(Wearable w : wearables) {
			if(w instanceof WearableRobot) {
				((WearableRobot)w).changeColor(Color.BLUE);
			}
			w.putOn();
			w.putOff();
			System.out.println();
		}
		*/
		
	}
}
