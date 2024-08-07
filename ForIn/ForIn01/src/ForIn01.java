
public class ForIn01 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 기본 for문
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 확장 for문, for-in문, enhanced for문, for-each문
		// 주의) i는 인덱스가 아니라 값임. i(값)-> 10, 20, 30, 40, 50
		// - 인덱스가 없으므로 특정 범위의 값을 제어할 수 없음.
		// - 주로 배열의 모든 값을 출력하고자 할 때 사용함.
		//● a라는 배열 안에 있는 i(: -> in 해석은 ~안에)
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
