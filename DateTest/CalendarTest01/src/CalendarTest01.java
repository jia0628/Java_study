import java.util.Calendar;
/*
	 Calendar 클래스
		 - Date 클래스의 단점을 보완하고, 개선해서 성능을 향상시킨 클래스
		 - Java 1.1 버전부터 사용
		 - 추상 클래스, new를 사용해서 인스턴스 생성 불가, getInstance() 메서드를 사용
		 - Date에서 년도의 문제는 해결, 하지만 월의 문제는 해결하지 못함
 */
public class CalendarTest01 {
	public static void main(String[] args) {
		
		// 1. 시스템의 날짜를 직접 획득하는 방법
		//Calendar c = new Calendar();  // 추상 클래스이기 때문에 안됨.
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1; // 월은 0~11까지의 값, 1을 더해서 사용함
		int date = c.get(Calendar.DATE);
		
		// - 요일 확인
		// 1: 일, 2:월, 3:화, 4;수, 5:목, 6:금, 7:토
		int week = c.get(Calendar.DAY_OF_WEEK); //● 배열이 1부터 시작
		
		// 요일 계산 - 1번 방법
		String[] weekday = {"", "월", "월", "화", "수", "목", "금", "토"};
		
		// 요일 계산 - 2번 방법
		String wd = "";  //● 초기화를 시켜야 함
		switch(week) {
		case Calendar.SUNDAY: wd="일"; break;
		case Calendar.MONDAY: wd="월"; break;
		case Calendar.TUESDAY: wd="화"; break;
		case Calendar.WEDNESDAY: wd="수"; break;
		case Calendar.THURSDAY: wd="목"; break;
		case Calendar.FRIDAY: wd="금"; break;
		case Calendar.SATURDAY: wd="토"; break;
		}
		
		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, weekday[week]);
		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, wd);
		
		
		int hour = c.get(Calendar.HOUR);      // 12시간으로 계산
		//int hour = c.get(Calendar.HOUR_OF_DAY); // 24시간으로 계산
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millsecond = c.get(Calendar.MILLISECOND); // 1000분의 1초
		
		// - 오전, 오후 확인
		// 0: 오전, 1: 오후
		int ampm = c.get(Calendar.AM_PM);
		
		// 오전, 오후 계산 - 1번 방법
		String[] ap = {"오전", "오후"};
		
		// 오전, 오후 계산 - 2번 방법
		String ap2;
		if(ampm == Calendar.AM) {
			ap2 = "오전";
		} else {
			ap2 = "오후";
		}
		
		System.out.printf("%s %02d시 %02d분 %02d초 %03d밀리초\n", ap[ampm], hour, minute, second, millsecond);
		System.out.printf("%s %02d시 %02d분 %02d초 %03d밀리초\n", ap2, hour, minute, second, millsecond);
		System.out.println("------------------------");
		
		// 2. 날짜를 직접 설정하는 방법
		// 2024년 파리 올림픽 - 2024년 7월 26일 17시 35분 40초
		Calendar c2 = Calendar.getInstance();
		c2.set(2024, 6, 26, 17, 35, 40);
		
		year = c2.get(Calendar.YEAR);
		month = c2.get(Calendar.MONTH)+1;
		date = c2.get(Calendar.DATE);
		week = c2.get(Calendar.DAY_OF_WEEK);
		
		ampm = c2.get(Calendar.AM_PM);
		hour = c2.get(Calendar.HOUR);
		minute = c2.get(Calendar.MINUTE);
		second = c2.get(Calendar.SECOND);
		millsecond = c2.get(Calendar.MILLISECOND);

		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, weekday[week]);
		System.out.printf("%s %02d시 %02d분 %02d초 %03d밀리초\n", ap[ampm], hour, minute, second, millsecond);
		
	}
}
