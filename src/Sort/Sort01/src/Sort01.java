
public class Sort01 {
	public static void main(String[] args) {
		//int [] a = new int[] {30, 40, 10, 50, 20};
		int [] a = new int[] {98, 64, 77, 58, 62, 68, 54, 75, 89, 75};
		
		System.out.print("선택정렬 전: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		// ● 선택 정렬 : 하나를 전체랑 한번에 비교하면서 정렬
		for(int i=0; i<a.length-1; i++) {  // ● 정렬에서 마지막 1개는 돌릴 필요가 없음
			for(int j=i+1; j<a.length; j++) {  // ● i+1은 그 다음 수를 비교 ex) 1과 2
				if(a[i] > a[j]) { // ● < 부등호만 바꾸면 내림차순
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				// ● 단이 바뀌는 지점
			}
			
			// ● 정렬되는 과정 출력
			System.out.printf("%3d정렬 후: ", i+1);
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("선택정렬 후: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}

}
