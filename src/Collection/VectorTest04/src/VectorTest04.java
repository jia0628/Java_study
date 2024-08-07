import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		// 초기 용량, 크기
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		System.out.println("-------");
		
		// 데이터 추가
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		
		// 데이터 추가
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		
		// 데이터 추가
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		
		// 데이터 추가
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		
		// 데이터 추가
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());
		
		// 낭비되는 용량을 크기와 같게 맞추어 주는 장면
		v.trimToSize();
		System.out.println("용량: " + v.capacity());
		System.out.println("크기: " + v.size());

	}
}
