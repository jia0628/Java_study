import java.util.Calendar;

public class CalendarTest03 {
	
	// 날짜 출력 메서드
	public static void printDate(Calendar c) {
		System.out.printf("%4d년 %2d월 %2d일\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		// 2024년 7월 26일 설정
		//c.set(2024, 6, 26);  // 월은 1을 빼고 설정
		c.set(2024, Calendar.JULY, 26);
		
		// 날짜 정보를 출력 - 날짜의 모든 정보를 문자열로 출력
		//System.out.println(c.toString());
		
		// add(): 일, 월, 년도를 더하거나 뺄 때 사용, 날짜에 대한 보정을 자동으로 해주는 메서드
		System.out.println("-- 1일 후: ");
		c.add(Calendar.DATE, 1); // 일에 대한 월을 자동으로 보정
		printDate(c);
		
		System.out.println("-- 6개월 후: ");
		c.add(Calendar.MONTH, 6); // 월에 대한 년을 자동으로 보정
		printDate(c);
		
		System.out.println("-- 3개월 전: ");
		c.add(Calendar.MONTH, -3);
		printDate(c);
		
		// roll(): 해당하는 일, 월, 년만 변화 -> 일을 변경하면 일만 변경하고, 나머지는 자동으로 보정해주지 않는다
		// 40일 후
		System.out.println("-- 40일 후: ");
		c.roll(Calendar.DATE, 40);
		printDate(c);
		
		c.add(Calendar.DATE, 40);
		printDate(c);
	}
}
