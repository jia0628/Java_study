
public class Array2d01 {
	public static void main(String[] args) {
		//int[][] a;  // 추천!
		//int a[][];  // 비추
		//int[] a[];  // 비추
		
		// 1번 방법
		//int[][] a = new int[3][4]; // ● [행/세로][열/가로]
		
		// 2번 방법
		// ● int형 2차원 배열을 참조하는 참조변수
		int[][] a;
		// ● a[0], a[1],a[2] -> int형 1차원 배열을 참조하는 참조변수
		// ● a.length -> 행의 개수
		a = new int[3][];
		// ● a[0].length -> 각 행에 대한 열의 개수
		a[0] = new int[4]; 
		a[1] = new int[4];
		a[2] = new int[4];
		
		a[1][2] = 7;
		a[2][1] = 5;
		//a[2][4] = 9; //ArrayIndexOutOfBoundsException: 4 -> 범위를 벗어났다는 에러
		
		// 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}//end
		
	}

}
