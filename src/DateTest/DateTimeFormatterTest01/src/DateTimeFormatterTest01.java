import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		// LocalDate, LocalTime, LocalDateTime 클래스의 출력 포맷을 설정하는 방법
		/*
			< 포맷 형식 >
			 yyyy: 년도 4자리, yy: 년도 2자리
			 MM: 월 2자리, M: 월 1자리
			 dd: 일 2자리, d: 일 1자리
			 HH: 24시간, hh: 12시간
			 mm: 분 2자리, m: 분 1자리
			 ss: 초 2자리, s: 초 1자리, S: 나노초, 1개에서 9개까지 사용
			 a: 오전 또는 오후
			 E: 한글 1글자 요일
			 
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd(E) a hh:mm:ss.SSSSSSSSS");
		System.out.println(now.format(dtf));
		System.out.println(now.format(dtf2));
		
	}
}
