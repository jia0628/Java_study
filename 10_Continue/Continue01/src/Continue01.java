
// < continue문 >
// 1. continue를 만나면 반복문 안에서의 끝지점으로 이동한다.
// 2. continue문과 반복문의 끝 사이에 있는 내용이 제거(생략)된다.
// 3. continue문은 반복문의 횟수는 모두 채운다.

public class Continue01 {
	public static void main(String[] args) {
		
		// 1번 - 0에서 9까지의 정수 중에서 5를 제외한 정수를 출력
		/*
		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		*/
		
		// 2번 - 0에서 99까지의 정수 중에서 3의 배수를 출력
		for(int i=0; i<100; i++) {
			if(i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 3번 - 0에서 99까지의 정수 중에서 3의 배수를 제외하고 출력
		for(int i=0; i<100; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}

}
