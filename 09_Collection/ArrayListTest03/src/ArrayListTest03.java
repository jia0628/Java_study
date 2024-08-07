import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//● for문을 돌릴때 삭제, 추가는 배열의 뒤에서부터 돌려야 한다. (가변적인 배열이기 때문)
//● 하지만 변경은 배열의 위치가 뒤틀리지 않기 때문에 0부터 돌려도 상관 없다

public class ArrayListTest03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String[] magicioans = {"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"};
		
		// 데이터 추가
//		list = Arrays.asList("박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK");
		
		// 데이터 추가 (순차적)
		for(String s : magicioans) {
			list.add(s);
		}
		
		// 확인
		System.out.println(list);
		
		// 에릭첸을 유호진 다음에 추가 (비순차적)
//		list.add(2, "에릭첸");
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals("유호진")) {  //● == 은 문자열일때 안됨
				list.add(i, "에릭첸");
			}
		}
		
		System.out.println(list);
		
		// 한설희 삭제
//		list.remove(5);  // 인덱스로 삭제
//		list.remove("한설희");  //● 문자열일 때는 데이터로 삭제 가능, Integer일때는 안됨(이유: 값인지 인덱스인지 구분이 안감)
//		list.removeIf(x -> x.equals("한설희"));
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals("한설희")) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		// 에덴을 김현준으로 변경
//		list.set(5, "김현준");
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals("에덴")) {
				list.set(i, "김현준");
			}
		}
		System.out.println(list);
		System.out.println();
		
		// 오름차순 정렬
//		list.sort((x, y) -> x.compareTo(y));
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순 정렬
//		list.sort((x, y) -> y.compareTo(x));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println("----------------");
		
		// 리스트를 배열로 생성 - Object[] 배열
		Object[] names1 = list.toArray();
		System.out.println(Arrays.toString(names1));
		
		//★ 리스트를 배열로 생성 - String[] 배열 (원래의 데이터 타입)
		String[] names2 = list.toArray(new String[0]);  // 0~7개만큼 사용 가능(실제 크기)
		System.out.println(Arrays.toString(names2));
		
		// 리스트를 배열로 생성 - String[] 배열 (원래의 데이터 타입)
		String[] names3 = list.toArray(new String[10]);  // 실제 크기보다 크면 나머지 공간을 null로 채워준다
		System.out.println(Arrays.toString(names3));
		
		System.out.println();
		System.out.println("----출력 1번----");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		
		System.out.println("----출력 2번----");
		for(String s : list) {
			System.out.print(s + "  ");
		}
		System.out.println();
		
		System.out.println("----출력 3번----");
		list.forEach(x -> System.out.print(x + "  "));
		System.out.println();
		
		System.out.println("----출력 4번----");
		list.forEach(System.out::println);
		
	}
}
