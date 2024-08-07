// 배열 - 같은 타입의 변수의 집합

public class Array01 {
	public static void main(String[] args) {
		// 1번
		//int[] a; // int형 1차원 배열의 참조변수
		//a = new int[5];  // 배열의 실체를 생성하여 참조
		
		// int a[]; -> 비추
		
		// 2번
		int[] a = new int[5]; // 1차원 배열을 선언하고, 생성
		
		a[0] = 10;
		a[2] = 20;
		a[4] = 40;
		//a[5] = 50;  // ● ArrayIndexOutOfBoundsException: 5

		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// ● 예외의 에러 a[5]의 인덱스는 없음.
		//System.out.println(a[5]); // ArrayIndexOutOfBoundsException: 5
		
		//System.out.print(a.length);
		
		//a.length = 10; // The final field array.length cannot be assigned
		
		// 반복문 활용
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}
