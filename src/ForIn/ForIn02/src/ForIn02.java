
public class ForIn02 {
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{90, 91, 91, 93},
		};
		
		// 기본 for문
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 확장 for문
		for(int[] i : a) { //● 2중 for문 일땐 1차원 반복문에[] 필수
			for(int j : i) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		
		
	}

}
