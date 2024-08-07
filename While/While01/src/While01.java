
/*
< 반복문 >
1. 초기값, 조건식, 증감값을 찾아야 한다.
2. 반복 횟수를 파악해야 한다.
*/ 
public class While01 {
	public static void main(String[] args) {
		
		// 1번 - 1부터 10까지 1씩 증가
		/*
		int i = 1; // 초기값
		while(i <= 10) { // 조건식
			System.out.println(i + " Little Indian. ");
			i++; // 증감값
		}
		*/
		// 2번 - 10부터 1까지 1씩 감소
		/*
		int i = 10; // 초기값
		while(i >= 1) { // 조건식
			System.out.println(i + " Little Indian. ");
			i--; // 증감값
		}
		*/
		// 3번 - 1부터 100까지 3씩 증가
		/*
		int i = 1; // 초기값
		while(i <= 100) { // 조건식
			System.out.println(i + " Little Indian. ");
			i += 3; // ● i + 3만 하는게 아니고 저장을 해야 함
		}
		*/
		// 4번 - 100부터 1까지 4씩 감소
		int i = 100; // 초기값
		while(i >= 1) { // 조건식
			System.out.println(i + " Little Indian. ");
			i -= 4; // 증감값 i = i - 4
		}

	}
	
}
