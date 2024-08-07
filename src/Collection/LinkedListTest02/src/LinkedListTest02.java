import java.util.LinkedList;
/*
	● ArrayList의 단점을 보완하기 위해 LinkedList가 만들어짐
	-> ArrayList는 중간에 데이터를 추가하면 다 뒤로 밀리고, 삭제하면 앞으로 다 땡겨져야 한다(비효율적)
	
	 ArrayList의 장점: 순차적인 데이터 추가&삭제에는 효율적
	LinkedList의 장점: 중간에 데이터 추가&삭제에 효율적, 단점: 검색 속도가 느림, 메모리낭비도 심함
*/
public class LinkedListTest02 {
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
		
		// ### LinkedList 클래스에만 존재하는 메서드 ###
		
		// 첫번째 데이터로 에릭첸을 추가
		list.addFirst("에릭첸");
		//list.add(0, "에릭첸");
		System.out.println(list);
		
		// 마지막 데이터로 김현준을 추가
		list.addLast("김현준");
		//list.add("김현준");
		System.out.println(list);
		
		// 첫번째 데이터를 삭제
		list.removeFirst();
		//list.remove(list.size()-1);
		System.out.println(list);
		
		// 마지막 데이터를 삭제
		list.removeLast();
		//list.remove(0);
		System.out.println(list);
		
		// 첫번째 데이터 획득
		//System.out.println(list.getFirst());
		System.out.println(list.get(0));
		
		// 마지막 데이터 획득
		//System.out.println(list.getLast());
		System.out.println(list.get(list.size()-1));
		
	}
}
