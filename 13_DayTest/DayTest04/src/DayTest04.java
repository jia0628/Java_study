
class Day {
	// 인스턴스 변수
	private int year = 1; // 1 -> 초기값
	private int month = 1;
	private int date = 1;
	
	private String[] weekDay = {"일", "월", "화", "수", "목", "금", "토", "일"};
	
	// 디폴트 생성자 
	public Day() {
	}
	
	// 생성자
	public Day(int year) {
		this.year = year;
	}
	
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 생성자 오버로딩
	//★ 복사 생성자
	public Day(Day d) {  //● 임의의 매개변수 d
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	// getter
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getdate() {
		return this.date;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	// 날짜 설정 메서드(한번에 쓰기)
	//● 생성자는 마음대로 호출할 수없으니 대신 호출할 메서드 생성
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일 계산 메서드
	// 제라의 공식: 0~6 사이의 정수로 리턴
	// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
	public int dayOfWeek() { //● 요일은 배열이라 숫자로 나옴, 그래서 int
		int y = year;
		int m = month;
		int d = date;
		
		//● 크게 알아둘 필요 없는 부분
		if(m==1 || m==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	
	// 날짜 비교 메서드
	//● public 리턴타입 메서드명(매개변수) {
	public boolean equalDay(Day d) { //● 임의의 매개변수 d(위의 d랑 다름)
		return this.year==d.year && this.month==d.month && this.date==d.date; //● 멤버변수와 d.year=>day2의 year비교
	}
	
	// 출력 메서드 1번
	public void printDay() {
		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, weekDay[dayOfWeek()]);
	}
	
	// 출력 메서드 2번
	public String toString() {
		return String.format("%4d년 %2d월 %2d일 %s요일", year, month, date, weekDay[dayOfWeek()]);
	}
	
}

// 다양한 생성자의 활용 -> 생성자 오버로딩
public class DayTest04 {
	public static void main(String[] args) {
		Day day1 = new Day();
		Day day2 = new Day(2024);
		Day day3 = new Day(2025, 5);
		Day day4 = new Day(2025, 6, 21);
		//● 복사 생성자에 day4를 Day d의 매개변수로 받는다.
		Day day5 = new Day(day4);
		
		//day1.printDay();

		System.out.println(day1.toString());
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
		
	}
}
