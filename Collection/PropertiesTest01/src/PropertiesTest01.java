import java.util.Enumeration;
import java.util.Properties;

/*
	< Properties >
	- 키와 값이 모두 문자열을 갖는 문자열에 특화된 맵
	- <T>의 키워드를 사용하지 않음
	- 문자열에 특화된 HashMap이라고 생각하면 됨
	- 데이터의 순서가 없음 (입력한 순서대로 나오지 않음)
	
 */

//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
public class PropertiesTest01 {
	public static void main(String[] args) {
		// 키: 이름, 값: 직업
		Properties prop = new Properties();
		
		// 데이터 추가
		prop.setProperty("박준우", "경찰");
		prop.setProperty("유호진", "소방관");
		prop.setProperty("달시오크", "CEO");
		prop.setProperty("패트릭쿤", "모델");
		prop.setProperty("한설희", "공무원");
		prop.setProperty("에덴", "축구선수");
		prop.setProperty("DK", "의사");
		
		// 확인
		System.out.println(prop);
		System.out.println("사람 수: " + prop.size());
		
		// 키의 중복 - 허용하지 않음 -> 수정됨
		prop.setProperty("박준우", "셰프");
		System.out.println(prop);
		System.out.println("사람 수: " + prop.size());
		
		// 값의 중복 - 허용함 (추가)
		prop.setProperty("김현준", "공무원");
		System.out.println(prop);
		System.out.println("사람 수: " + prop.size());
		System.out.println();
		
		// 출력 1
		System.out.println("----출력1----");
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String job = prop.getProperty(name);
			System.out.println(name + " : " + job);
		}
		System.out.println();
		
		// 출력 2
		prop.list(System.out);
		System.out.println();
		
		// 출력 3
		System.out.println("----출력3----");
		prop.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

	}
}
