import java.util.Calendar;
import static java.util.Calendar.*; // static import

// 열거형은 0번부터 1씩 증가하는 정수를 갖는다
// 문자열을 정수처럼 사용할 수 있는 방법
enum WEEK { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }  //● 문자열이지만 숫자로 쓰임, ""도 없다

public class EnumTest02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();  //● Calendar는 추상 클래스지만  특별하게 인스턴스를 만들기 위해 getInstance()메서드 사용.
		
		int year = cal.get(YEAR);
		int month = cal.get(Calendar.MONDAY) + 1; // 달: 0 ~ 11까지의 정수를 리턴
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일: 1 ~ 7까지의 상수를 리턴, 일요일이 1 & 토요일이 7
		System.out.printf("%4d년 %2d월 %2d일 (%d)요일", year, month, day, week);
		System.out.println();
		
		WEEK weekday = null;  // 열거형 상수
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: weekday = WEEK.SUNDAY; break; //● Calendar.SUNDAY == 1
		case Calendar.MONDAY: weekday = WEEK.MONDAY; break;
		case Calendar.TUESDAY: weekday = WEEK.TUESDAY; break;
		case Calendar.WEDNESDAY: weekday = WEEK.WEDNESDAY; break;
		case Calendar.THURSDAY: weekday = WEEK.THURSDAY; break;
		case Calendar.FRIDAY: weekday = WEEK.FRIDAY; break;
		case Calendar.SATURDAY: weekday = WEEK.SATURDAY; break; //● Calendar.SATURDAY = 7
		}
		System.out.printf("%4d년 %2d월 %2d일 %s", year, month, day, weekday);
		System.out.println();
	}
}
