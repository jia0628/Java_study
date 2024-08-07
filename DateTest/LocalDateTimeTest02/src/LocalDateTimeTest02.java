import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest02 {
	public static void main(String[] args) {
		// LocalDateTime: LocalDate + LocalTime
		// 시스템의 날짜와 시간을 획득
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);
		
		// 날짜와 시간을 직접 설정 - 1번
		LocalDateTime now2 = LocalDateTime.of(2026, 7, 6, 17, 35, 40, 500);
		System.out.println(now2);
		
		// 날짜와 시간을 직접 설정 - 2번
		LocalDateTime now3 = LocalDateTime.parse("2026-06-28T11:30:04.248");
		System.out.println(now3);
		
		// 날짜와 시간을 직접 설정 - 3번
		LocalDateTime now4 = Year.of(2026).atMonth(2).atDay(26).atTime(18, 30, 50);
		System.out.println(now4);
		
		int year = now4.getYear();
		int month = now4.getMonthValue();
		int date = now4.getDayOfMonth();
		int hour = now4.getHour();
		int minute = now4.getMinute();
		int second = now4.getSecond();
		int nanoSecond = now4.getNano();
		
		System.out.printf("%4d년 %2d월 %2d일 %02d:%02d:%02d:%d\n", year, month, date, hour, minute, second, nanoSecond);
		System.out.println("----------------");
		
		// LocalDate, LocalTime, LocalDateTime 클래스의 출력 포맷을 설정하는 방법
		/*
			< 포맷 형식 >
			 yyyy: 년도 4자리, yy: 년도 2자리
			 MM: 월 2자리, M: 월 1자리
			 dd: 일 2자리, d: 일 1자리
			 HH: 24시간, hh: 12시간
			 mm: 분 2자리, m: 분 1자리
			 ss: 초 2자리, s: 초 1자리
			 a: 오전 또는 오후
			 E: 한글 1글자 요일
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd(E) a hh:mm:ss");
		System.out.println(now4.format(dtf));
		System.out.println(now4.format(dtf2));
	}
}
