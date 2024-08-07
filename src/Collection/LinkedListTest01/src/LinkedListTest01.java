import java.util.Iterator;
import java.util.LinkedList;


//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class LinkedListTest01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		// 리스트에 데이터를 추가 (순차적)
		list.add("박준우");
		list.add("유호진");
		list.add("달시오크");
		list.add("패트릭쿤");
		list.add("한설희");
		list.add("에덴");
		list.add("DK");
		System.out.println(list);
		
		// 패트릭쿤 다음에 에릭첸 추가(비순차적)
//		list.add(4, "에릭첸");
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals("패트릭쿤")) {
				list.add(i+1, "에릭첸");
			}
		}
		System.out.println(list);
		
		// 달시오크 삭제
//		list.remove(2);
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals("달시오크")) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// 에덴을 김현준으로 변경
//		list.set(5, "김현준");
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("에덴")) {
				list.set(i, "김현준");
			}
		}
		System.out.println(list);
		
		// 출력 1
		System.out.println("----출력 1번----");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + "  ");
		}
		System.out.println();
		
		// 출력 2
		System.out.println("----출력 2번----");
		for(String i : list) {
			System.out.println(i);
		}
		System.out.println();
		
		// 출력 3
		System.out.println("----출력 3번----");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + "  ");
		}
		System.out.println();
		
		// 출력 4
		System.out.println("----출력 4번----");
		list.forEach(x -> System.out.println(x));
		
		// 출력 5
		System.out.println("----출력 5번----");
		list.forEach(System.out::println);
		System.out.println();

	}
}
