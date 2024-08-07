import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
	1. 한영 사전을 HashMap으로 구현하시오. (키: 한글, 값: 영어) ex) 사과: apple
	2. 데이터를 10개 추가하시오.
	3. 키를 찾아서 데이터를 삭제하도록 구현하시오.
	4. 키에 대한 값을 수정하도록 구현하시오.
	5. 3가지 방법으로 출력하시오.
	
-> CRUD되는 Map 프로그램을 구현하시오.
	
*/
public class HashMapTest02 {
	public static void main(String[] args) {
		// 키: 한글(String), 값: 영어(String)
		HashMap<String, String> dict = new HashMap<>();

		// 데이터 추가
		dict.put("핑크", "Pink"); dict.put("빨강", "Red"); dict.put("파랑", "Blue"); dict.put("노랑", "Yellow"); dict.put("주황", "Orange");
		dict.put("초록", "Green"); dict.put("보라", "purple"); dict.put("코랄", "Coral"); dict.put("올리브", "Olive"); dict.put("흰색", "White");
		System.out.println("모든 데이터  -> " + dict);
		System.out.println("크기: " + dict.size());
		
		// 데이터 삭제
		dict.remove("주황");
		System.out.println("주황 데이터 삭제  -> " + dict);
		System.out.println("크기: " + dict.size());
//		System.out.println(dict.remove("주황"));  //● null을 리턴
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 단어를 입력하시오! : ");
		String word = sc.next();
		
		if(dict.remove(word) == null) {
			System.out.println("입력한 단어는 존재하지 않습니다.");
		} else {
			System.out.println(word + "단어가 삭제되었습니다.");
		}
		System.out.println();
		System.out.println("입력한 데이터 삭제: " + dict);
		System.out.println("크기: " + dict.size());
		
		sc.close();
		*/
		
		// 데이터 수정
		// 보라(키)에 대한 purple(값)을 -> Purple로 수정
		dict.put("보라", "Purple");
		System.out.println("보라 데이터 수정  -> " + dict);
		System.out.println("크기: " + dict.size());
		System.out.println();
		
		// 출력 1 - keySet(), Iterator
		System.out.println("-----출력 1-----");
		Set<String> key = dict.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String no = it.next();
			String name = dict.get(no); 
			System.out.printf("%s(%s)\n", no, name);
		}
		System.out.println();
		
		// 출력 2 - entrySet(), Map.Entry, Iterator
		System.out.println("-----출력 2-----");
		Set<Map.Entry<String, String>> set1 = dict.entrySet();
		Iterator<Map.Entry<String, String>> it2 = set1.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, String> entry = it2.next(); 
			String no = entry.getKey();    
			String name = entry.getValue(); 
			System.out.printf("%s(%s)\n", no, name);
		}
		System.out.println();
		
		// 출력 3 - entrySet(), Map.Entry, 확장for문
		System.out.println("----출력3----");
		Set<Map.Entry<String, String>> Set2 = dict.entrySet();
		for(Map.Entry<String, String> entry : Set2) { 
			String no = entry.getKey();
			String name = entry.getValue();
			System.out.printf("%s(%s)\n", no, name);
		}
		System.out.println();
		
	}
}
