import java.util.Scanner;

public class LoopTest17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"가위", "바위", "보"};
		int user, tot = 0, win = 0, lose = 0, same = 0;
		char yn;
		
		// ● 0628 switch03과 비교
		System.out.println("### 가위/바위/보 게임을 시작합니다 ###");
		
		// ● do~while문을 한번 더 써서 반복시킴 
		do {
			do {
				System.out.print("[0/가위, 1/바위, 2/보] 0~2사이의 정수 입력: ");
				user = sc.nextInt();
			} while(!(user>=0 && user<=2)); // ● 0, 1, 2가 아니면 계속 돈다
			
		
			
			// 컴퓨터 난수(0 ~ 2까지)
			int comp = (int)(Math.random()*3);
			
			// 게임 결과: 1(user win), 2(user lose), 0(same)
			int result1 = (user - comp +3) % 3;
			String result2 = "";
			
			++tot;
			switch(result1) {
			case 1:
				result2 = "축하합니다! 당신은 이겼습니다";
				++win;
				break;
			case 2:
				result2 = "아쉽지만.. 당신은 졌습니다";
				++lose;
				break;
			case 0:
				result2 = "당신은 비겼습니다";
				++same;
				break;
			}
			System.out.printf("컴퓨터가 낸 거: %s\n내가 낸 거: %s\n-> %s\n", names[comp], names[user], result2);
			System.out.printf("%d점   %d승   %d패   %d무승부", tot, win, lose, same);
			
			System.out.print("한번 더 게임을 하시겠습니까?(y/n): ");
			yn = sc.next().toLowerCase().charAt(0); // ● toLowerCase -> 소문자로 받음, charAt -> 첫글자만 받음
			
		} while(yn == 'y');
		
		System.out.println("Good Game!! See You !!");
		
		sc.close();
	}

}