
public class Sort02 {
	public static void main(String[] args) {
		//int[] a = new int[] {30, 40, 10, 50, 20};
		int[] a = new int[] {98, 64, 77, 58, 62, 68, 54, 75, 89, 75};
		// ◎ 공회전을 방지하는 방법
		boolean flag = false;
		
		System.out.print("버블 정렬 전: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// ● 버블 정렬: 하나를 그 다음꺼랑 하나씩 비교하며 정렬
		for(int i=0; i<a.length-1; i++) { 
			flag = true; // ◎
			for(int j=0; j<a.length-1-i; j++) { // ● a.length-1-i
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					flag = false; // ◎ false는 바꿀 내용이 있다
				}
			}
			// ● 안쪽 for문이 끝난 지점에 flag 변수 두기
			if(flag == true) { // ◎ true는 더 이상 바꿀게 없다
				break;
			}
			
			System.out.printf("%3d회전 후: ", i+1);
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("버블 정렬 후: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
