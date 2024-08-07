import java.util.HashSet;

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class HashSetTest02 {
	public static void main(String[] args) {
		// 해시셋 생성
		HashSet<String> set = new HashSet<>();
		String[] names = {"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"};
		
		// 데이터 추가
		for(String s : names) {
			set.add(s);
		}
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복되지 않은 데이터 추가
		set.add("에릭첸");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복 데이터 추가 - 허용하지 않음.
		set.add("달시오크");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하는 데이터 삭제
		set.remove("에덴");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하지 않은 데이터 삭제 - 에러가 발생하지 않음.
		set.remove("김현준");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// ########### Set의 메서드 활용 ###########
		
		// 데이터의 포함 여부
		System.out.println(set.contains("달시오크"));  // true
		System.out.println(set.contains("에덴"));   // false
		
		// 셋 생성
		HashSet<String> set2 = new HashSet<>();
		set2.add("한설희"); set2.add("닥시앤"); set2.add("도기문");
		
		System.out.println(set2);
		System.out.println("크기: " + set2.size());
		
		
		HashSet<String> set3 = new HashSet<>();
		set3.add("한설희"); set3.add("박준우"); set3.add("유호진");
		
		System.out.println(set3);
		System.out.println("크기: " + set3.size());
		
		// 셋에서 다른 셋의 모든 데이터 포함 여부
		//● 해석: set안에 set2/set3가 다 있는가?
		System.out.println(set.containsAll(set2));  // false
		System.out.println(set.containsAll(set3));  // true
		System.out.println("----");
		
		System.out.println("set1: " + set);
		System.out.println("set2: " + set2);
		System.out.println("set3: " + set3);
		
		// 셋에 다른 셋의 모든 데이터를 추가 - 중복 데이터는 추가하지 않고, 새로운 데이터만 추가함
		set.addAll(set2); // 새로운 데이터만 추가함.
		System.out.println("set1: " + set);
//		System.out.println("set2: " + set2);
		
		set.addAll(set3); // 중복 데이터는 추가하지 않음.
		System.out.println("set1: " + set);
		
		// 셋의 모든 내용을 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
	}
}
