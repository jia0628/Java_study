import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("### 가위/바위/보 게임을 시작합니다 ###");
		System.out.print("0(가위), 1(바위), 2(보) 입력: ");
		int user = sc.nextInt();
		
		// 컴퓨터 난수(0 ~ 2까지)
		int comp = (int)(Math.random()*3);
		
		// 게임 결과: 1(user win), 2(user lose), 0(same)
		int result1 = (user - comp +3) % 3;
		String result2 = "";
		
		switch(result1) {
		case 1:
			result2 = "축하합니다! 당신은 이겼습니다";
			break;
		case 2:
			result2 = "아쉽지만.. 당신은 졌습니다";
			break;
		case 0:
			result2 = "당신은 비겼습니다";
			break;
		}
		System.out.println("User " + result2);
		
		sc.close();
	}

}
