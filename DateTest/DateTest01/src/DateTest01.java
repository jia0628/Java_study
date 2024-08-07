import java.util.Date;

// Date 클래스 - Java 1.0 버전부터 사용하던 초창기 클래스
// 데이터베이스와 호환성은 Date 클래스가 좋다
public class DateTest01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// 1. 시스템의 날짜와 시간을 획득하는 방법
		Date d = new Date();
		// deprecated -> 쇠퇴된, 한물간
		int year = d.getYear()+1900;   // 1900년부터 시작한 년도, 1900을 더해서 사용해야 함
		int month = d.getMonth()+1;    // 월은 0~11의 값, 1을 더해서 사용해야 함
		int date = d.getDate();
		System.out.printf("%4d년 %2d월 %2d일\n", year, month, date);
		
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.printf("%02d시 %02d분 %02d초\n", hour, minute, second);
		System.out.println("--------------");
		
		// 2. 날짜와 시간을 직접 설정하는 방법 - 1번
		Date d2 = new Date();
		d2.setYear(124);  // 1900을 빼고 설정
		d2.setMonth(6);   // 1을 빼고 설정
		d2.setDate(26);
		d2.setHours(17);
		d2.setMinutes(30);
		d2.setSeconds(40);
		System.out.printf("%4d년 %2d월 %2d일\n", d2.getYear()+1900, d2.getMonth()+1, d2.getDate());
		System.out.printf("%02d시 %02d분 %02d초\n", d2.getHours(), d2.getMinutes(), d2.getSeconds());
		System.out.println("--------------");
		
		// 2. 날짜와 시간을 직접 설정하는 방법 - 2번
		Date d3 = new Date(124, 6, 26, 17, 30, 40);
		
		System.out.printf("%4d년 %2d월 %2d일\n", d3.getYear()+1900, d3.getMonth()+1, d3.getDate());
		System.out.printf("%02d시 %02d분 %02d초\n", d3.getHours(), d3.getMinutes(), d3.getSeconds());
		System.out.println("--------------");
		
		
		
	}
}
