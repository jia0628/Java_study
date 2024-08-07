import java.util.Scanner;

// 문제) 1 ~ 100 사이의 난수를 생성하고, 사용자는 이 난수를 맞추시오.
// 이 때 몇 번 맞추었는지를 구하고, 맞춘 난수를 출력하시오.
public class LoopTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int comp, user, cnt = 0;
		
		// 1 ~ 100까지 중에서 난수 생성
		comp = (int)(Math.random() * 100) + 1;  // ● 난수 -> 0.999*100 -> 99
		//System.out.print(comp);
	
		do { 
			System.out.print("숫자를 맞춰보세요.(1~100): ");
			user = sc.nextInt();
			++cnt;
			
			if(user > comp) {
				System.out.println("더 작은 수를 입력해보세요!");
			}
			if(user < comp) {
				System.out.println("더 큰 수를 입력하세요!");
			}
		} while(user != comp);  // ● 같지 않으면 계속 돌게 함.(값이 같으면 끝나게)
		
		System.out.printf("시도횟수: %d, 난수: %d", cnt, comp);
		
		sc.close();
	}

}
