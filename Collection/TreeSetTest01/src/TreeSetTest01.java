import java.util.TreeSet;
/*
	< TreeSet >
	- 데이터를 추가할 때 root node(맨 처음 넣은 값)을 기준으로 작은 것은 왼쪽, 큰 것은 오른쪽으로 추가하여 저장함.
	- 데이터를 읽을 때는 왼쪽 아래의 leaf node부터 오른쪽으로 차례대로 읽음.
	- 왼쪽부터 오름차순으로 데이터가 저장되어 있음.
	- 데이터가 저장된 모양이 나무의 모양과 흡사하여 Tree 구조가 됨.
	
	- 장점: 오름차순으로 정렬되어 여러 가지 방법으로 활용할 수 있음
	- 단점: 데이터를 추가할 때 (왼쪽, 오른쪽)비교를 하므로 추가시에 많은 시간이 소요됨.
	
*/

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 중복되지 않은 데이터 추가
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76); set.add(92); set.add(78); set.add(67);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// 중복된 데이터 추가 -> 허용하지 않음.
		set.add(97);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// 존재하는 데이터 삭제
		set.remove(82);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// 존재하지 않는 데이터 삭제 -> 에러는 아님.
		set.remove(90);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		
		////////////////////////////////////////////////////////
		//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
		TreeSet<String> set2 = new TreeSet<>();
		
		// 중복되지 않은 데이터 추가
		set2.add("박준우"); set2.add("유호진"); set2.add("달시오크"); set2.add("패트릭쿤"); set2.add("한설희"); set2.add("에덴"); set2.add("DK");
		System.out.println(set2);
		System.out.println("크기: " + set2.size());
		System.out.println("-----");
		
		// 중복된 데이터 추가 -> 허용하지 않음.
		set2.add("DK");
		System.out.println(set2);
		System.out.println("크기: " + set2.size());
		System.out.println("-----");
		
		// 존재하는 데이터 삭제
		set2.remove("DK");
		System.out.println(set2);
		System.out.println("크기: " + set2.size());
		System.out.println("-----");
		
		// 존재하지 않는 데이터  삭제 -> 에러는 아님.
		set2.remove("김현준");
		System.out.println(set2);
		System.out.println("크기: " + set2.size());
		System.out.println("-----");
		
		
	}
}
