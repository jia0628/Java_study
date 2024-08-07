
public class StringBufferTest03 {
	public static void main(String[] args) {
		String s1 = "ABC";
		s1 = s1.concat("DEF");
		System.out.println(s1);  //● 스스로를 늘리지 못하고 인스턴스 추가 생성
		
		StringBuffer sb1 = new StringBuffer("ABC");
		// 오버로딩 장면
//		sb1.append("DEF"); // append -> 붙인다
//		sb1.append(10);
//		sb1.append(3.14);
//		sb1.append(true);
		
		// 메서드 체이닝 장면
		sb1.append("DEF").append(10).append(3.14).append(true); 
		System.out.println(sb1); //● 스스로를 늘리면서 추가로 넣고 있다
		System.out.println("----------------");
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println("초기 용량: " + sb2.capacity()); // 초기 용량: 16글자
		System.out.println("초기 크기: " + sb2.length());   // 0
		System.out.println("----------------");
		
		sb2.append("Hello Java World!!");
		System.out.println("추가 후 용량: " + sb2.capacity()); // 34
		System.out.println("추가 후 크기: " + sb2.length());   // 18
		System.out.println("----------------");
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("초기 용량: " + sb3.capacity()); // 초기 용량: 10글자로 설정
		System.out.println("초기 크기: " + sb3.length());
		
	}
}
