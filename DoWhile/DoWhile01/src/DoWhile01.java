
// 초기값, 조건식, 증감값

public class DoWhile01 {
	public static void main(String[] args) {
		
		// 1번 - 1부터 10까지 1씩 증가
		/*
		int i = 1; // 초기값
		do {
			System.out.println(i + "Little Indian!");
			i++;   // 증감값
		} while(i <= 10); // 조건식
		*/
		// 2번 - 10부터 1까지 1씩 감소
		int i = 10;
		do {
			System.out.println(i + "Little Indian!");
			i--;
		} while(i >= 1);
		
	}

}
