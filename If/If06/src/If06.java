import java.util.Scanner;

// 문제) 0 ~ 2 사이의 난수를 발생하여, 가위 바위 보 게임을 작성하시오.
// 0: 가위, 1: 바위, 2: 보
public class If06 {
	public static void main(String[] args) {
		// 난수 생성 - 1 ~ 10 사이의 난수
		// 0 ~ 0.9999 ... -> 0 ~ 9.9999 ... -> 0 ~ 9 -> 1 ~ 10
		//int rn = (int)(Math.random() * 10) + 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("--- 가위/바위/보 게임을 시작합니다---\n");
		System.out.print("0(가위), 1(바위), 2(보) 중에서 입력: ");
		int n = sc.nextInt();  // ● 나
		
		// 0 ~ 0.9999 -> 0 ~ 2.9999 -> 0 ~ 2
		int rn = (int)(Math.random() * 3); // ● 컴퓨터
		
		// 계산 결과: 나(n)에서 컴퓨터(rn)의 수를 뺀 결과
		// 1번
		/*
		int result = n - rn;
		
		if(result == -2 || result == 1) {
			System.out.print("당신이 이겼습니다");
		} else if(result == -1 || result == 2) {
			System.out.print("당신은 졌습니다");
		} else {                             // ● 비겼을 땐 0
			System.out.print("당신은 비겼습니다");
		}
		*/
		
		// 1: win, 2: lose, 0: same
		// 2번
		int result = (n - rn + 3) % 3; // ● 3으로 더하고 나누는 이유는 3가지라서
		
		if(result == 1) {
			System.out.print("당신이 이겼습니다");
		} else if(result == 2) {
			System.out.print("당신은 졌습니다");
		} else {
			System.out.print("당신은 비겼습니다");
		}
		
		
		sc.close();
	}

}
