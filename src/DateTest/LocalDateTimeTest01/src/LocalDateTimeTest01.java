import java.time.*;

/*
	LocalDate, LocalTime, LocalDateTime
		- 기존의 날짜 클래스의 단점을 개선하여 만든 클래스
		- 날짜와 시간에 대한 다양한 기능을 포함
		- Java 1.8 버전에서 도입
*/

public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		// 1. LocalDate - 인스턴스를 만들수가 없다
		// 시스템의 날짜를 획득
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		// 날짜를 직접 설정 - 1번 방법
		LocalDate d2 = LocalDate.of(2024, 7, 26);
		System.out.println(d2);
		// 날짜를 직접 설정 - 2번 방법
		LocalDate d3 = LocalDate.parse("2024-06-28");
		System.out.println(d3);
		
		// 년, 월, 일을 따로 가져옴
		int year = d3.getYear();
		int month = d3.getMonthValue(); // 월의 값은 1~12, 월에 대해서 보정이 필요없음.
		Month m = d3.getMonth(); // enum 타입
		int date = d3.getDayOfMonth();
		// 1:MONDAY, 2:TUESDAY, 3:WEDNESDAY, 4:THURSDAY, 5:FRIDAY, 6:SATURDAY, 7:SUNDAY
		DayOfWeek w = d3.getDayOfWeek();
		
		// 우리나라 요일로 변경
		String week = "";
		switch(w) {
		case MONDAY: week = "월"; break;
		case TUESDAY: week = "화"; break;
		case WEDNESDAY: week = "수"; break;
		case THURSDAY: week = "목"; break;
		case FRIDAY: week = "금"; break;
		case SATURDAY: week = "토"; break;
		case SUNDAY: week = "일"; break;
		}
		
		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, week);
		System.out.printf("%4d년 %s %2d일 %s\n", year, m, date, w);
		
		
		// 2. LocalTime 클래스
		// 시스템의 시간을 획득
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);  // 16:35:12.715
		
		// 시간을 설정 - 1번
		LocalTime t2 = LocalTime.of(18, 30, 35);
		System.out.println(t2);  // 18:30:35
		
		// 시간을 설정 - 2번 -> 인스턴스에 시간을 더하여 설정
		LocalTime t3 = t2.plusHours(3);
		System.out.println(t3);
		
		// 시간을 설정 - 3번 -> 인스턴스에 시간을 빼서 설정
		LocalTime t4 = t2.minusHours(3);
		System.out.println(t4);
		
		// 시간을 설정 - 4번 -> 타입존을 설정
		LocalTime t5 = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(t5);
		
		// 10-3승: millSecond, 10-6승: microSecond, 10-9승: nanoSecond
		int hour = t5.getHour();  // 24시간 기준
		int minute = t5.getMinute();
		int second = t5.getSecond();
		int nanoSecond = t5.getNano();  // nano second: 10억분의 1초(10-9승)
		System.out.printf("%02d시 %02d분 %02d초 %02d나노초\n", hour, minute, second, nanoSecond);
		
		
	}
}
